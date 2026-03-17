import java.util.Scanner;

public class Qa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
int senha=1345;
String use="Davi";
        System.out.println("Olá, Qual o seu nome de usuário?");
        String user= leitor.nextLine();
         System.out.println("E qual sua senha??");
        int password= leitor.nextInt();
       if (use.equals(user) && senha==password) {
    System.out.println("Acesso permitido, seja bem-vindo "+user"!");
       }
    
 else  {
    System.out.println("Acesso negado, tente novamente !");
}

    }
      
    }



