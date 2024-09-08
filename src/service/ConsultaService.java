package service;

import model.Consulta;
import repository.ConsultaRepository;
import java.util.List;

public class ConsultaService {
    private final ConsultaRepository consultaRepository = new ConsultaRepository();

    public void addConsulta(Consulta consulta) {
        consultaRepository.addConsulta(consulta);
    }

    public Consulta getConsultaById(int id) {
        return consultaRepository.getConsultaById(id);
    }

    public List<Consulta> getAllConsultas() {
        return consultaRepository.getAllConsultas();
    }
}