package proa.instituto;

import java.util.Scanner;

public class LendoValores {

    public static void main(String[] args) {
        //Declaração de variáveis
        Scanner in = new Scanner(System.in);
        int compra1, compra2, soma;


        //Entrada
        System.out.println("Legal! Você passou no mercado e fez uma compra, qual foi o valor dela?");
        compra1 = in.nextInt();
        System.out.println(" Mas depois você passou novamente lá e fez outra compra, qual o valor?");
        compra2 = in.nextInt();

        //Processamento
        soma = compra2 + compra1;
        //Saida
        System.out.println("A soma das suas compras foi "+ soma);
    }

}
