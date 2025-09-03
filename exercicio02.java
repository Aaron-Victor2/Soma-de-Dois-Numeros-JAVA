/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("DIgite o primeiro numero: ");
int numero1 = scanner.nextInt();

System.out.print("Digite o segundo numero: ");
int numero2 = scanner.nextInt();

// Operações 
int subtracao = numero1 - numero2;
int  multiplicacao = numero1 * numero2;
int divisao = numero1 / numero2; // como são inteiros, resultado será inteiro

// Impressão dos resultados
System.out.println("Subtração: " + subtracao);
System.out.println("Multiplicação: " + multiplicacao);
System.out.println("Divisão: " + divisao);

        scanner.close();
    }
}       
    



