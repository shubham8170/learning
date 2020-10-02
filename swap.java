class swap
{
	public static void main(String args[])
	{
		int a=5;
		int b=6;
		swap s;
		s.sw();
	}
		
	void sw(int c,int d)
	{
		c=a;
		d=b;
		
		int temp;
	temp=c;
	c=d;
	d=temp;
	System.out.println("swap of value of a"+c);
	System.out.println("swap of value of b"+d);
}
}