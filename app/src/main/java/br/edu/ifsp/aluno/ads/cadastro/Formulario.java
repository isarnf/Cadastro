package br.edu.ifsp.aluno.ads.cadastro;

public class Formulario {
    private String nomeCompleto;
    private String telefone;
    private String email;
    private String cidade;
    private String ingressarListaEmail;
    private String sexo;
    private String uf;

    public Formulario(String nomeCompleto, String telefone, String email, String cidade, String ingressarListaEmail, String sexo, String uf) {
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
        this.email = email;
        this.cidade = cidade;
        this.ingressarListaEmail = ingressarListaEmail;
        this.sexo = sexo;
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Nome Completo: " + nomeCompleto + ", telefone: " + telefone + ", e-mail: " + email +
                ", cidade: " + cidade + ", Lista de e-mail?: " + ingressarListaEmail + ", sexo: " + sexo +
                ", UF: " + uf;
    }
}
