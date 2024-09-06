package model;

public class Dentista {
    private int dentistaId;
    private String numeroCro;
    private String nomeDentista;
    private String especializacao;
    private String certificacao;
    private String email;
    private String telefone;
    private Clinica clinica;
    private Consultorio consultorio;

    public Dentista(int dentistaId, String numeroCro, String nomeDentista, String especializacao, String certificacao,
                    String email, String telefone, Clinica clinica, Consultorio consultorio) {
        this.dentistaId = dentistaId;
        this.numeroCro = numeroCro;
        this.nomeDentista = nomeDentista;
        this.especializacao = especializacao;
        this.certificacao = certificacao;
        this.email = email;
        this.telefone = telefone;
        this.clinica = clinica;
        this.consultorio = consultorio;
    }

    // Getters and setters
    public int getDentistaId() { return dentistaId; }
    public void setDentistaId(int dentistaId) { this.dentistaId = dentistaId; }
    public String getNumeroCro() { return numeroCro; }
    public void setNumeroCro(String numeroCro) { this.numeroCro = numeroCro; }
    public String getNomeDentista() { return nomeDentista; }
    public void setNomeDentista(String nomeDentista) { this.nomeDentista = nomeDentista; }
    public String getEspecializacao() { return especializacao; }
    public void setEspecializacao(String especializacao) { this.especializacao = especializacao; }
    public String getCertificacao() { return certificacao; }
    public void setCertificacao(String certificacao) { this.certificacao = certificacao; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public Clinica getClinica() { return clinica; }
    public void setClinica(Clinica clinica) { this.clinica = clinica; }
    public Consultorio getConsultorio() { return consultorio; }
    public void setConsultorio(Consultorio consultorio) { this.consultorio = consultorio; }

    @Override
    public String toString() {
        return "Dentista{" +
                "dentistaId=" + dentistaId +
                ", numeroCro='" + numeroCro + '\'' +
                ", nomeDentista='" + nomeDentista + '\'' +
                ", especializacao='" + especializacao + '\'' +
                ", certificacao='" + certificacao + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", clinica=" + clinica +
                ", consultorio=" + consultorio +
                '}';
    }
}

