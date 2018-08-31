package bank;

interface basic                                    //Declaration in Interface
{
	void rules();
}

public class ministat implements basic{            //Defining interface methods..and abstract class
	cheque ccc;
	
	public ministat(cheque cc)                     //Using Composition
	{
		ccc=cc;
	}
	public void rules()
	{
		System.out.println("Savings Bank Accounts Rules & Regulations\r\n" + 
				"1. As per the extant Reserve Bank of India (RBI) guidelines, which are mandatory,\r\n" + 
				"photographs of all applicant(s) / Power of Attorney holders (i.e. who are authorized to\r\n" + 
				"operate the account(s)) should be furnished to the bank.\r\n" + 
				"2. As per extant Government of India (GOI) guidelines, PAN / Form No.60/61\r\n" + 
				"(Where PAN is not available) is required to be furnished.\r\n" + 
				"3. Savings Bank A/c (SB A/c) can not be opened for business purposes as per RBI\r\n" + 
				"directives and hence SB a/c should be used to route transactions of only nonbusiness\r\n" + 
				"/ non-commercial nature. In the event of occurrence of such transactions\r\n" + 
				"or any other such transactions that may be construed as dubious or undesirable, the Bank\r\n" + 
				"reserves the right to unilaterally freeze operations in such accounts.\r\n" + 
				"4. The balance in the special type of account must adhere to the minimum monthly / quarterly\r\n" + 
				"average balance stipulation laid down by the Bank and communicated to you at the time of\r\n" + 
				"opening of the account. Non-maintenance of such monthly/quarterly average balance will\r\n" + 
				"attract applicable penalty on a monthly / quarterly basis and on a date determined by the\r\n" + 
				"bank.");
	}
	public void tq()                                         
	{
		System.out.println("\n Thank u customer:"+ccc.id);
	}
	
	
}
