package model;

import java.util.Date;

public class Consultorio {
    private int consultorioId;
    private String nomeConsultorio;
    private Dentista dentista;
    private String historicoConsultas;
    private String telefone;
    private Date dataFuncionamento;

    public Consultorio(int consultorioId, String nomeConsultorio, Dentista dentista, String historicoConsultas,
                       String telefone, Date dataFuncionamento) {
        this.consultorioId = consultorioId;
        this.nomeConsultorio = nomeConsultorio;
        this.dentista = dentista;
        this.historicoConsultas = historicoConsultas;
        this.telefone = telefone;
        this.dataFuncionamento = dataFuncionamento;
    }

    // Getters and setters
    public int getConsultorioId() { return consultorioId; }
    public void setConsultorioId(int consultorioId) { this.consultorioId = consultorioId; }
    public String getNomeConsultorio() { return nomeConsultorio; }
    public void setNomeConsultorio(String nomeConsultorio) { this.nomeConsultorio = nomeConsultorio; }
    public Dentista getDentista() { return dentista; }
    public void setDentista(Dentista dentista) { this.dentista = dentista; }
    public String getHistoricoConsultas() { return historicoConsultas; }
    public void setHistoricoConsultas(String historicoConsultas) { this.historicoConsultas = historicoConsultas; }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public Date getDataFuncionamento() { return dataFuncionamento; }
    public void setDataFuncionamento(Date dataFuncionamento) { this.dataFuncionamento = dataFuncionamento; }

    @Override
    public String toString() {
        return "Consultorio{" +
                "consultorioId=" + consultorioId +
                ", nomeConsultorio='" + nomeConsultorio + '\'' +
                ", dentista=" + dentista +
                ", historicoConsultas='" + historicoConsultas + '\'' +
                ", telefone='" + telefone + '\'' +
                ", dataFuncionamento=" + dataFuncionamento +
                '}';
    }
}

