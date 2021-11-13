package proa.instituto;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        //Declaração de variáveis
        Scanner in = new Scanner(System.in);
        int num;
        int um = 1;
        int dois = 2;
        int tres = 3;
        int quatro = 4;
        int cinco = 5;
        int seis = 6;
        int sete = 7;
        int oito = 8;
        int nove = 9;
        int dez = 10;
        //Entrada
        System.out.println("Digite um número para mostrarmos a tabuada dele");
        num = in.nextInt();
        //Processamento

        //Saida
        System.out.println("A tabuada desse valor é: ");
        System.out.println( num * um);
        System.out.println( num * dois);
        System.out.println( num * tres);
        System.out.println( num * quatro);
        System.out.println( num * cinco);
        System.out.println( num * seis);
        System.out.println( num * sete);
        System.out.println( num * oito);
        System.out.println( num * nove);
        System.out.println( num * dez);
    }
}
