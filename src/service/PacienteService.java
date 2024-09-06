package service;

import model.Paciente;
import repository.PacienteRepository;
import java.util.List;

public class PacienteService {
    private final PacienteRepository pacienteRepository = new PacienteRepository();
    public void addPaciente(Paciente paciente) {
        pacienteRepository.addPaciente(paciente);
    }

    public Paciente getPacienteById(int id) {
        return pacienteRepository.getPacienteById(id);
    }

    public List<Paciente> getAllPacientes() {
        return pacienteRepository.getAllPacientes();
    }
}
