
public class DemonistrateSleepAndWait {
	private static Object CLOSE = new Object();
	public static void main(String[] args) throws InterruptedException {
	
        Thread.sleep(500);
        System.out.println("Thread '" + Thread.currentThread().getName() + "' is woken after sleeping for 5 seconds");
        synchronized (CLOSE) 
        {
            CLOSE.wait(500);
            System.out.println("Object '" + CLOSE + "' is woken after" + " waiting for 5 seconds");

   }
  }
}
  