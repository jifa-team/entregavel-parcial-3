package model;

import java.util.Date;

public class Pagamento {
    private int pagamentoId;
    private Paciente paciente;
    private double valor;
    private Date dataPagamento;

    public Pagamento(int pagamentoId, Paciente paciente, double valor, Date dataPagamento) {
        this.pagamentoId = pagamentoId;
        this.paciente = paciente;
        this.valor = valor;
        this.dataPagamento = dataPagamento;
    }

    // Getters and setters
    public int getPagamentoId() { return pagamentoId; }
    public void setPagamentoId(int pagamentoId) { this.pagamentoId = pagamentoId; }
    public Paciente getPaciente() { return paciente; }
    public void setPaciente(Paciente paciente) { this.paciente = paciente; }
    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }
    public Date getDataPagamento() { return dataPagamento; }
    public void setDataPagamento(Date dataPagamento) { this.dataPagamento = dataPagamento; }

    @Override
    public String toString() {
        return "Pagamento{" +
                "pagamentoId=" + pagamentoId +
                ", paciente=" + paciente +
                ", valor=" + valor +
                ", dataPagamento=" + dataPagamento +
                '}';
    }
}
