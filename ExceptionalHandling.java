
class MyException extends Exception{
   String s1;
   MyException(String s2) {
	s1=s2;
   }
   public String toString(){ 
	return ("MyException Occurred: "+s1) ;
   }
}

public class ExceptionalHandling {
   
	class Ex{
		
	}
	public static void main(String[] args) {
		
		try{
			System.out.println("Starting of try block");
			
			throw new MyException("This is My error Message");
		}
		catch(MyException exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}
	}

}
