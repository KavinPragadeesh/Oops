package bank;
import java.util.Scanner;
import java.util.ArrayList;
import basic.*;
public class cheque
{
	public int a,rem1,rem2,id,yy,dd,k=0;
	public String total=null;
	public int d,m,y; 
	public int mainbal=0;
	public ArrayList< String > db=new ArrayList< String >();     //ArrayList
	final String name;                                           //Non access specifier                         
	Scanner input=new Scanner(System.in);                        
	b_func w=new b_func();
	public void cheque()                                         //Non-Parameterized constructor
	{
		System.out.println("Enter the branch code:");
		dd=input.nextInt();
		
	}
	
	public void cheque(int id)                                   //Parameterized Constructor
	{
		this.id=id;                                              //'this' keyword
	}
	
	public void cheque(cheque c)                                 //Copy Constructor
	{
		id=c.id;
		System.out.println("Customer id:" + id);
	}
																 //Static
	{
		name="---------------Royal Bank Of Scotland-----------------";
		System.out.println(name);
	}
	
	public void date()
	{
		System.out.println("\n Enter the date:\n day: ");
		d=input.nextInt();
		System.out.println("month: ");
		m=input.nextInt();
		System.out.println("year: ");
		y=input.nextInt();
		
	}
	public void getamt()
	{
		
		System.out.println("Enter a amount less than a lakh: ");
		a=input.nextInt();
		process(a);					
		mainbal+=a;
		db.add(d +"." + m + "." + y + "  " +total);
	}
	
												//this function returns the amount in digits to words.. 
	void process(int a)
	{
		 rem1=a%1000;
         a/=1000;
         rem2=rem1%100;
         rem1/=100;
         if(a!=0)
         {
         System.out.print("\n" + twos(a) + " thousand" + " ");
         total=twos(a) + "thousand" + " ";
         }
         if(rem1!=0)
         {
         System.out.print(hund(rem1) + " hundred");
         total+=hund(rem1) + " hundred";
         }
         if(rem2!=0)
         {
         System.out.print(" and "+twos(rem2));
         total+=" and "+twos(rem2);
         }
         System.out.print(" only");
         
      
         
	}
	String hund(int b)
    {
        String q=w.print2(b);
        return q;
    }
	
	String twos(int b)
    {
        int p;
        String q,r;
        if(b>=10 && b<=19)
        {
            q=w.print3(b);
        }
        else
        {
            p=b%10;
            b-=p;
            q=w.print1(b) +" "+ w.print2(p);
        }
        return q;
    }
	
}
