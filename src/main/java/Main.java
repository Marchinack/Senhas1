import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int senha = 0;

    while (senha != 2022){
       System.out.println("Digite sua senha");
      senha = sc.nextInt();
      if ( senha == 2022) {
        System.out.println("Acesso permitido");
      } else if ( senha != 2022) {
        System.out.println("Senha negada");
      }
        
    }
   
  }
}