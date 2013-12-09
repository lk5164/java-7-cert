package com.inheritance;

public class Derived extends Base {
	public void foo(Base b){
		System.out.println("In Derived.foo()");
		b.bar();
	}
	public void bar(){
		System.out.println("In Derived.bar()");
	}
}
