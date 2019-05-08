package Pattern;
public class Pattren24b {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= 1; j--) {
				if (i <= j) 
					{
					System.out.print("*");//if condition true
					} 
				else 
					{
					System.out.print(" ");//if condition is false
					}
				}
			System.out.println();

		}

	}
}