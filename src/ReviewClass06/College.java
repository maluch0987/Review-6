package ReviewClass06;

public class College {
	public static void main(String[] args) {
		
		
		Student stu=new Student();
		
		stu.name="Jone";
		stu.lastName="Done";
		stu.address="Ney York";
		stu.studentId=199;
		stu.age=45;
		stu.grade='B';
		
		stu.study();
		stu.doHomework();
		stu.printInfo();
		System.out.println(stu.getFullName());
		
		//below 2 methods have return Type-String
		String raiting=stu.rating();
		System.out.println(stu.name+" is "+raiting+" student");
		
		
		
		
		
		
		
	}
	
}