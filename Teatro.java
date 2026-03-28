import java.util.Scanner;

public class Teatro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

char[][][] cadeiras= new char[2] [12][12];

for(int s = 0; s < 2;s++){


   
    
 
 for (int i = 0; i< 12; i++){
    for(int j = 0; j<12; j++){
        cadeiras[s][i][j]=' ';
    }
 }
}
  int opcao;
  do{
            System.out.println("Seja Bem-vindo ao Teatro Devisate");
             System.out.println("Em qual sala você deseja entrar? 1=sala v8 com velozes e furiosos e 2=sala w16 com need for speed");
             int s = leitor.nextInt();
            
            System.out.println("1. Exibir Mapa da Sala");
            System.out.println("2. Reservar umva Cadeira (o valor é 50% do inresso inteiro)");
            System.out.println("3. Comprar Cadeira (O valor 100% do ingresso inetero)");
            System.out.println("4. Cancelar a sua Reserva");
            System.out.println("5. Relatório Financeiro");
            System.out.println("6. Lista de Exercícios");
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
System.out.println("Vamos resevar a sua cadeira?");
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
        case 3:
            
System.out.println("Vamos comprar a sua cadeira?");
System.out.print("Digite a letra da fileira,cliente....(A-L) ");
 char lin = leitor.next().toUpperCase().charAt(0);
System.out.print("Digite o número da cadeira, cliente...(1-12) ");
int cabs = leitor.nextInt();

  int lgd = lin - 'A';
     int cgd = cabs - 1;
    if (lgd >= 0 && lgd < 12 && cgd >= 0 && cgd <12){
        if(cadeiras[lgd][cgd]==' ' || cadeiras[lgd][cgd]=='R'){
            cadeiras[lgd][cgd]= 'X';
            System.out.println("Boaaaaaaa, cadeira Comprada!");
        }
        
        else{
            System.out.println("Ops....essa cadeira já está ocupada,tente novamente!!!");
        }
    

    }
        else{
            System.out.println("Você tem certeza de que iseriu os dados corretamente,porque este assento é inexistente!");
        }
        
        break;

case 4:
 
            
System.out.println("Ok......Vamos cancelar sua reserva");
System.out.print("Digite a letra da fileira,cliente....(A-L) ");
 char liw = leitor.next().toUpperCase().charAt(0);
System.out.print("Digite o número da cadeira, cliente...(1-12) ");
int cabes = leitor.nextInt();

  int lge = liw - 'A';
     int cge = cabes - 1;
    if (lge >= 0 && lge < 12 && cge >= 0 && cge <12){
        if(cadeiras[lge][cge]=='X' || cadeiras[lge][cge]=='R'){
            cadeiras[lge][cge]= ' ';
            System.out.println("Reserva cancelada...:( ");
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


 }while (opcao != 0);



}
}
