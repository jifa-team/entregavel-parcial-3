package service;

import model.Dentista;
import repository.DentistaRepository;
import java.util.List;

public class DentistaService {
    private final DentistaRepository dentistaRepository;

    public DentistaService(DentistaRepository dentistaRepository) {
        this.dentistaRepository = dentistaRepository;
    }

    public void addDentista(Dentista dentista) {
        dentistaRepository.addDentista(dentista);
    }

    public Dentista getDentistaById(int id) {
        return dentistaRepository.getDentistaById(id);
    }

    public List<Dentista> getAllDentistas() {
        return dentistaRepository.getAllDentistas();
    }
}
