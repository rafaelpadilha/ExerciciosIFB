package negocio;

import java.util.Date;

public class Dependente {
   private String cpfEmpregado;
   private String nome;
   private String grauParentesco;
   private Date dataNascimento;

    public String getCpfEmpregado() {
        return cpfEmpregado;
    }

    public void setCpfEmpregado(String cpfEmpregado) {
        this.cpfEmpregado = cpfEmpregado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGrauParentesco() {
        return grauParentesco;
    }

    public void setGrauParentesco(String grauParentesco) {
        this.grauParentesco = grauParentesco;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
   
}
