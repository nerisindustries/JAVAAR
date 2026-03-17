import java.util.Scanner;

public class Za {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual a sua idade?");
        double id  = leitor.nextDouble();
       if (id <=7) {
    System.out.println("O valor é R$10,00");
} else if (id >=12  && id <=60) {
    System.out.println("O valor é R$20,00");
} else if(id>60) {
    System.out.println("O valor é R$10,00(meia entrada)");
}


      
    }


}
