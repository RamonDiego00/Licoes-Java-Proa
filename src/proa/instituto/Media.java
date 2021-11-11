package proa.instituto;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        //Declaração de variáveis
        Scanner in = new Scanner(System.in);
        double compra1, compra2, compra3, media;


        //Entrada
        System.out.println("Legal! Você passou no mercado e fez uma compra, qual foi o valor dela?");
        compra1 = in.nextInt();
        System.out.println(" Mas depois você passou novamente lá e fez outra compra, qual o valor?");
        compra2 = in.nextInt();
        System.out.println(" No final do dia vc comprou um sorvete, qual o valor ?");
        compra3 = in.nextInt();

        //Processamento
        media = (compra1 + compra2 + compra3)/3;
        //Saida
        System.out.println("A media das suas compras foi "+ media);
    }

}

