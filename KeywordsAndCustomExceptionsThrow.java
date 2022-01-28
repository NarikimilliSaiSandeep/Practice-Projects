
public class KeywordsAndCustomExceptionsThrow {

	public static void main(String[] args) {
        int num1=23,num2=5,n;

        try
        {
            if(num2==0)        
                throw(new ArithmeticException("Can't divide by zero."));
            else
            {
                n = num1 / num2;
                System.out.println("Result is : " + n);
            }
        }
        catch(ArithmeticException Ex)
        {
            System.out.println("Error : " + Ex.getMessage());
        }

        System.out.println("End of the program");


	}

}
