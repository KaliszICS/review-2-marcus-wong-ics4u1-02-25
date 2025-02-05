import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner s = new Scanner(System.in);
		String word;
		System.out.print("In: ");
		word = s.nextLine();

		System.out.println(word);

		
	}

	public static void q2() {
		//Write question 2 code here
		Scanner s2 = new Scanner(System.in);
		int num;
		int num2;
		System.out.print("In: ");
		num = s2.nextInt();
		System.out.print("In: ");
		num2 = s2.nextInt();
		s2.nextLine();

		System.out.println(num / num2);
		System.out.println(num % num2);
	}

	public static void q3() {
		//Write question 3 code here
		Scanner s3 = new Scanner(System.in);
		String word2;
		System.out.print("In: ");
		word2 = s3.nextLine();

		System.out.println(word2 + " was the text you wrote");


		
	}

	public static void q4() {
		//Write question 4 code here
		Scanner s4 = new Scanner(System.in);
		int num;
		System.out.print("In: ");
		num = s4.nextInt();
		s4.nextLine();

		System.out.println(num * 5);


		
	}

	public static void q5() {
		//Write question 5 code here
		Scanner s5 = new Scanner(System.in);
		boolean trueFalse;
		System.out.print("In: ");
		trueFalse = s5.nextBoolean();
		s5.nextLine();

		System.out.println(trueFalse + " is a boolean");
		
	}

	public static void q6() {
		//Write question 6 code here
		Scanner s6 = new Scanner(System.in);
		double fracNum;
		System.out.print("In: ");
		fracNum = s6.nextDouble();
		s6.nextLine();

		System.out.println(fracNum - 3.2);
		
	}

}
