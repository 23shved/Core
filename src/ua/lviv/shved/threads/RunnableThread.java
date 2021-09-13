package ua.lviv.shved.threads;

public class RunnableThread implements Runnable {
	int n1 = 0, n2 = 1, n3 = 0;
	private int delay = 1000;
	private int count;
	private Thread thread;

	public RunnableThread(int count) {
		super();
		this.count = count;
		this.thread = new Thread(this);
		thread.start();

	}

	@Override
	public synchronized void run() {

		int n0 = 0;
		int n1 = 1;
		int n2;
		if (count < 1) {
			System.out.println("Less than zero:");
		} else if (count == 1) {
			System.out.println(n0);
		} else {
			reverse();
		}
	}
	public void reverse(){
		int a[] = new int[count];

		a[0] = 0;
		a[1] = 1;
 
		for (int i = 2; i < count; i++) {

			a[i] = a[i - 2] + a[i - 1];
		}

		for (int i = count - 1; i >= 0; i--) {

			System.out.print(a[i] + " ");
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
