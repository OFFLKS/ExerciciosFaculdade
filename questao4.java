package projeto1;
import java.util.Scanner;

public class questao4 {
    
    public static void main(String[] args) {
 Scanner s = new Scanner(System.in);
 System.out.println("Informe a quantidade de votos de cada candidato: ");
 int A = s.nextInt();
 int B = s.nextInt();
 int C = s.nextInt();
 int D = s.nextInt();
 int E = (A + B + C + D)/2;
 if (A>=E+1){
 System.out.println("Candidato A venceu!");
 }else if (B>=E+1){
 System.out.println("Candidato B venceu!");
 }else if (C>=E+1){
 System.out.println("Candidato C venceu!");
 }else if (D>=E+1){
 System.out.println("Candidato D venceu!");
 }else{
 System.out.println("Haverá segundo turno!");
 }
}
}