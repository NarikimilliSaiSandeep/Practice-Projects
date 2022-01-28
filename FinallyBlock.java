
public class FinallyBlock {

	public static void main(String[] args) {
		int num5=37,num6=0,k=0;
        try
        {
            k = num5 / num6;
        }
        catch(ArithmeticException Ex)
        {
            System.out.println("Error : " + Ex.getMessage());
        }
        finally
        {
            System.out.println("The result is : " + k);


	}
  }
}
