package Pattern;

public class Pattern25 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for (int S = 1; S <= i; S++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
