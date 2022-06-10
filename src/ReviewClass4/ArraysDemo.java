package ReviewClass4;

public class ArraysDemo {

	public static void main(String[] args) {
		// should create an array
String name="Oleg";
String name2="King";
String name3= "Mumtaz";

//should not create an array
String city="Ney York";
String country="USA";
String cotinent="America";
//only used 5% of the times

String[]names= {"Oleg","King","Mumtaz"};
//95% of the times you guys use this approach
String[] names2=new String[3];//create an empty array
names[0]="Oleg";//stores Oleg on first position
names[1]="King";
names[2]="Mumtaz";

	}

}
