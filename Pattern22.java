package Pattern;

public class Pattern22 {
	public static void main(String[] args) {
		for (char i = 'E'; i >= 'A'; i--) {
			for (int j = 'A'; j <= i; j++) {
				System.out.print(" " + i);
			}
			System.out.println();
		}
	}

}
