package repository;

import model.Plano;
import java.util.ArrayList;
import java.util.List;

public class PlanoRepository {
    private static int contadorId = 1;
    private List<Plano> planos = new ArrayList<>();

    public void addPlano(Plano plano) {
        plano.setPlanoId(contadorId++);
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