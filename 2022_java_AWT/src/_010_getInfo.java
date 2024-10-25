interface GetInfo {
   String getValue(double score);
}

class Student implements GetInfo {
	double score;
	String grade;
	double sum;
	
	public Student() {
    }
   
    public Student(double score) {
       this.score = score;
    }
   
    public String getValue(double score) {
       if (score == 100) grade = "A";
       else if (score >= 90) grade = "B";
       else if (score >= 80) grade = "C";
       else if (score >= 70) grade = "D";
       else grade = "F";
       return grade;
    }
    
    void average(Student[] objects) {
       for(Student i : objects) {
          sum += i.score;
       }
       getValue(sum);
       System.out.println("평균 성적 : " + getValue(sum));
    }
}

public class _010_getInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] std = new Student[4];
		std[0] = new Student(100);
		std[1] = new Student(90);
		std[2] = new Student(80);
		std[3] = new Student(70);
		      
		for(int i=0; i<std.length; i++)
			System.out.println(std[i].getValue(std[i].score));
		
		Student ave = new Student();
		ave.average(std);
	}

}
