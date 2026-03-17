import java.util.Scanner;

public class Oa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Olá, informe a média do aluno?");
        double media  = leitor.nextDouble();
       if (media >=9 && media <=10) {
    System.out.println("Nota A");
} else if (media >=7  && media <=8) {
    System.out.println("Nota B");}
    else if (media >=5  && media <=6) {
    System.out.println("Nota C");
} else if(media >=0 && media <=4 ) {
    System.out.println("Nota D");
}


      
    }


}
