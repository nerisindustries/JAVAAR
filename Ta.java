import java.util.Scanner;

public class Ta {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Olá, informe um número");
        int numero = leitor.nextInt();

        String resultado = (numero % 2 == 0) ? "par" : "impar";
        System.out.println("este numero é "+ resultado);

    }


}
