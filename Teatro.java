import java.util.Scanner;

public class Teatro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

char[][][] cadeiras= new char[6] [12][12];

for(int s = 0; s < 6;s++){


   
    
 
 for (int i = 0; i< 12; i++){
    for(int j = 0; j<12; j++){
        cadeiras[s][i][j]=' ';
    }
 }
}
  int opcao= -1;
  do{
    
            System.out.println("Seja Bem-vindo ao Teatro Devisate");
             System.out.println("Escolha sua sala:\n1=Velozes e furiosos\n2=Need for speed\n3= Fórmula 1\n4=Ford vs Ferrari\n5=Granturismo\n6=Carros");
             
            int s = leitor.nextInt();
            int vv =s - 1;
            if(vv <0 || vv > 6){
                System.out.println("Mano, a sala não existe, da uma olhada se você digitou o número correto!");
            }
            else{
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
        System.out.print("["+cadeiras[vv][i][j]+"]");


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
        if(cadeiras[vv][lgp][cgp]==' '){
            cadeiras[vv][lgp][cgp]= 'R';
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
        if(cadeiras[vv][lgd][cgd]==' ' || cadeiras[vv][lgd][cgd]=='R'){
            cadeiras[vv][lgd][cgd]= 'X';
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
        if(cadeiras[vv][lge][cge]=='X' || cadeiras[vv][lge][cge]=='R'){
            cadeiras[vv][lge][cge]= ' ';
            System.out.println("Reserva cancelada... :( ");
        }
        
       

    }
        else{
            System.out.println("Você tem certeza de que iseriu os dados corretamente,porque este assento é inexistente!");
        }
        
        break;
    
    
case 5:
    int vo= 0;
    int ro= 0;
    int cs= 0;
    double pint = 160.00;
        System.out.println("Vamos ver quanto arrecadamos neste espetáculo......");
for(char[] fileiras:cadeiras[vv]){
 for(char lugar:fileiras){

if(lugar==' '){
    vo++;
}else if(lugar=='R'){
    ro++;

}
else if(lugar=='X'){
    cs++;
}

 



 }
 }
 
double lt = (cs*pint)+(ro*(pint*0.5));
double ltr = 144 *(pint*0.5);
double ltc = 144 * pint ;
System.out.println("Neste evento foram arrecadados R$" +lt+ " reais");
System.out.println(vo+" cadeiras ficaram vazias!");
System.out.println(ro+" cadeiras foram reservadas resultando em R$"+(ro*(pint*0.5))+" reais");
System.out.println(cs+" cadeiras foram compradas resultando em R$"+(cs*pint)+" reais");   
System.out.println("Caso todas as cadeiras fossem compradas o resultado seria de R$"+ltc+" reais");   
System.out.println("Caso todas as cadeiras fossem reservadas o resultado seria de R$"+ltr+" reais");  

break;
case 6:
    int pag = 0;
    int iPp = 7;
    int te = 20;
int ttp= (int)Math.ceil((double) te/iPp);

String[] titles = new string[];
for(int i i=0;i<20;i++){
    System.out.println(titles[i]="Exercício"+(i+1));
}
String cdm="";
for (int = inio; i< mim;i++){
    System.out.println()
}

do{
    int inio = pA * ppp;

 int mim = Math.min(inio + iPp, te);
 System.out.println("\n\nPágina"+pa)

 system.out.println((i+1)+"-"`+titulos[i])
}



    system.out.println("Menu de exercíos")
String acao="";

        case 0:
        System.out.println("Falou, obrigado pela sua prefeência, volte sempre!!!!!!!!!!");
        break;
        
default:
System.out.println("Opção inválida, tente novamente, ou olha se tu não digitou nada errado!");
}

            }
  }while (opcao!= 0);
  
  
  }

}

