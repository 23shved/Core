package ua.lviv.shved.threads;

public class MyThread extends Thread {
	int n1 = 0, n2 = 1, n3 = 0;
	private int delay = 1000;
	private int count;
	@Override
	
	
	public void run() {

		for (int i = 0; i < count; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3; 
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public MyThread(int count) {
		super();
		this.delay = delay;
		this.count = count;
	}
}
