import java.util.Scanner;

public class Ult {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
float dd=0.20f;
float de=0.10f;

        System.out.println("Qual foi o valor da compra?");
        Float cp  = leitor.nextFloat();
    
    Float vf= (cp-(dd*cp));
     Float vt= (cp-(de*cp));

    
    if(cp<500){
        System.out.print("O valor final foi"+vf);


    }
    else if(cp>200 && cp>500){
        System.out.print("O valor final foi"+vt);


    }
else if(cp>200){
        System.out.print("Valor final foi"+cp);


    }
    else if(vm>50){
        System.out.print("Infrator, multa gravíssima + suspensão de CNH");


    }
    
    

    
}

    
    }
