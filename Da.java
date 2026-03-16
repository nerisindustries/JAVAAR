import java.util.Scanner;

public class Da {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Olá, informe a média do aluno");
        double media  = leitor.nextDouble();
       if (media >= 7) {
    System.out.println("Aprovado");
} else if (media >=5  && media <7) {
    System.out.println("Recuperação");
} else if(media <5) {
    System.out.println("Reprovado");
}


      
    }


}
