package ReviewClass4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter numbers of the array");
		int size = scanner.nextInt();
		String[] names = new String[size];
		for (int i = 0; i <names.length; i++) {
			names[i] = scanner.next();

		}
		System.out.println(Arrays.toString(names));

	}

}
