package app;

import controller.PacienteController;
import model.Paciente;
import repository.PacienteRepository;
import service.PacienteService;

public class Main {
    public static void main(String[] args) {
        // inicialização de repository, service e controller do paciente
        PacienteRepository pacienteRepository = new PacienteRepository();
        PacienteService pacienteService = new PacienteService(pacienteRepository);
        PacienteController pacienteController = new PacienteController(pacienteService);

        // adicionando na mão o paciente para depois validar os metodos para buscar por ID e Listar
        Paciente paciente1 = new Paciente(0, "12345678901", "João Silva", null);
        pacienteController.addPaciente(paciente1);

        // metodo para buscar pelo ID do paciente
        Paciente pacienteBuscado = pacienteController.getPacienteById(1);
        if (pacienteBuscado != null) {
            System.out.println("Paciente encontrado: " + pacienteBuscado.getNomePaciente());
        } else {
            System.out.println("Paciente não encontrado.");
        }

        // metodo para listar os pacientes
        for (Paciente paciente : pacienteController.getAllPacientes()) {
            System.out.println("Paciente: " + paciente.getNomePaciente() + " | CPF: " + paciente.getCpf());
        }
    }
}
