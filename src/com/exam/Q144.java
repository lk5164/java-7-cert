package com.exam;

public class Q144 {

	public static void main(String[] args) throws InterruptedException {
		Runnable r = new Runnable() {
			public void run() {
				
				if ("One ".equals(Thread.currentThread().getName())){
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}else if("Two ".equals(Thread.currentThread().getName())){
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}else{
					System.out.println("Other Thread is executing");
				}
				System.out.print(Thread.currentThread().getName());
			}
		};
		Thread t1 = new Thread(r, "One ");
		t1.start();
//		t1.sleep(2000);
		Thread t2 = new Thread(r, "Two ");
		t2.start();
//		t2.sleep(1000);
		System.out.print("Main ");
	}

}
