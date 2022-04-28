package tech.collection;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;

		for (int i = 0; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}

		for (int i = 0; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

		for (int i = 0; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

}
