package proa.instituto;

import java.util.Scanner;
import java.text.*;

public class cofrinho {
    public static void main(String[] args) {
        //Declaração de variáveis
        Scanner in = new Scanner(System.in);

        float um = 0.1f;
        float cinco = 0.5f;
        float dez = 0.10f;
        float vinte = 0.25f;
        float cinquenta = 0.50f;
        float real = 1.00f;

        float Vum ;
        float Vcinco ;
        float Vdez ;
        float Vvinte ;
        float Vcinquenta ;
        float Vreal ;

        NumberFormat formatoReal = NumberFormat.getCurrencyInstance();

        //Entrada
        System.out.println("Quantas moedas de 1 centavo você colocou no seu cofre?");
        Vum = in.nextInt();
        System.out.println("Quantas moedas de 5 centavos você colocou no seu cofre?");
        Vcinco = in.nextInt();
        System.out.println("Quantas moedas de 10 centavos você colocou no seu cofre?");
        Vdez = in.nextInt();
        System.out.println("Quantas moedas de 25 centavos você colocou no seu cofre?");
        Vvinte = in.nextInt();
        System.out.println("Quantas moedas de 50 centavos você colocou no seu cofre?");
        Vcinquenta = in.nextInt();
        System.out.println("Quantas moedas de 1 Real você colocou no seu cofre?");
        Vreal = in.nextInt();

        //Processamento
        formatoReal.setMinimumFractionDigits(2);
        float valor = (Vum * um) + (Vcinco * cinco) + (Vdez * dez) +(Vvinte *vinte) + (Vcinquenta * cinquenta) + (Vreal * real);
        //Saída
        System.out.println(" Seu cofre tem " +  formatoReal.format(valor));
    }
}
