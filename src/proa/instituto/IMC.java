package proa.instituto;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        //Declaração de variáveis
        Scanner in = new Scanner(System.in);
        int altura, peso;
        //Entrada
        System.out.println("Qual a sua altura");
        altura = in.nextInt();
        System.out.println("Qual o seu peso?");
        peso = in.nextInt();
        //Processamento
        double imc =  peso / (Math. pow(altura, 2));
        //Saida
        System.out.println(" Seu IMC é de " + imc);
    }

}
