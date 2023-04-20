package projeto1;
import java.util.Scanner;
public class Projeto1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
 System.out.println("Digite a quantidade de segundos : ");
 int ni = s.nextInt();
 int horas = ni/3600;
 int horas2 = ni%3600;
 int minutos = horas2/60;
 int segundos = horas2%60;
 System.out.println("Essa quantidade de segundos equivale a:"+horas+"horas,"+minutos+"minutos e"+segundos+"segundos");
    }
    
}
