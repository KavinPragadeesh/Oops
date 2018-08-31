package bank;
import java.util.Scanner;

public class Options extends cheque{                        //Inheritance
	int acc,w,i;
	Scanner c=new Scanner(System.in);
	
	public Options(int id)
	{
		super();                                            //super keyword..
	}
	public void counterDepositRecept()
	{
		date();
		getamt();
		System.out.println("\n Receipt has been generated for the amount");
	}
	
	public void depositOnline()
	{
		date();
		System.out.println("\n Enter the acc no:");
		acc=c.nextInt();
		getamt();
		System.out.println("\nThe amount has been transferred from " + acc +" to your account");

	}
	
	public void knowurbalance()
	{
		System.out.println("\n Bank Balance: "+ mainbal);
	}
	
	public void ministatement()
	{
		System.out.println("\n Deposit statements:\n");
		for(String g: db)                                //Enhanced for..
		{
			System.out.println("\n"+g);
		}
	}
	public void withdraw()
	{
		System.out.println("\n Enter the amount to be withdrawed");
		w=c.nextInt();
		mainbal-=w;
		System.out.println("\n Rs."+w+" has been withdrawn");
	}
	
	
}
