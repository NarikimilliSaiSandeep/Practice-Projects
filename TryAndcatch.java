
public class TryAndcatch {

	public static void main(String[] args) {
        short[] array = new short[5];
        try 
        {
            array[23] = 5;
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array index is out of bounds"); 
        }
        finally 
        {
        System.out.println("Size of the array is: " + array.length);

	}
  }
}
