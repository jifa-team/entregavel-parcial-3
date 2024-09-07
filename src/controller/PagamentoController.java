package controller;
import model.Pagamento;
import service.PagamentoService;
import java.util.List;

public class PagamentoController {
    private PagamentoService pagamentoService;

    public PagamentoController() {
        this.pagamentoService = new PagamentoService();
    }

    public void addPagamento(Pagamento pagamento) {
        pagamentoService.addPagamento(pagamento);
    }

    public Pagamento getPagamentoById(int id) {
        return pagamentoService.getPagamentoById(id);
    }

    public List<Pagamento> getAllPagamentos() {
        return pagamentoService.getAllPagamentos();
    }
}