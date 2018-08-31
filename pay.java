package bank;                                              //Creating Base Package 
import basic.*;                                            //Importing packages
import java.util.Scanner;
public class pay {

	public static void main(String[] args) {               //Main method
		// TODO Auto-generated method stub
		int id,n=0;
		Scanner in=new Scanner(System.in);
		
		cheque c=new cheque();                             //Object Creation
		for(branch b:branch.values())                      //Enhanced for()
		{
			System.out.println("\n"+b.getname()+"\t"+b.getcode());
		}
		c.cheque();                                        //Non-Parameterized Constructor
		System.out.println("Customer id:");
		id=in.nextInt();
		c.cheque(id);                                      //Parameterized Constructor
		cheque c1=new cheque();
		c1.cheque(c);                                      //Copy Constructor
		Options o1=new Options(id);
		ministat m=new ministat(c);
		System.out.println("\n1.Counter Deposit Receipt\n2.Deposit Online"
				          + "\n3.Counter Withdraw Receipt\n4.Know your Balance\n5.Mini Statement\n6.Rules\n7.Exit");
		while(n!=7)
		{
			System.out.println("\n Enter the need: ");
			n=in.nextInt();
			switch(n)
			{  
				case 1:o1.counterDepositRecept();break;
				case 2:o1.depositOnline();break;
				case 3:o1.withdraw();break;
				case 4:o1.knowurbalance();break;
				case 5:o1.ministatement();break;
				case 6:m.rules();break;
				case 7:m.tq();
			}
			
		}
	
		

	}

}

