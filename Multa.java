import java.util.Scanner;

public class Multa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("A qual velocidade o veiculo estava?");
        Double mu  = leitor.nextDouble();
    System.out.println("Qual o limite da via");
        Double li  = leitor.nextDouble();
    Double vm=(((mu-li)/li)*100);

    
    if(vm<=20){
        System.out.print("Bom condutor, no limite de velocidade");


    }
    else if(vm>20){
        System.out.print("Infrator, multa leve");


    }
else if(vm>20 && vm<50){
        System.out.print("Infrator, multa grave");


    }
    else if(vm>50){
        System.out.print("Infrator, multa gravíssima + suspensão de CNH");


    }
    
    

    
}

    
    }
