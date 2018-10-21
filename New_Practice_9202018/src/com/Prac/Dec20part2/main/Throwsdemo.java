package com.Prac.Dec20part2.main;

public class Throwsdemo {
	
	public int divideno(int x, int y) throws ArithmeticException
	{
		return x/y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throwsdemo t = new Throwsdemo();
		int result=0;
		try{
			
			result=t.divideno(10, 0   );
		}catch(ArithmeticException ex)
		{
			ex.printStackTrace();
		}
		System.out.println(result);
		System.out.println("This is End of Program");

	}
	

}


