package com.reversestr;

public class ReverseString {
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// String word = sc.nextLine();
		String word = "Hippo";
		System.out.println("The word is: " + word);
		reverseAString(word);
		reverseUsingStringBuilder(word);
		reversWithoutStringBuilder(word);
	}

	private static void reverseAString(String word) {

		StringBuilder sb = new StringBuilder();

		for (int i = word.length() - 1; i >= 0; i--) {
			sb.append(word.charAt(i));
		}
		System.out.println("Reversed using for loop inside a StringBuilder: " + sb.toString());
	}

	private static void reverseUsingStringBuilder(String word) {

		StringBuilder sb = new StringBuilder(word);
		sb.reverse();

		System.out.println("Reversed using only StringBuilder method: " + sb.toString());
	}

	private static void reversWithoutStringBuilder(String word) {
		String reversed = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			reversed += word.charAt(i);
		}
		System.out.println("Reversed without StringBuilder: " + reversed);
	}
}
