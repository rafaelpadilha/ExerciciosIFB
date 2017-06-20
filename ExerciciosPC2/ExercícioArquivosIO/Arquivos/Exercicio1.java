import java.io.*;
import java.util.Scanner;

/**
 *
 * @author RAFAEL PADILHA
 */
public class Exercicio1 {

    public static void main(String[] args) throws IOException {
        String nomeFx1, nomeFx2, s;
        int nota;
        BufferedReader f1 = null; //descritor do Arquivo de entrada
        BufferedWriter f2 = null; //descritor dos Arquivo de saída

        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o nome do arquivo de entrada:");
        nomeFx1 = entrada.nextLine();
        
        System.out.print("Digite o nome do arquivo de saida:");
        nomeFx2 = entrada.nextLine();

        try {
            f1 = new BufferedReader(new FileReader(nomeFx1));
            f2 = new BufferedWriter(new FileWriter(nomeFx2));
        } catch (Exception e) {
            System.err.println(e);
        }
        System.out.println("Informe a nota de programacao 2 dos alunos :");
        s = f1.readLine(); 
        while (s != null) { 
            System.out.print(s + ":"); 
            nota = entrada.nextInt();
            f2.write(s + " " +nota);
            f2.newLine();
            s = f1.readLine();
        }
        // fechar o Arquivo
        f1.close();
        f2.flush();
        f2.close();
    }

}
