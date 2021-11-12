package proa.instituto;

import java.util.Scanner;

public class UmE99 {

    public static void main(String[] args) {
        //Declaração de variáveis
        Scanner in = new Scanner(System.in);
        double preco = 1.99;
        int items = 0;
        double resultado;
        //Entrada
        System.out.println("Quantos items você comprou?");
        items = in.nextInt();
        //Processamento
        double desconto = ((items * preco) * 5)/100;
         resultado =  (items*preco) - desconto;
        //Saida
        System.out.println(" Com o desconto o valor final da compra foi de  "+ resultado);
    }
}
