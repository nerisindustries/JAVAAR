import java.util.Scanner;

public class Da {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Olá, informe os mêses respectivamente com o seu número no calendário");
        int mes  = leitor.nextInt();
    
    switch (mes) {

    case 1:
    case 2:
    case 3:
        System.out.println("Verão");
        break;
    case 4:
    case 5:
     case 6:
        
        System.out.println("Outono");
        break;
    case 7:
    case 8:
    case 9:
        System.out.println("Inverno");
        break;
    case 10:
    case 11:
  case 12:
        System.out.println("Primavera");
        break;
   
        
    default:
        System.out.println("Mês inexistente");
}

    
    }
}