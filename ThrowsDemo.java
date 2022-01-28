
public class ThrowsDemo {

    void Division() throws ArithmeticException
    {
        int num3=89,num4=25,z;
        z = num3 / num4;
        System.out.println("The result is : " + z);
    }

	public static void main(String[] args) {
		
		ThrowsDemo t = new ThrowsDemo();
        try
       {
           t.Division();
       }
       catch(ArithmeticException Ex)
       {
           System.out.println("Error : " + Ex.getMessage());
       }
       System.out.println("End of program.");


	}

}
