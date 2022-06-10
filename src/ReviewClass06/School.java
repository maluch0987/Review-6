package ReviewClass06;

public class School {


	public static void main(String[] args) {
		Student student1=new Student();
		student1.name="Samira";
		student1.lastName="Pashayeva";
		student1.address="Virgina";
		
		student1.studentId=101;
		student1.age=25;
		student1.grade='A';
		
		
		Student student2=new Student();
		student2.name="Omid";
		student2.lastName="Mahmoodi";
		student2.address="California";//all behavior or fields
	//	accessing variables of Student class
		student2.studentId=102;
		student2.age=18;
		student2.grade='A';
	// accessing methods of Student class
		student2.study();
		student2.doHomework();
		System.out.println("-------------");
		student1.study();
		student1.doHomework();
		
		System.out.println("-------------");
		String fullName=student1.getFullName();
		System.out.println(fullName);
		
		student2.getFullName();
		System.out.println(student2.getFullName());
		
		student1.printInfo();
		student2.printInfo();
		
		student1.takeSubject("Java");
		student2.takeSubject("Biology");
		
		}
	}
	
	
	
	
	


