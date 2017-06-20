import java.io.*;
import java.util.Scanner;

/**
 *
 * @author RAFAEL PADILHA
 */
public class Exercicio2 {

    public static void main(String[] args) throws IOException {
        String nomeFx1, nomeFx2, s,s2;
        
        BufferedReader f1 = null;

        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o nome do arquivo que deseja traduzir:");
        nomeFx1 = entrada.nextLine();

        try {
            f1 = new BufferedReader(new FileReader(nomeFx1));
        } catch (Exception e) {
            System.err.println(e);
        }
        s = f1.readLine();
        while (s != null) {
            s2 = s.toLowerCase().replaceAll("r", "");
            s = s2.toLowerCase().replaceAll("l", "u");
            System.out.println(s);
            s = f1.readLine();
        }
        // fechar o Arquivo
        f1.close();
    }
}
