package Pattern;

public class Pattern26A {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				if (i >= j) {
					System.out.print(" ");
				} else {
					System.out.print(i);
				}
			}
			System.out.println();

		}
	}

}
