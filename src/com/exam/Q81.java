package com.exam;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Q81 extends RecursiveTask<Integer> {
	final int n;

	Q81(int n) {
		this.n = n;
	}

	public Integer compute() {
		if (n <= 1){
			System.out.print(n+" ");
			return n;
		}
		Q81 f1 = new Q81(n - 1);
		f1.fork();
		Q81 f2 = new Q81(n - 2);
		Integer a = f2.compute() + f1.join();
		
		return a; // Line X
	}
	public static void main(String[] args){
		ForkJoinPool pool = new ForkJoinPool(10);
		System.out.println("End: "+pool.invoke(new Q81(10)));
	}

}
