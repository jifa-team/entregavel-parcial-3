package controller;
import service.ConsultaService;
import model.Consulta;
import java.util.List;

public class ConsultaController {
    private ConsultaService consultaService;

    public ConsultaController() {
        this.consultaService = new ConsultaService();
    }

    public void addConsulta(Consulta consulta) {
        consultaService.addConsulta(consulta);
    }

    public Consulta getConsultaById(int id) {
        return consultaService.getConsultaById(id);
    }

    public List<Consulta> getAllConsultas() {
        return consultaService.getAllConsultas();
    }
}
