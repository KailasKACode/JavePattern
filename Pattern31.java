package Pattern;
public class Pattern31 {
	public static void main(String[] args) {
		for (int i = 5; i >= 1; i--) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for (int l = 1; l <= i; l++) {
				System.out.print(l);
			}
			System.out.println();

		}
	}
}
