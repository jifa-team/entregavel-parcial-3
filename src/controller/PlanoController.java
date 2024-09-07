package controller;
import model.Plano;
import service.PlanoService;
import java.util.List;

public class PlanoController {
    private PlanoService planoService;

    public PlanoController() {
        this.planoService = new PlanoService();
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
