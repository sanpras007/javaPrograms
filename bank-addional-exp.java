import java.util.Scanner;
 class bank{
	
	int balance,accn;
	String name,bnknm;
	
	bank(){
		balance = 0;
		accn = 0;
		name = "NULL";
		bnknm = "MYSAVINGS BANK";
	}
	bank(String name, int balance,int accn){
		this.name =  name;
		this.balance = balance;
		this.accn = accn;
		bnknm = "MYSAVINGS BANK";
		
	}
	void getBal(){
		System.out.println(name + "! you have rs"+balance+" as a balance in "+bnknm);
	}
	void transac(){
		System.out.print("Enter the withdraw amount : ");
		Scanner scan = new Scanner(System.in);
		int amt =  scan.nextInt();
		if(amt<=balance){
			System.out.print("Success!!");
			balance-=amt;
		}
		else{
			System.out.print("You dont have enough balance to perform the operation..");
			getBal();
		}
	}
	void addBal(){
		System.out.print("Enter the deposit amount : ");
		Scanner scan = new Scanner(System.in);
		int amt =  scan.nextInt();
		balance+=amt;
	}
}
class App{
	public static void main(String []args){
		bank b[] = new bank[10];
		int usr,un;
		String name;
		Scanner scan = new Scanner(System.in);
		int ch;
		do{
			System.out.println("1. create\n2.login\n");
			usr = scan.nextInt();
			switch(usr){
				case 1: {
				 		System.out.println("ENTER USERNUMBER");
						 un=scan.nextInt();
						System.out.println("NAME : ");
						 name = scan.next();
						 b[un] = new bank(name,0,un)	;
				 	}
				 	break;
				 case 2:{
				 		do{
							System.out.println("ENTER USERNUMBER");
							 un=scan.nextInt();
							System.out.println("1. show balance\n2.withdraw\n3.Deposit\n");
							ch = scan.nextInt();
							switch(ch){
								case 1: b[un].getBal();
									break;
								case 2: b[un].transac();
									break;
								case 3: b[un].addBal();
									break;
							}
						}while(ch!=0);
				 	}
			}
			
	
		}while(usr!=0);
		
	}
	
}
