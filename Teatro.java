import java.util.Scanner;

public class Teatro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

char[][] cadeiras= new char [12][12];

 for (int i = 0; i< 12; i++){
    for(int j = 0; j<12; j++){
        cadeiras[i][j]=' ';
    }
 }
  int opcao;
  do{
            System.out.println("Seja Bem-vindo ao Teatro Devisate");
            System.out.println("1. Exibiro Mapa da Sala");
            System.out.println("2. Reservar umva Cadeira (o valor é 50% do inresso inteiro)");
            System.out.println("3. Comprar Cadeira (O valor 100% do ingresso inetero)");
            System.out.println("4. Cancelar a sua Reserva");
            System.out.println("5. Relatório Financeiro");
            System.out.println("7. Lista de Exercícios");
            System.out.println("0. Sair do sistema");
            System.out.print("Escolha uma opção: ");
            
opcao = leitor.nextInt();







if(opcao==1){
char[] letras={'A','B','C','D','E','F','G','H','I','J','K','L'};
System.out.println("    1  2  3  4  5  6  7  8  9 10 11 12");
for(int i = 0; i< 12; i++){
    System.out.print(letras[i]+" ");
    for(int j=0; j<12; j++){
        System.out.print("["+cadeiras[i][j]+"]");


    }
System.out.println();

} 
}

  

} while (opcao != 0);

}
}