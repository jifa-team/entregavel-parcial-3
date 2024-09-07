package service;
import model.Pagamento;
import java.util.List;

public class PagamentoService {
    public void addPagamento(Pagamento pagamento) {
        // Logic to add Pagamento
    }

    public Pagamento getPagamentoById(int id) {
        // Logic to get Pagamento by ID
        return new Pagamento(id, null, 0, new java.util.Date());
    }

    public List<Pagamento> getAllPagamentos() {
        // Logic to get all Pagamentos
        return null;
    }
}