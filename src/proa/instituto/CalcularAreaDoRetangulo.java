package proa.instituto;
import java.util.Scanner;

public class CalcularAreaDoRetangulo {

    public static void main(String[] args) {
    //Declaração de variáveis
        Scanner in = new Scanner(System.in);
        int b, h, area;

        //Entrada
        System.out.println("Vamos calcular a área do retângulo");
        System.out.println("Primeiro, informe qual é a medida da base");
        b = in.nextInt();
        System.out.println("Agora informe a altura do retângulo");
        h = in.nextInt();

        //Processamento
        area= b * h;
        //Saída

        if(b == h) {
            System.out.println("O valor da área do seu quadrado é " + area);
        }
        else {
            System.out.println("O valor da área do seu retângulo é " + area);
        }

    }
}
