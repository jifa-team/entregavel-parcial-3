package controller;
import service.PacienteService;
import model.Paciente;
import java.util.List;

public class PacienteController {
    private PacienteService pacienteService;

    public PacienteController() {
        this.pacienteService = new PacienteService();
    }

    public void addPaciente(Paciente paciente) {
        pacienteService.addPaciente(paciente);
    }

    public Paciente getPacienteById(int id) {
        return pacienteService.getPacienteById(id);
    }

    public List<Paciente> getAllPacientes() {
        return pacienteService.getAllPacientes();
    }
}

