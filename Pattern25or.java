package Pattern;
public class Pattern25or {
	public static void main(String[] args) {
		for (int it = 1; it <= 5; it++) {
			for (int space = 5; space >= it; space--)
				if (space <= it) {
					System.out.print(" ");
				} else {
					System.out.print(it);
				}
			System.out.println();

		}
	}

}
