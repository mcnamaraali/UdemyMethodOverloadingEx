
public class OverloadingMethodsExercise {
 
		public static void main(String args[]) 
		{ 
			OverloadingMethodsExercise overloadingMethods = new OverloadingMethodsExercise(); 
			System.out.println(overloadingMethods.sum(10, 10)); 
			System.out.println(overloadingMethods.sum(10, 10, 10)); 
			System.out.println(overloadingMethods.sum(10.5, 10.5)); 
		
		} 
		

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
} 
