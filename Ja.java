import java.util.Scanner;

public class Ja {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Olá, seu imc:");
        double imc  = leitor.nextDouble();
       if (imc <=18.5 ) {
    System.out.println("Abaixo do peso");
} else if (imc >=18.5  && imc <25) {
    System.out.println("Peso normal");}
    else if (imc >=25  && imc <30) {
    System.out.println("Sobre peso mano");
} else if(imc >=30 ) {
    System.out.println("Obeisdade");
}

String result =(imc >=18.5  && imc <25)?"Você está na faixa ideal de peso":"Você está fora da faixa ideal de peso";
    System.out.println(result);  
    }


}

