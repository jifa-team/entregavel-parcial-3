package service;
import model.Pagamento;
import java.util.List;

public class PagamentoService {
    public void addPagamento(Pagamento pagamento) {
        pagamentoRepository.addPagamento(pagamento);
    }

    public Pagamento getPagamentoById(int id) {
        // Logic to get Pagamento by ID
        return pagamentoRepository.getPagamentoById(id);
    }

    public List<Pagamento> getAllPagamentos() {
        // Logic to get all Pagamentos
        return pagamentoRepository.getAllPagamentos();

    }
}