package folhadepagamento;

/**
 *
 * @author RAFAEL PADILHA
 */
public class ContraCheque extends Professor {

    private double valor_HoraAula;
    private int qtd_HoraAulaSemanal;
    private int qtd_HANoturno;

    public void setValorHorasAula(double vlr) {
        this.valor_HoraAula = vlr;
    }

    public void setQtdHorasSemana(int qtd) {
        this.qtd_HoraAulaSemanal = qtd;
    }

    public void setQtdHorasNoturnas(int qtd) {
        this.qtd_HANoturno = qtd;
    }

    public double getValorHoraAula() {
        return this.valor_HoraAula;
    }

    public int getQtdHorasSemana() {
        return this.qtd_HoraAulaSemanal;
    }

    public int getQtdHorasNoturnas() {
        return qtd_HANoturno;
    }

    public double calcular_SalarioBase() {
        return this.valor_HoraAula * this.qtd_HoraAulaSemanal * 4.5;
    }

    public double calcular_RendaBruta() {
        double sb = calcular_SalarioBase();
        return sb + sb * 0.167 + sb * 0.021 + this.valor_HoraAula * this.qtd_HANoturno * 0.2;
    }

    public double calcular_descontoINSS() {
        double rb = calcular_RendaBruta();
        if (rb > 0.0 && rb <= 1556.94) {
            return rb * 0.08;
        } else if (rb >= 1556.95 && rb <= 2594.92) {
            return rb * 0.09;
        } else if (rb >= 2594.93) {
            return rb * 0.11;
        }
        return 0;
    }

    public double calcular_salarioIRPF() {
        return calcular_RendaBruta() - calcular_descontoINSS() - this.dependentes * 189.59;
    }

    public double calcular_descontoIRPF() {
        double salario = calcular_salarioIRPF();
        if (salario <= 1903.98) {
            return salario;
        } else if (salario >= 1903.99 && salario <= 2826.65) {
            return salario * 0.075 - 142.80;
        } else if (salario >= 2826.66  && salario <= 3751.05){
            return salario * 0.15 - 354.80;
        } else if (salario >= 3751.06  && salario <= 4664.68){
            return salario * 0.225 - 636.13;
        } else if (salario >= 4664.68){
            return salario * 0.275 - 869.36;
        }
        return 0;
    }

    public double calcular_SVC() {
        return calcular_SalarioBase() * 0.02;
    }

    public double calcular_FGTS() {
        return calcular_RendaBruta() * 0.08;
    }

    public double calcular_SalarioLiquido() {
        return calcular_RendaBruta() - calcular_descontoINSS() - calcular_descontoIRPF() - calcular_SVC();
    }
    
    public void clear(){
        this.ctps=null;
        this.dependentes=0;
        this.formacao=null;
        this.nome=null;
        this.qtd_HANoturno=0;
        this.qtd_HoraAulaSemanal=0;
        this.valor_HoraAula=0.0;
    }

}
