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
            System.out.println("1. Exibir Mapa da Sala");
            System.out.println("2. Reservar umva Cadeira (o valor é 50% do inresso inteiro)");
            System.out.println("3. Comprar Cadeira (O valor 100% do ingresso inetero)");
            System.out.println("4. Cancelar a sua Reserva");
            System.out.println("5. Relatório Financeiro");
            System.out.println("7. Lista de Exercícios");
            System.out.println("0. Sair do sistema");
            System.out.print("Escolha uma opção: ");
            
opcao = leitor.nextInt();


switch(opcao){




case 1 :
char[] letras={'A','B','C','D','E','F','G','H','I','J','K','L'};
System.out.println("   1  2  3  4  5  6  7  8  9 10 11 12");
for(int i = 0; i< 12; i++){
    System.out.print(letras[i]+" ");
    for(int j=0; j<12; j++){
        System.out.print("["+cadeiras[i][j]+"]");


    }
System.out.println();

} 
break;
case 2:
System.out.print("Vamos resevar a sua cadeira?");
System.out.print("Digite a letra da fileira,cliente....(A-L) ");
char li = leitor.next().toUpperCase().charAt(0);
System.out.print("Digite o número da cadeira, cliente...(1-12) ");
int cad= leitor.nextInt();

  int lgp = li - 'A';
    int cgp = cad - 1;
    if (lgp >= 0 && lgp < 12 && cgp >= 0 && cgp <12){
        if(cadeiras[lgp][cgp]==' '){
            cadeiras[lgp][cgp]= 'R';
            System.out.println("Boaaaaaaa, cadeira reservada!");
        }
        else{
            System.out.println("Ops....essa cadeira já está ocupada,tente novamente!!!");
        }
    }
        else{
            System.out.println("Você tem certeza de que iseriu os dados corretamente,porque este assento é inexistente!");
        }
        break;
        case 0:
        System.out.println("Falou, obrigado pela sua prefeência, volte sempre!!!!!!!!!!");
        break;
default:
System.out.println("Opção inválida, tente novamente, ou olha se tu não digitou nada errado!");
}

} while (opcao != 0);



}
}
