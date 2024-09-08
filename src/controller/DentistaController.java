package controller;

import service.DentistaService;
import model.Dentista;
import java.util.List;

public class DentistaController {
    private final DentistaService dentistaService;

    public DentistaController(DentistaService dentistaService) {
        this.dentistaService = dentistaService;
    }

    public void addDentista(Dentista dentista) {
        dentistaService.addDentista(dentista);
    }

    public Dentista getDentistaById(int id) {
        return dentistaService.getDentistaById(id);
    }

    public List<Dentista> getAllDentistas() {
        return dentistaService.getAllDentistas();
    }
}
