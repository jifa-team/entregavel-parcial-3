package repository;

import java.util.ArrayList;
import java.util.List;

import model.Dentista;

public class DentistaRepository {
    private static int contadorId = 1;
    private List<Dentista> dentistas = new ArrayList<>();

    public void addDentista(Dentista dentista) {
        dentista.setDentistaId(contadorId++);
        dentistas.add(dentista);
    }

    public Dentista getDentistaById(int id) {
        for (Dentista dentista : dentistas) {
            if (dentista.getDentistaId() == id) {
                return dentista;
            }
        }
        return null;
    }

    public List<Dentista> getAllDentistas() {
        return dentistas;
    }
}
