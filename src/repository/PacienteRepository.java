package repository;

import model.Paciente;
import java.util.ArrayList;
import java.util.List;

public class PacienteRepository {
    private List<Paciente> pacientes = new ArrayList<>();

    public void addPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public Paciente getPacienteById(int id) {
        for (Paciente paciente : pacientes) {
            if (paciente.getPacienteId() == id) {
                return paciente;
            }
        }
        return null;
    }

    public List<Paciente> getAllPacientes() {
        return pacientes;
    }
}

