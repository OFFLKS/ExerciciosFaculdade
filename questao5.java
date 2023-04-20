package projeto1;
import java.util.Scanner;

public class questao5 {
    
    public static void main(String[] args) {
        ///scanner

        Scanner x = new Scanner(System.in);

        ///variáveis
        System.out.printf("Insira o dia:");
        int dia = x.nextInt();
        System.out.printf("Insira o mes:");
        int mes = x.nextInt();
        System.out.printf("Insira o ano:");
        int ano = x.nextInt();

        ///validação
        if (dia > 31 || mes > 12 || mes == 0 || dia == 0 || ano == 0) {
            System.out.println("A data: " + dia + "/" + mes + "/" + ano + " é invalida");
        } else if (dia == 31) {
            if (mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                System.out.println("\nA data: " + dia + "/" + mes + "/" + ano + " é invalida");
                System.out.println("O mês " + mes + " não possui 31 dias");
            } else {
                System.out.println("\nA data: " + dia + "/" + mes + "/" + ano + " é valida");
            }
        } else if (dia > 29 && mes == 2) {
            System.out.println("\nA data: " + dia + "/" + mes + "/" + ano + " e invalida.");
            System.out.println("o mês 2 nao pode possuir mais que 29 dias");
        } else if (dia == 29 && mes == 2) {
            if (ano % 4 == 0 || (ano % 100 == 0 && ano % 400 == 0)) {
                System.out.println("\nA data: " + dia + "/" + mes + "/" + ano + " é valida");
                System.out.println("E um ano bisexto");
            } else {
                System.out.println("\nA data: " + dia + "/" + mes + "/" + ano + " é invalida pois o ano " + ano + " nao é bisexto");
            }
        } else {
            System.out.println("\nA data: " + dia + "/" + mes + "/" + ano + " é valida");

        }

    }
}