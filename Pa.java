import java.util.Scanner;

public class Pa{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double n1 = leitor.nextDouble();

        System.out.println("Digite o operador (+, -, *, /):");
        String operacao = leitor.next(); 

        System.out.println("Digite o segundo número:");
        double n2 = leitor.nextDouble();



switch (operacao){

case"+":
System.out.println("O Resultado é : "+(n1+n2));
break;
case "-":
    System.out.println("O Resultado é : "+(n1-n2));
break;
case"*":
System.out.println("O Resultado é: "+(n1*n2));
break;
case"/":

if(n2==0){
    System.out.println("Mano perdão mas não é possível dividir por 0");


}
else{
    System.out.println("O Resultado é : "+(n1/n2));

}

break;
default:
       System.out.println("Operador inválido!");


}

   }
    
}