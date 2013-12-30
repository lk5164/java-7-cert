package com.exam;


public class Q116 extends Q116_Base{
	public void process() throws Exception{
		super.process();
		System.out.println("Success!");
	}
	public static void main(String[] args){
		try{
			new Q116().process();
		}catch(Exception e){
			System.out.println(e.getClass());
		}
	}
}
