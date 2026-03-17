import java.util.Scanner;

public class Ua {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double b1= leitor.nextDouble();
        System.out.println("Digite o segundo número:");
        double b2 = leitor.nextDouble();
        System.out.println("Digite o terceiro número:");
        double b3 = leitor.nextDouble();
    
    
    if(b1==b2 && b2==b3){
        System.out.println("Empate, todos os números são iguais.");

    }
    else if (b1>b2 && b1>=b3){
        System.out.println(b1+", O primeiro número é o maior");
    }
    else if (b2>b3 && b2>=b1){
        System.out.println(b2+", O segundo número é o maior");
    }
    else if (b3>b1 && b3>=b2){
        System.out.println(b3+", O terceiro número é o maior");
    }
    }
}