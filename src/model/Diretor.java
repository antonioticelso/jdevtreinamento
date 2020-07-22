package model;

import abstracts.Pessoa;
import interfaces.PermitirAcesso;

public class Diretor extends Pessoa implements PermitirAcesso {

    private String registroEducacao;
    private int tempoDirecao;
    private String titulacao;

    private String login;
    private String senha;

    public Diretor() {}
    public Diretor(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getRegistroEducacao() {
        return registroEducacao;
    }

    public void setRegistroEducacao(String registroEducacao) {
        this.registroEducacao = registroEducacao;
    }

    public int getTempoDirecao() {
        return tempoDirecao;
    }

    public void setTempoDirecao(int tempoDirecao) {
        this.tempoDirecao = tempoDirecao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public double salario() {
        return 5600.00;
    }

    @Override
    public boolean autenticar(String login, String senha) {
        this.login = login;
        this.senha = senha;
        return autenticar();

    }

    @Override
    public boolean autenticar() {
        return login.equalsIgnoreCase("admin") &&
                senha.equalsIgnoreCase("admin");
    }

}


