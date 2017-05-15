import folhadepagamento.ContraCheque;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author RAFAEL PADILHA
 */
public class Faculdade {

    public static void main(String[] Args) {
        
        ArrayList<ContraCheque> pagamentos = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        String opt = null;
        do//entrada
        {
            ContraCheque pg = new ContraCheque();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("#Dados do professor#");

            System.out.println("Nome:");
            pg.setNome(entrada.nextLine());
            System.out.println("CTPS:");
            pg.setCTPS(entrada.nextLine());
            System.out.println("Formacao:");
            pg.setFormacao(entrada.nextLine());
            System.out.println("Quantidade de dependentes: ");
            pg.setDependentes(entrada.nextInt());

            System.out.println("Valor da hora aula:");
            pg.setValorHorasAula(entrada.nextDouble());
            System.out.println("Quantidade de horas por semana:");
            pg.setQtdHorasSemana(entrada.nextInt());
            System.out.println("Quantidade de horas noturnas por semana:");
            pg.setQtdHorasNoturnas(entrada.nextInt());

            pagamentos.add(pg);
            System.out.println("Deseja adicionar mais dados?(sim/nao)");
            opt=entrada.next();
            entrada.nextLine();

        } while ("sim".equals(opt));

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n##CONTRA-CHEQUE##");
        //saida
        for (int c = 0; c < pagamentos.size(); c++) {
            ContraCheque pg = new ContraCheque();
            pg = pagamentos.get(c);
            System.out.println("#Dados do Professor#");
            System.out.println("Nome: " + pg.getNome());
            System.out.println("CTPS: " + pg.getCtps());
            System.out.println("Formacao: " + pg.getFormacao());
            System.out.println("Salario Base: " + pg.calcular_SalarioBase());
            System.out.println("Descanso Semanal Remunerado: " + pg.calcular_SalarioBase() * 0.167);
            System.out.println("Acordo Coletivo de Trabalho: " + pg.calcular_SalarioBase() * 0.021);
            System.out.println("Adicional Noturno: " + pg.getValorHoraAula() * pg.getQtdHorasNoturnas() * 0.02);
            System.out.println("Desconto do INSS: " + pg.calcular_descontoINSS());
            System.out.println("Desconto de IRPF: " + pg.calcular_descontoIRPF());
            System.out.println("Desconto de Seguro de Vida: " + pg.calcular_SalarioBase() * 0.02);
            System.out.println("Salario Bruto: " + pg.calcular_RendaBruta());
            System.out.println("Salario base para INSS: " + (pg.calcular_RendaBruta() - pg.calcular_descontoINSS()));
            System.out.println("Salario base para IRPF: " + pg.calcular_salarioIRPF());
            System.out.println("Valor do FGTS: " + pg.calcular_FGTS());
            System.out.println("Salário líquido: " + pg.calcular_SalarioLiquido());
            System.out.println("########################################################################################");
        }

    }

}
