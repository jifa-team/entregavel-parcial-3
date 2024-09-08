package repository;

import model.Paciente;
import java.util.ArrayList;
import java.util.List;

public class PacienteRepository {
    private static int contadorId = 1;
    private List<Paciente> pacientes = new ArrayList<>();

    public void addPaciente(Paciente paciente) {
        paciente.setPacienteId(contadorId++);
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
