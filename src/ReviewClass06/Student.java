package ReviewClass06;

public class Student {

String name,lastName,address;
int studentId,age;

char grade;

//define behavior=methods

void study() {
	System.out.println(name+" Student is studying");
}
void doHomework() {
	System.out.println(name+" Student is doing homework");
	
}

//create a method that will return full name of a student in Upper case

	String getFullName() {
		return name.toUpperCase()+" "+lastName.toUpperCase();
	}
//create a method to display full info of a student
	void printInfo() {
		System.out.println(name+" "+lastName+" is "+age+" and live in "+address);
	} 
//created a method that will return whether student
	//is great,good,bad or average
	//based on the grade
    String rating() {
    	
    	switch(grade) {
    	
    	case'A':
    		return "great";
    	
    	case'B':
    		return "good";
    		
    	case'C':
    		return "average";
    	default:
    		return"bad";
    			
    	}
    }
    
    void takeSubject(String subject) {
    	System.out.println(name+" "+subject);
    	
    }
    
}
