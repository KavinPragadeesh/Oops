package bank;

public enum branch                                     //enum class
{
	A("Guindy",001),
	B("Saidapet",002),
	C("Chrompet",003),
	D("Nungambakkam",004);
	
	private final String area;
	private final int code;
	
	branch(String ar,int c)                            //enum constructor
	{
		area=ar;
		code=c;
	}
	
	public String getname()
	{
		return area;
	}
	
	public int getcode()
	{
		return code;
	}

}
