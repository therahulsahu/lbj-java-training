
public class Demo1 {
	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new Worker1());
		thread1.start();
		
		Thread thread2 = new Worker();
		thread2.start();
		
	}
}


class Worker1 implements Runnable{
	@Override
	public void run() {
		
		for(int i = 0; i < 10; ++i) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().toString() + i);
		}
		
		
	}
}

class Worker extends Thread {
	@Override
	public void run() {
		
		for(int i = 0; i < 10; ++i) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().toString() + i);
		}
		
	}
}