import java.util.Scanner;

public class No {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Opa, digite um ano qualuqer para sabermos se ele é ou não um ano bissexto");
        int ano= leitor. nextInt();




if(ano %4==0 && ano %100!=0){
    System.out.println("Ele é bissexto");

}
else{
     System.out.println("Ele não é um ano bissexto");
     
    }
}



    }
