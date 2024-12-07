import java.util.Scanner;
public class vipMember extends Member{
    private int discount;
    private double annualFee;
    public vipMember(){
        super();
    }
    public void setDiscount(){
        Scanner scan = new Scanner(System.in); 
        System.out.print(("Enter the discount: "));
        discount=scan.nextInt();
        
        annualFee=(1-0.01*discount)*1200;

    }
    public void displayMemInfo(){
        Scanner scan = new Scanner(System.in);
        String pName;
        int pMemberID;
        int pMemberSince;

        System.out.print("Enter the pName vip: ");
        pName=scan.nextLine();

        System.out.print("Enter the pMemberID vip: ");
        pMemberID=scan.nextInt();

        System.out.print("Enter the pMemberSince: ");
        pMemberSince=scan.nextInt();

        System.out.println("\n---\n");

        System.out.println("The pName vip is: "+pName);
        System.out.println("The pMemberID vip is: "+pMemberID);
        System.out.println("The pMemberSince vip is: "+pMemberSince);
        System.out.println("The annualFee vip is: "+annualFee);
        
    }
    public void printMessage(){
        System.out.println("VIP Member");
    }
}
