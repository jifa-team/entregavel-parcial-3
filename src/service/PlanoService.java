package service;
import model.Plano;
import java.util.List;

public class PlanoService {
    public void addPlano(Plano plano) {
        planoRepository.addPlano(plano);
    }

    public Plano getPlanoById(int id) {
        return planoRepository.getPacienteById(id);
        return new Plano(id, "Nome Plano", "Descrição", "Cobertura", new java.util.Date(), new java.util.Date(), 0);
    }

    public List<Plano> getAllPlanos() {
        return planoRepository.getAllPlanos();
    }
}