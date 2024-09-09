package service;

import model.Pagamento;
import repository.PagamentoRepository;
import java.util.List;

public class PagamentoService {
    private final PagamentoRepository pagamentoRepository = new PagamentoRepository();

    public void addPagamento(Pagamento pagamento) {
        pagamentoRepository.addPagamento(pagamento);
    }

    public Pagamento getPagamentoById(int id) {
        return pagamentoRepository.getPagamentoById(id);
    }

    public List<Pagamento> getAllPagamentos() {
        return pagamentoRepository.getAllPagamentos();
    }

}