package service;

import model.Consulta;
import repository.ConsultaRepository;
import java.util.List;

public class ConsultaService {
    private ConsultaRepository consultaRepository;


    public ConsultaService(ConsultaRepository consultaRepository) {
        this.consultaRepository = consultaRepository;
    }


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