import java.util.Scanner;

public class Fa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Opa, digite um número para sabermos se ele é múltiplo de 3 e ou 5");
        int num = leitor. nextInt();


if(num % 3 == 0 && num % 5 == 0){
    System.out.println("É multiplo de ambos");
}
else if(num% 5==0){
    System.out.println("É multiplo apenas de 5");

}

else if(num %3==0){
    System.out.println("É multiplo apenas de 3");

}
else{
     System.out.println("Ele não é multiplo de nenhum dos 2");
     
    }
}



    }
