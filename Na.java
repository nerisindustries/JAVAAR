import java.util.Scanner;

public class Na {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Olá, informe a temperatura em graus celcius");
        double temp  = leitor.nextDouble();
      
       String resultado = (temp<=15) ?"Está "+temp+", está frio" : (temp<25)? "Está "+temp+", está agradável":"Está "+temp+", está quente";
        System.out.println(resultado);
}


      
    }

