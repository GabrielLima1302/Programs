import java.util.Scanner;
public class Member {
    public String welcome = "Welcome to ABC Fitness";
    protected double annualFee;
    private String name;
    private int memberID;
    private int memberSince;
    private int discount;
    public Member(){
        System.out.println("Parent constructor with no parameters");
    }
    public Member(String pName, int pMemberID, int pMemberSince){
        System.out.println("Parent constructor with parameter");

        name = pName;
        memberID = pMemberID;
        memberSince = pMemberSince;
    }
    public double getDiscount(){
        return discount;
    }
    public void setDiscount(){
        Scanner input = new Scanner(System.in);
        String password;
        System.out.print("Please enter the admin password-> ");
        password = input.nextLine();
        if(!password.equals("abcd")){
            System.out.println("Invalid password. You do not hava authority to edit the discount.");

        }else {
            System.out.print("Please enter the discount-> ");
            discount = input.nextInt();
        }

    }
    public void displayMemInfo(){
        System.out.println("Member Name: "+name);
        System.out.println("Member ID: "+memberID);
        System.out.println("Member Since: "+memberSince);
        System.out.println("Annual Fee: "+annualFee);
    }
    public void calculateAnnualFee(){
        annualFee = 0;
    }
    public static void main(String[] args){
        /*
        NormalMember mem1 = new NormalMember("James",1,2010);
        VIPMember mem2 = new VIPMember("Andy",2,2011);
        mem1.setDiscount();
        mem1.calculateAnnualFee();
        mem2.calculateAnnualFee();
        mem1.displayMemInfo();
        mem2.displayMemInfo();
         */
        Member [] clubMembers = new Member[6];
        clubMembers[0] = new NormalMember("James",1,2010);
        clubMembers[1] = new NormalMember("Andy",2,2011);
        clubMembers[2] = new NormalMember("Bill",3,2011);
        clubMembers[3] = new VIPMember("Carol",4,2012);
        clubMembers[4] = new VIPMember("Evelyn",5,2012);
        clubMembers[5] = new Member("Yvonne",6,2013);
        for (Member m : clubMembers){
            m.calculateAnnualFee();
            m.displayMemInfo();
        }
    }
}

