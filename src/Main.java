import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores, caso contrário devera
        multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C eimprimir seu valor na tela.*/

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b){
            int c = a + b;
            System.out.println("A e B são iguais então o valor somado é: " + c);
        }
        else {
            int c = a * b;
            System.out.println("A e B são dieferentes então o valor multiplicado é: " + c);
        }

        sc.close();
    }
}