package repository;

import model.Consulta;
import java.util.ArrayList;
import java.util.List;

public class ConsultaRepository {
    private List<Consulta> consultas = new ArrayList<>();

    public void addConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public Consulta getConsultaById(int id) {
        for (Consulta consulta : consultas) {
            if (consulta.getConsultaId() == id) {
                return consulta;
            }
        }
        return null;
    }

    public List<Consulta> getAllConsultas() {
        return consultas;
    }
}