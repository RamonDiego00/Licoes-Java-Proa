package proa.instituto;
import java.util.Scanner;

public class Cavalo {

    public static void main(String[] args) {
        //Declaração de variáveis
        Scanner in = new Scanner(System.in);
        int cavalos;
        double ferraduras = 9.90;

        //Entrada
        System.out.println("Quantos Cavalos você tem?");
        cavalos = in.nextInt();

        //Processamento
        double valor = ferraduras * 4 * cavalos;
        //Saida
        System.out.println("Então você vai pagar "+ valor + "R$ nas ferraduras");
    }

    }