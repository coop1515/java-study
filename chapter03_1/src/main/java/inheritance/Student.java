package inheritance;

public class Student extends Person{
	private int grade;
	private String major;
	public Student() {
		//자식의 모든 생성자에서 부모의 특정 생성자를 명시(explicity)하지 않으면 암시적(implicity)으로
		//부모의 기본 생성자(super();)가 자식 생성자 코드 앞에 호출된다.
		//super(); //안써줘도 자동으로 들어가고 첫 줄에 안적으면 에러남.
		System.out.println("Student() called");
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
}
