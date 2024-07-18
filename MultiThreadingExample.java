package apjfsa;

public class DemoThread extends Thread {
	String threadName;
	
	public DemoThread(String threadName) {
		super(threadName);
		this.threadName= threadName;
	}

	public void run() {
		
		System.out.println("Name:"+this.getName());
		System.out.println("Prioroty:"+this.getPriority());
		System.out.println("ID:"+this.getName());
		
		try {
			this.sleep(2000);

    	}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("ID:"+this.getId());


		
	}
}

public class MultiThreadingExample {

	public static void main(String[] args) {
		//1.New Thread
		DemoThread demo=new DemoThread("demoThread");
		//2.Runnable thread
		demo.start();
		
		DemoThread demo1=new DemoThread("demo1 Thread");
		
		demo1.setPriority(8);
		demo1.start();
		
		DemoThread demo2=new DemoThread("demo2 Thread");
		demo2.start();
		
		DemoThread demo3=new DemoThread("demo3 Thread");
		demo3.start();

		
		
		
		
		{

	}

	}
	
}
