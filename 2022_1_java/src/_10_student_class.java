class Student{
	String name;
	private String rollno;
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	int age;
}

public class _10_student_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.name = "Kim";
		s.age = 20;
		s.setRollno("0001");
		
		System.out.println("학생의 이름: " + s.name);
		System.out.println("학생의 학번: " + s.getRollno());
		System.out.println("학생의 나이: " + s.age);
		
	}

}
