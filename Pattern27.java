package Pattern;
public class Pattern27 {
	public static void main(String[] args) {
		int n=5;
		for (int i = 1; i <= n; i++) {
			for (int j = n-1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print((char)(i+65));
			}
			System.out.println();
		}
	}

}
