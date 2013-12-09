package com.thread;

public class Counter implements Runnable
{

	@Override
	public void run()
	{
		incrementRunAfterBall();
		incrementBallAfterRun();

	}
	public void incrementRunAfterBall(){
		synchronized(Runs.class) {
			synchronized(Balls.class) {
				Balls.balls++;
				Runs.runs++;
			}
		}
	}
	public void incrementBallAfterRun(){
		synchronized(Balls.class) {
			synchronized(Runs.class) {
				Balls.balls++;
				Runs.runs++;
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException
	{
		Counter c = new Counter();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		
		t1.start();
		t2.start();
		System.out.println("Waiting for threads to complete execution...");
		
		t1.join();
		t2.join();
		System.out.println("Done.");

	}

}
