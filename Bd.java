import java.util.Scanner;

public class Bd {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        


        System.out.println("Olá player 1, oque vc joga? Perte o numero respectivo 1-pedra, 2-papel ou 3-tesoura?:");
        int pc  = leitor.nextInt();
         System.out.println("E você player 2?");
        int pd  = leitor.nextInt();
       if (pc==1 && pd==3  ) {
    System.out.println("Player 1 venceu");
} else if (pc==1 && pd==2) {
    System.out.println("Player 2 venceu");}
    else if (pd==2 && pc==3) {
    System.out.println("Player 1 venceu");

} 
else if (pd==2 && pc==1) {
    System.out.println("Player 2 venceu");

} 
else if (pd==1 && pc==3) {
    System.out.println("Player 2 venceu");

} 
else if (pd==3 && pc==2) {
    System.out.println("Player 2 venceu");

} 
else if (pd==3 && pc==1) {
    System.out.println("Player 1 venceu");

} 
else if(pc==pd ) {
    System.out.println("Empate");
}
    }


    
    }




