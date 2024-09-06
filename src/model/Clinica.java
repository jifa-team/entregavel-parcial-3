package model;

public class Clinica {
    private int clinicaId;
    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;
    private String endereco;
    private String telefone;
    private String email;
    private int registroConselho;
    private Plano plano;

    public Clinica(int clinicaId, String cnpj, String razaoSocial, String nomeFantasia, String endereco,
                   String telefone, String email, int registroConselho, Plano plano) {
        this.clinicaId = clinicaId;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.registroConselho = registroConselho;
        this.plano = plano;
    }

    // Getters and setters
    public int getClinicaId() { return clinicaId; }
    public void setClinicaId(int clinicaId) { this.clinicaId = clinicaId; }
    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }
    public String getRazaoSocial() { return razaoSocial; }
    public void setRazaoSocial(String razaoSocial) { this.razaoSocial = razaoSocial; }
    public String getNomeFantasia() { return nomeFantasia; }
    public void setNomeFantasia(String nomeFantasia) { this.nomeFantasia = nomeFantasia; }
    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public int getRegistroConselho() { return registroConselho; }
    public void setRegistroConselho(int registroConselho) { this.registroConselho = registroConselho; }
    public Plano getPlano() { return plano; }
    public void setPlano(Plano plano) { this.plano = plano; }

    @Override
    public String toString() {
        return "Clinica{" +
                "clinicaId=" + clinicaId +
                ", cnpj='" + cnpj + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", nomeFantasia='" + nomeFantasia + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", registroConselho=" + registroConselho +
                ", plano=" + plano +
                '}';
    }
}

