package com.exam;

public class Q22_B extends Q22_A
{

	int a = 7;

	String doA()
	{
		return "b1";
	}

	public static String doA2()
	{
		return "b2";
	}

	void go()
	{
		Q22_A myA = new Q22_B();
		System.out.print(myA.doA() + myA.doA2() + myA.a);
	}

	public static void main(String[] args)
	{
		new Q22_B().go();

	}

}
