import java.util.Scanner;

public class Ca {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Opa, digite um número:");
        double num = leitor.nextDouble();
String resc =(num>0)?num+" Este número é positivo":(num==0)?num+" Este número é nulo":num+" Este numero é negativo";
System.out.println(resc);

    }
}