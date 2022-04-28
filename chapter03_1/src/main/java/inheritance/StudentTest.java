package inheritance;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setGrade(1);
		
		Person p1 = s1; //upcasting(암시적) -> (Person)s1
		p1.setName("둘리");
		
		Student s2 = (Student)p1; //downcasting(명시적)
		s2.setName("또치");
	}

}
