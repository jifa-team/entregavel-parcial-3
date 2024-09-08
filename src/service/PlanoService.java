package service;

import model.Plano;
import repository.PlanoRepository;
import java.util.List;

public class PlanoService {
    private final PlanoRepository planoRepository;

    public PlanoService(PlanoRepository planoRepository) {
        this.planoRepository = planoRepository;
    }

    public void addPlano(Plano plano) {
        planoRepository.addPlano(plano);
    }

    public Plano getPlanoById(int id) {
        return planoRepository.getPlanoById(id);
    }

    public List<Plano> getAllPlanos() {
        return planoRepository.getAllPlanos();
    }
}