package repository;

import model.Pagamento;
import java.util.ArrayList;
import java.util.List;

public class PagamentoRepository {
    private List<Pagamento> pagamentos = new ArrayList<>();

    public void addPagamento(Pagamento pagamento) {
        pagamentos.add(pagamento);
    }

    public Pagamento getPagamentoById(int id) {
        for (Pagamento pagamento : pagamentos) {
            if (pagamento.getPagamentoId() == id) {
                return pagamento;
            }
        }
        return null;
    }

    public List<Pagamento> getAllPagamentos() {
        return pagamentos;
    }
}
