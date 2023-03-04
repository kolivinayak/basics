package tech.basic;

import java.util.Scanner;

public class CountCharWithinString {

	public static void main(String[] args) {

		String str = "aaabbbbccca";

		char charr[] = str.toCharArray();
		int count = 0, j;

		for (int i = 0; i < charr.length; i++) {
			for (j = i; j < charr.length; j++) {
				if (charr[i] == charr[j]) {
					count = count + 1;
				} else {
					i = j - 1;
					break;
				}
			}
			if (count != 0) {
				System.out.println("The count of char " + charr[i] + " : " + count);
				count = 0;
			}
		}
	}

}
