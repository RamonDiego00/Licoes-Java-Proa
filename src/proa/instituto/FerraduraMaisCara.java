package proa.instituto;

import java.util.Scanner;

public class FerraduraMaisCara {
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
        System.out.println("O total deu um valor de "+valor+"R$ nas ferraduras");
        if(valor >= 100) {
            double teste = valor;
            teste = (valor * 10)/100;
            double desconto = valor - teste;
            System.out.println("Então você vai ter um desconto e vai pagar "+ desconto + "R$ nas ferraduras");
        }
        else{
            System.out.println("Tenha um bom dia!");
        }
    }
}
