import java.util.Scanner;

public class Tt {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o lado A:");
        double a = leitor.nextDouble();
        System.out.println("Digite o lado B:");
        double b = leitor.nextDouble();
        System.out.println("Digite o lado C:");
        double c = leitor.nextDouble();
    
    
    if(a==b && b==c){
        System.out.println("Triângulo equilátero");

    }
    else if (a==b||b==c||a==c){
        System.out.println("Triângulo isósceles");
    }
     else {
                System.out.println("Triângulo Escaleno");
            }

    }
}