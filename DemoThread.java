package apjfsa;

public class DemoThread implements Runnable{
	
	public void run() {
		System.out.println("Thread name:"+Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		
	}
}
public class RunnableThread{
	public static void main(String args[]) {
		
		System.out.println(Thread.currentThread().getName());
		
		DemoThread dthread=new DemoThread();
		
		
		Thread t=new Thread(dthread,"Demo one");
		t.start();
	}
}