package model;

public class Paciente {
    private int pacienteId;
    private String cpf;
    private String nomePaciente;
    private Plano plano;

    public Paciente(int pacienteId, String cpf, String nomePaciente, Plano plano) {
        this.pacienteId = pacienteId;
        this.cpf = cpf;
        this.nomePaciente = nomePaciente;
        this.plano = plano;
    }

    // Getters and setters
    public int getPacienteId() { return pacienteId; }
    public void setPacienteId(int pacienteId) { this.pacienteId = pacienteId; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public String getNomePaciente() { return nomePaciente; }
    public void setNomePaciente(String nomePaciente) { this.nomePaciente = nomePaciente; }
    public Plano getPlano() { return plano; }
    public void setPlano(Plano plano) { this.plano = plano; }

    @Override
    public String toString() {
        return "Paciente{" +
                "pacienteId=" + pacienteId +
                ", cpf='" + cpf + '\'' +
                ", nomePaciente='" + nomePaciente + '\'' +
                ", plano=" + plano +
                '}';
    }
}
