import java.util.Scanner;
//Main Class
public class Member{
    public String welcome="Welcome to ABC Fitness";
    public Member(){
    }
    public void bodyMain(){
        Scanner scan = new Scanner (System.in);
        String password;
        System.out.print("Enter the admin password\n>>");
        password=scan.nextLine();
        if(password.equals("abcd")){
            int type;
            NormalMember nm = new NormalMember();
            vipMember vm = new vipMember();
            System.out.print("[0] VIP Member\n[1] Normal Member\n>>");
            type=scan.nextInt();
            if (type==1) {
                nm.printMessage();
                nm.setDiscount();
                nm.displayMemInfo();
                System.exit(0);
            } else if (type==0){
                vm.printMessage();
                vm.setDiscount();
                vm.displayMemInfo();
                System.exit(0);
            }else{
                System.out.println("Error:You need to enter number 1 ou 0");
                System.exit(0);
            }

        }else{
            System.out.println("Error: Invalid password, closing the program\n>>");
            System.exit(0);
        }

    }

    public static void main(String[]args){
        Member main= new Member();
        main.bodyMain();
        System.out.println("\n-------------\n");
    }


}

