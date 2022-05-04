package prob04;

public class Person {
	
	private static int numberOfPerson; // 전체 인구수
	private int age ;
	private String name;
	/* 코드 작성 */
	public Person() {
		this.age = 12;
		this.name = "";
		
			}
	public Person(String string) {
		this.name = string;
		this.age = 12;
		this.numberOfPerson++;
	}
	
	public Person(int i, String string) {
		this.age = i;
		this.name = string;
		this.numberOfPerson++;
	}
	public static String getPopulation() {
		String str = String.valueOf(numberOfPerson);
		return str;
	}
	
	public void selfIntroduce() {
		System.out.println("내 이름은 "+name+"이며, 나이는 "+age+" 입니다.");
		
	}
	
	
}
