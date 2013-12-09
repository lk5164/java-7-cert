/**
 * 
 */
package com.inheritance;

/**
 * @author acistek
 *
 */
public class Base {

	public void foo(Base b){
		System.out.println("In Base.foo()");
		b.bar();
	}
	public void bar(){
		System.out.println("In Base.bar()");
	}
}
