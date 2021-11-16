package proa.instituto;

import java.util.Scanner;

public class QuadradoOuRetangulo {
    public static void main(String[] args) {
        //Declaração de variáveis
        Scanner in = new Scanner(System.in);
        int b,h, area;
        //Entrada
        System.out.println("Qual a base da forma geométrica?");
        b = in.nextInt();
        System.out.println("Qual a altura da forma geométrica?");
        h = in.nextInt();
        //Processamento
        area = b*h;
        //Saida
        if(b == h) {
            System.out.println("A área do seu quadrado é de "+ area);
        }
        else{
            System.out.println("A área do seu retangulo é de "+ area);
        }
    }
}
