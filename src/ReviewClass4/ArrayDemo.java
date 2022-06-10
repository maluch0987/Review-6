package ReviewClass4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = new String[5];// creates an empty array of size 5 to store
		names[0] = "Ahmed";
		names[1] = "Kaiser";
		names[2] = "Abdulsamad";
		names[3] = "Zammer";
		names[4] = "Elisa";

		Scanner zammer = new Scanner(System.in);

		names[0] = zammer.next();
		names[1] = zammer.next();
		names[2] = zammer.next();
		names[3] = zammer.next();
		names[4] = zammer.next();
		for(int i=0;i<=4;i++) {
			names[i]=zammer.next();
		}
		
		System.out.println(names);
	}

}
