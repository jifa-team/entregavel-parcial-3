package model;

import java.util.Date;

public class Plano {
    private int planoId;
    private String nomePlano;
    private String descricao;
    private String cobertura;
    private Date vigenciaInicio;
    private Date vigenciaFim;
    private double valorMensal;

    public Plano(int planoId, String nomePlano, String descricao, String cobertura, Date vigenciaInicio,
                 Date vigenciaFim, double valorMensal) {
        this.planoId = planoId;
        this.nomePlano = nomePlano;
        this.descricao = descricao;
        this.cobertura = cobertura;
        this.vigenciaInicio = vigenciaInicio;
        this.vigenciaFim = vigenciaFim;
        this.valorMensal = valorMensal;
    }

    // Getters and setters
    public int getPlanoId() { return planoId; }
    public void setPlanoId(int planoId) { this.planoId = planoId; }
    public String getNomePlano() { return nomePlano; }
    public void setNomePlano(String nomePlano) { this.nomePlano = nomePlano; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public String getCobertura() { return cobertura; }
    public void setCobertura(String cobertura) { this.cobertura = cobertura; }
    public Date getVigenciaInicio() { return vigenciaInicio; }
    public void setVigenciaInicio(Date vigenciaInicio) { this.vigenciaInicio = vigenciaInicio; }
    public Date getVigenciaFim() { return vigenciaFim; }
    public void setVigenciaFim(Date vigenciaFim) { this.vigenciaFim = vigenciaFim; }
    public double getValorMensal() { return valorMensal; }
    public void setValorMensal(double valorMensal) { this.valorMensal = valorMensal; }

    @Override
    public String toString() {
        return "Plano{" +
                "planoId=" + planoId +
                ", nomePlano='" + nomePlano + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cobertura='" + cobertura + '\'' +
                ", vigenciaInicio=" + vigenciaInicio +
                ", vigenciaFim=" + vigenciaFim +
                ", valorMensal=" + valorMensal +
                '}';
    }
}

