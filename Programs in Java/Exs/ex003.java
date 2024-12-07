import java.util.Scanner;
public class ex003{
    public static void main(String[]args){
        char[] gabarito = {'a','b','c','d','d'};
        char[] respostas = new char[5];
        respostas[0]='a';respostas[1]='c';respostas[2]='c';
        respostas[3]='d';respostas[4]='b';
        int pontuação=0;

        Scanner scan = new Scanner(System.in);
        String nome="";
        
        System.out.print("Digite o nome do aluno: ");
        nome=scan.nextLine();
        for(int i=0;i<respostas.length;i++){
            if (respostas[i]==gabarito[i]) {
                pontuação++;    
            }
        }
        System.out.println("Você acertou "+pontuação+" questões");
        /*
        if (respostas[0]==gabarito[0]) {
            System.out.println("Parabéns "+nome+" você acertou a primeira questão");
            pontuação++;
        }else{
            System.out.println("Errou a primeira questão");
        }
        if (respostas[1]==gabarito[1]) {
            System.out.println("Parabéns "+nome+" você acertou a segunda questão");
            pontuação++;
        }else{
            System.out.println("Errou a segunda questão");
        }
        if (respostas[2]==gabarito[2]) {
            System.out.println("Parabéns "+nome+" você acertou a terceira questão");
            pontuação++;
        }else{
            System.out.println("Errou a terceira questão");
        }
        if (respostas[3]==gabarito[3]) {
            System.out.println("Parabéns "+nome+" você acertou a quarta questão");
            pontuação++;     
        }else{
            System.out.println("Errou a quarta questão");
        }
        if (respostas[4]==gabarito[4]) {
            System.out.println("Parabéns "+nome+" você acertou a quinta questão");
            pontuação++;
        }else{
            System.out.println("Errou a quinta questão");
        }
        if (pontuação>3) {
            System.out.println("Parabéns "+nome+" você foi aprovado com "+pontuação+" acertos");
        }else{
            System.out.println(nome+" infelizmente você foi reprovado com um total de "+pontuação+" acertos");
        }
        //System.out.print("Digite a primeira nota do aluno: ");  
    */

    }
}