package org.newproj;

public class ProgramTasks {

	public static void main(String[] args) {

		System.out.println("Program No : 1");
		System.out.println("===============");
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("Even Number  -->  " + i);
			} else {
				System.out.println("Odd Number  -->  " + i);
			}
		}

		// =====================================================================================================

		System.out.println("\n\n" + "Program No : 2"); // Sum even numbers 2,4,6,8,10
		System.out.println("===============");

		int sum = 0;

		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("Sum of even number : " + sum);

		// =====================================================================================================

		System.out.println("\n\n" + "Program No : 3"); // To print even numbers 2,4,6,8,10
		System.out.println("===============");

		for (int i = 0; i <= 10; i += 2) {
			System.out.println(i);
		}

		// =====================================================================================================

		System.out.println("\n\n" + "Program No : 4"); // To print count of odd and even from 0 to 100
		System.out.println("===============");

		int oddCount = 0, evenCount = 0;

		for (int num = 1; num <= 100; num++) {
			if (num % 2 == 0) {
				evenCount = evenCount + 1;
			} else {
				oddCount = oddCount + 1;
			}
		}
		System.out.println("Even Number Counts : " + evenCount);
		System.out.println("Odd Number Counts : " + oddCount);

		// =====================================================================================================

		System.out.println("\n\n" + "Program No : 5"); // Convert integer to string and print in reverse order
		System.out.println("===============");

		int a = 123;
		String rev = "";
		String s = Integer.toString(a);
		System.out.println(s);

		for (int i = s.length() - 1; i >= 0; i--) {

			char ch = s.charAt(i);
			rev = rev + ch;
		}
		System.out.println("Reversed String : " + rev);

		// =====================================================================================================

		// System.out.println("\n\n" + "Program No : 6"); // Convert String to Integer
		// and print in reverse order
		// System.out.println("===============");
		//
		// String s1 = "9876";
		// int n = Integer.parseInt(s1);
		// for (int i = n; i >= 0; i++) {
		// char ch = s1.charAt(i);
		//
		// }

		// =====================================================================================================

		System.out.println("\n\n" + "Program No : 7"); // Reverse a number
		System.out.println("===============");

		int num = 12345, reminder = 0, result = 0;

		while (num > 0) {
			reminder = num % 10;
			result = (result * 10) + reminder;
			num = num / 10;
		}

		System.out.println("Reverse the number : " + result);

		// =====================================================================================================

		System.out.println("\n\n" + "Program No : 8"); // Reverse a number and check the result is Palindrome or not
		System.out.println("===============");

		int n = 5225, rem = 0, res = 0;
		int num2 = n;

		while (n > 0) {
			rem = n % 10;
			res = (res * 10) + rem;
			n = n / 10;
		}

		System.out.println("Reverse the number : " + res);

		if (num2 == res) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}

		// =====================================================================================================

		System.out.println("\n\n" + "Program No : 9"); // Sum of digits in a number
		System.out.println("===============");

		int num1 = 12345, reminder1 = 0, result1 = 0;

		while (num1 > 0) {
			reminder1 = num1 % 10;
			result1 = result1 + reminder1;
			num1 = num1 / 10;
		}

		System.out.println("Sum of digits in a number : " + result1);

		// =====================================================================================================

		System.out.println("\n\n" + "Program No : 10"); // Count of digits in a number
		System.out.println("===============");

		int num3 = 1234, count = 0;

		while (num3 > 0) {
			count++;
			num3 = num3 / 10;
		}

		System.out.println("Count of digits in a number : " + count);

		// =====================================================================================================

		System.out.println("\n\n" + "Program No : 11"); // Product of digits in a number
		System.out.println("================");

		int num4 = 555, reminder2 = 0, result2 = 1;

		while (num4 > 0) {
			reminder2 = num4 % 10;
			result2 = result2 * reminder2;
			num4 = num4 / 10;
		}

		System.out.println("Product of digits in a number : " + result2);

		// =====================================================================================================

		System.out.println("\n\n" + "Program No : 12"); // Whether the number is Armstrong number or not
		System.out.println("================");

		int num5 = 153, reminder3 = 0, result3 = 0;
		int n1 = num5;

		while (num5 > 0) {
			reminder3 = num5 % 10;
			result3 = result3 + (reminder3 * reminder3 * reminder3);
			num5 = num5 / 10;
		}

		if (n1 == result3) {
			System.out.println(n1 + " is an Armstrong number");
		} else {
			System.out.println(n1 + " is not an Armstrong number");
		}

		// =====================================================================================================

		System.out.println("\n\n" + "Program No : 13"); // Reverse a String using toCharArray()
		System.out.println("================");

		String s1 = "Java";
		String s2 = "";

		char[] ca = s1.toCharArray();
		for (int i = ca.length - 1; i >= 0; i--) {

			s2 = s2 + ca[i];
		}
		System.out.println("Reversed String using toCharArray : " + s2);

		// =====================================================================================================

		System.out.println("\n\n" + "Program No : 14"); // Expected Output : "class java to welcome"
		System.out.println("================");

		String we = "Welcome to java class";
		String rev1 = "";

		String[] sp = we.split("");

		for (int i = sp.length - 1; i >= 0; i--) {
			rev1 = rev1 + sp[i];
		}
		System.out.println("Input : " + we);
		System.out.println("Expected Output : " + rev1);

		// =====================================================================================================

		System.out.println("\n\n" + "Program No : 15"); // Expected Output : "emocleW ot avaj ssalc"
		System.out.println("================");

		String wel = "Welcome to java class";
		String rev2 = " ";

		String[] spl = wel.split(" ");
		for (String wordRev : spl) {

			String re = "";
			for (int i = wordRev.length() - 1; i >= 0; i--) {
				re = re + wordRev.charAt(i);
			}
			rev2 = rev2 + " " + re;
		}
		System.out.println("Input : Welcome to java class");
		System.out.println("Expected Output :"+rev2);
		
		// =====================================================================================================

		System.out.println("\n\n" + "Program No : 16"); // Expected Output : "Welcome To Java Class"
		System.out.println("================");
		
		String w1 = "welcome to java class";
		String res1 = " ";

		String[] spli = wel.split(" ");
		for (String wordRev : spli) {

				char ch = wordRev.charAt(0);
				res1 = res1 + Character.toUpperCase(ch) + wordRev.substring(1) + " "; 
		}
		System.out.println("Input : welcome to java class");
		System.out.println("Expected Output :"+res1);
	}

}
