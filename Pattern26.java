package Pattern;
public class Pattern26 {
	public static void main(String[] args) {
		for (int iter = 1; iter <= 4; iter++) {
			for (int s = 5; s >= iter; s--) {
				System.out.print(" ");
			}
			for (int n = 1; n <= iter; n++) {
				System.out.print(n);
			}

			System.out.println();

		}
	}

}
