package repository;

import model.Plano;
import java.util.ArrayList;
import java.util.List;

public class PlanoRepository {
    private List<Plano> planos = new ArrayList<>();

    public void addPlano(Plano plano) {
        planos.add(plano);
    }

    public Plano getPlanoById(int id) {
        for (Plano plano : planos) {
            if (plano.getPlanoId() == id) {
                return plano;
            }
        }
        return null;
    }

    public List<Plano> getAllPlanos() {
        return planos;
    }
}