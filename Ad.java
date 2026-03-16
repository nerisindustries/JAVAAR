import java.util.Scanner;

public class Ad {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Olá, informe o primeiro número");
        int numero = leitor.nextInt();
        System.out.println("informe o segundo  número");
        int numo = leitor.nextInt();

        String resultado = (numo > numero) ? "o " + numo + " é o maior número" : numero + " é o maior número";
        System.out.println(resultado);

    }


}
