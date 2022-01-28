
public class MyThread extends Thread {

	public void run()
 	{
  		System.out.println("co-existed thread start running");
}

	public static void main(String[] args) {
		
		MyThread mt = new MyThread();
  		mt.run();

	}

}
