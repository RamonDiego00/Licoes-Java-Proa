package proa.instituto;

import java.util.Scanner;

public class Fabrica {
    public static void main(String[] args) {
        //Declaração de variáveis
        Scanner in = new Scanner(System.in);
        float tipo1 = 0.350f;
        float tipo2 = 0.600f;
        float tipo3 = 2.00f;

        int Vtipo1;
        int Vtipo2;
        int Vtipo3;
        //Entrada
        System.out.println("Vai Querer Quantas Bebidas de 350ml?");
        Vtipo1 = in.nextInt();
        System.out.println("Vai Querer Quantas Bebidas de 600ml?");
        Vtipo2 = in.nextInt();
        System.out.println("Vai Querer Quantas Bebidas de 2l?");
        Vtipo3 = in.nextInt();
        //Processamento
        float mls = (Vtipo1 * tipo1) + (Vtipo2 * tipo2) + (Vtipo3 + tipo3);
        //Saida
        System.out.println(" Você comprou " + Math.round(mls) + "L aproximadamente");
    }
}
