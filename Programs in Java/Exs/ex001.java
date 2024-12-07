import java.util.Scanner;
public class ex001{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int pos=0;
        String nome="";
        System.out.print("Digite seu nome: ");
        nome=scan.nextLine();
        System.out.print("Digite sua posição no ranking: ");
        pos=scan.nextInt();
        switch(pos){
            case 1:
                System.out.printf("Parabéns %s você ficou em primeiro lugar%n",nome);
                break;
            case 2:
                System.out.printf("Parabéns %s você ficou em segundo lugar%n",nome);
                break;
            case 3:
                System.out.printf("Parabéns %s você ficou em terceiro lugar%n",nome);
                break;
            case 4:case 5:
                System.out.printf("Parabéns %s, você não ficou no pódio mas ganhou prêmio de participação%n",nome);
                break;
            default:
                System.out.printf("%s infelizmente você não ganhou nenhum prêmio%n",nome);
                break;
        }
        System.out.println("Finalizando sistema");

    }
}