//Polymorphism
public class Sum {
     
	public int sum(int x, int y) 
    { 
        return (x + y); 
    } 
    public int sum(int x, int y, int z) 
    { 
        return (x + y + z); 
    } 
    public double sum(double x, double y) 
    { 
        return (x + y); 
    } 

	public static void main(String[] args) {
		
		Sum s = new Sum(); 
        System.out.println(s.sum(15, 35)); 
        System.out.println(s.sum(12, 33, 45)); 
        System.out.println(s.sum(8.5, 5.5)); 

	}

}
