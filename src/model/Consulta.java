package model;

import java.util.Date;

public class Consulta {
    private int consultaId;
    private Date dataConsulta;
    private Paciente paciente;
    private Dentista dentista;
    private Consultorio consultorio;
    private double valorConsulta;
    private String descricaoConsulta;
    private StatusConsulta statusConsulta;

    public Consulta(int consultaId, Date dataConsulta, Paciente paciente, Dentista dentista, Consultorio consultorio,
                    double valorConsulta, String descricaoConsulta, StatusConsulta statusConsulta) {
        this.consultaId = consultaId;
        this.dataConsulta = dataConsulta;
        this.paciente = paciente;
        this.dentista = dentista;
        this.consultorio = consultorio;
        this.valorConsulta = valorConsulta;
        this.descricaoConsulta = descricaoConsulta;
        this.statusConsulta = statusConsulta;
    }

    // Getters and setters
    public int getConsultaId() { return consultaId; }
    public void setConsultaId(int consultaId) { this.consultaId = consultaId; }
    public Date getDataConsulta() { return dataConsulta; }
    public void setDataConsulta(Date dataConsulta) { this.dataConsulta = dataConsulta; }
    public Paciente getPaciente() { return paciente; }
    public void setPaciente(Paciente paciente) { this.paciente = paciente; }
    public Dentista getDentista() { return dentista; }
    public void setDentista(Dentista dentista) { this.dentista = dentista; }
    public Consultorio getConsultorio() { return consultorio; }
    public void setConsultorio(Consultorio consultorio) { this.consultorio = consultorio; }
    public double getValorConsulta() { return valorConsulta; }
    public void setValorConsulta(double valorConsulta) { this.valorConsulta = valorConsulta; }
    public String getDescricaoConsulta() { return descricaoConsulta; }
    public void setDescricaoConsulta(String descricaoConsulta) { this.descricaoConsulta = descricaoConsulta; }
    public StatusConsulta getStatusConsulta() { return statusConsulta; }
    public void setStatusConsulta(StatusConsulta statusConsulta) { this.statusConsulta = statusConsulta; }

    @Override
    public String toString() {
        return "Consulta{" +
                "consultaId=" + consultaId +
                ", dataConsulta=" + dataConsulta +
                ", paciente=" + paciente +
                ", dentista=" + dentista +
                ", consultorio=" + consultorio +
                ", valorConsulta=" + valorConsulta +
                ", descricaoConsulta='" + descricaoConsulta + '\'' +
                ", statusConsulta=" + statusConsulta +
                '}';
    }
}

