import java.util.Scanner;

/**
 * bank_additional
 */
class bank {

    int accno;
    double balance;
    String custName;

    void startAccount(String custName,int accno,double balance){
        this.custName = custName;
        this.balance = balance;
        this.accno = accno;
    }
    void startAccount(String cusString,int accno){
        this.custName = custName;
        this.accno  =  accno;
        this.balance = 0;
    }
    void depositCash(){
        System.out.println("Enter amount to be deposited : ");
        Scanner scanner =  new Scanner(System.in);
        int cashdep = scanner.nextInt();
        balance += cashdep;
        printBalance();
    }
    void withdraw(){
        System.out.println("Enter amount to be deposited : ");
        Scanner scanner =  new Scanner(System.in);
        int cshwtdr = scanner.nextInt();
        if(cshwtdr<=balance){
            balance -= cshwtdr;
            printBalance();
        }
        else
        System.out.println("insufficient balance");
    }
    void printBalance(){
        System.out.println("hi! "+custName+" ,"+accno);
        System.out.println("you have rs"+ balance+" as balance");
    }

}
/**
 * Innerbank_additional
 */
public class bank_additional {

        public static void main(String[] args) {
            int choice;
            Scanner scanner =  new Scanner(System.in);
            bank cust = new bank();
            System.out.println("Enter your name : ");
            String Name = scanner.nextLine();
            System.out.println("Enter account number : ");
            int accn = scanner.nextInt();
            System.out.println("Do you want do deposit money : ");
            char ch = scanner.next().charAt(0);
            if(ch == 'y'|| ch == 'Y')
           {
            System.out.println("Enter the amount : "); 
            double balance = scanner.nextDouble();
            cust.startAccount(Name,accn,balance);}
            else    
            {
                cust.startAccount(Name,accn);
            }

            do{
                System.out.println("1.DEPOSIT\n2.WITHDRAW\n3.GET BALANCE\n0.EXIT");
                choice = scanner.nextInt();
                switch(choice){
                    case 1: cust.depositCash();
                            break;
                    case 2: cust.withdraw();
                            break;
                    case 3: cust.printBalance();
                            break;
                    default: System.out.println("ENTER A VALID CHOICE");
                }
            }while(choice !=0);
        }
}