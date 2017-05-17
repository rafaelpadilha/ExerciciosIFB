package folhadepagamento;
/**
 *
 * @author RAFAEL PADILHA
 */
public class Professor {
    String ctps;
    String nome;
    String formacao;
    ContraCheque pagameto;
    
    int dependentes;
    
    public void setPagamento(ContraCheque pag){
        this.pagameto=pag;
    }
    
    public ContraCheque getPagamento(){
        return pagameto;
    }
    
    public void setCTPS(String ctps){
        this.ctps=ctps;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public void setFormacao(String formacao){
        this.formacao=formacao;
    }
    
    public void setDependentes(int dp){
        this.dependentes=dp;
    }
    
    public String getCtps(){
        return this.ctps;
    }
    public String getNome(){
        return this.nome;
    }
    public String getFormacao(){
        return this.formacao;
    }
    
    public int getDependetes(){
        return dependentes;
    }
}
