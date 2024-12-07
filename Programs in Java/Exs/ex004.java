import java.util.Scanner;
public class ex004{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        char[] gabarito = {'a','b','c','d','e'};
        char[] respostas = new char[5];
        String nome="";
        int nota=0;
        System.out.print("Digite o nome do aluno: ");
        nome=scan.nextLine();
        for(int i=0;i<gabarito.length;i++){
            System.out.print("Digite a nota do aluno na questão "+(i+1)+" :");
            respostas[i]=scan.nextLine().charAt(0);
            if (respostas[i]==gabarito[i]) {
                nota++;
            }
        
        }
        if (nota>3) {
            System.out.printf("O aluno %s foi aprovado com um total de %d acertos.%n",nome,nota);
        }else{
            System.out.printf("O aluno %s foi reprovado com um total de %d acertos.%n",nome,nota);
        }
        System.out.println("Finalizando sistema");
    }   
}