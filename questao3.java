package projeto1;
import java.util.Scanner;
public class questao3 {
    public static void main(String[] args) {
 Scanner s = new Scanner(System.in);
 System.out.println("Informe um valor inteiro e quatro valores reais: ");
 int i = s.nextInt();
 double a = s.nextDouble();
 double b = s.nextDouble();
 double c = s.nextDouble();

 if(    a > b && b > c) {
     System.out.println(a + ", " + b + " e " + c);
 } else if ((a>c) && (c>b))
 System.out.println(a + ", " + c + " e " + b);
 else if ((b>a) && (a>c))
 System.out.println(b + ", " + a + " e " + c);
 else if ((b>c) && (c>a))
 System.out.println(b + ", " + c + " e " + a);
 else if ((c>a) && (a>b))
 System.out.println(c + ", " + a + " e " + b);
 else if ((c>b) && (b>a))
 System.out.println(c + ", " + b + " e " + a);
 else if((a>b) && (b>c))
 System.out.println(c + ", " + b + " e " + a);
 else if ((a>c) && (c>b))
 System.out.println(b + ", " + c + " e " + a);
 else if ((b>a) && (a>c))
 System.out.println(c + ", " + a + " e " + b);
 else if ((b>c) && (c>a))
 System.out.println(a + ", " + c + " e " + b);
 else if ((c>a) && (a>b))
 System.out.println(b + ", " + a + " e " + c);
 else if ((c>b) && (b>a))
 System.out.println(a + ", " + b + "e " + c);
 else if((a>b) && (b>c))
 System.out.println(c + ", " + a + " e " + b);
 else if ((a>c) && (c>b))
 System.out.println(b + ", " + a + " e " + c);
 else if ((b>a) && (a>c))
 System.out.println(c + ", " + b + " e " + a);
 else if ((b>c) && (c>a))
 System.out.println(a + ", " + b + " e " + c);
 else if ((c>a) && (a>b))
 System.out.println(b + ", " + c + " e " + a);
 else if ((c>b) && (b>a))
 System.out.println(a + ", " + c + " e " + b);
 else System.out.println("Erro, número maior que 3 ou menor que 1");

 }



 }


