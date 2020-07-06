package thread;

import jdk.jfr.DataAmount;

import java.util.Objects;

public class ObjectFilaThread {

    private String nome;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectFilaThread that = (ObjectFilaThread) o;
        return nome.equals(that.nome) &&
                email.equals(that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email);
    }
}
