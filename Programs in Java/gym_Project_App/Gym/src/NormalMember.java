import java.util.Scanner;
public class NormalMember extends Member{
    private int discount;
    private double annualFee;
    Member main=new Member();
    public NormalMember(){
        super();

    }
    public void setDiscount(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the discount: ");
        discount=scan.nextInt();
        annualFee=(1-0.01*discount)*600;
    }
    public void printMessage(){
        System.out.println("Normal Member");
    }
    public void displayMemInfo(){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the pName: ");
        String pName;
        pName=scan.nextLine();

        System.out.print("Enter the pMemberID: ");
        int pMemberID;
        pMemberID=scan.nextInt();


        System.out.print("Enter the pMemberSince: ");
        int pMemberSince;
        pMemberSince=scan.nextInt();

        System.out.println("\n---\n");

        System.out.println("Member Name: "+pName);
        System.out.println("Member ID: "+pMemberID);
        System.out.println("Member Since: "+pMemberSince);
        System.out.println("Annual Fee: "+annualFee);

    }

}
