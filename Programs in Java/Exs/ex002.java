import java.util.Scanner;
public class ex002{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String nome="";
        int regress=0;
        System.out.print("Digite seu nome: ");
        nome=scan.next();
        System.out.printf("%s digite o valor da contagem regressiva: ",nome);
        regress=scan.nextInt();
        /*for(regress=scan.nextInt() ; regress!=0 && regress >0; regress--){
            System.out.println(regress);
        }
        /*while (regress!=0 && regress>0){
            System.out.println(regress);
            regress--;
            
        }
        do{
            System.out.println(regress + " - " + nome);
            regress--;
        }while(regress!=0 && regress>0);*/
        System.out.println("Finalizando sistema");

    }
}