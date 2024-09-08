package controller;

import model.Plano;
import service.PlanoService;
import java.util.List;

public class PlanoController {
    private final PlanoService planoService;

    public PlanoController(PlanoService planoService) {
        this.planoService = planoService;
    }

    public void addPlano(Plano plano) {
        planoService.addPlano(plano);
    }

    public Plano getPlanoById(int id) {
        return planoService.getPlanoById(id);
    }

    public List<Plano> getAllPlanos() {
        return planoService.getAllPlanos();
    }
}
