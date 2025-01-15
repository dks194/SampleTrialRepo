package assignment_3;

public class GradeOfStudents {

	int physics;
	int maths;
	int chemistry;

	public GradeOfStudents(int physics, int maths, int chemistry) {
		this.physics = physics;
		this.chemistry = chemistry;
		this.maths = maths;

	}

	public int total() {
		// int totalMark = this.physics+this.maths+this.chemistry;
		return this.physics + this.maths + this.chemistry;
	}

	public static String findGrade(int mark) {
		if (mark >= 80) {
			return "A";
		}
		if (mark >= 60) {
			return "B";
		}
		if (mark >= 40) {
			return "C";
		}
		return "F";

	}
	public int averageMark() {
		return total()/3;
	}

	public static void main(String[] args) {
		GradeOfStudents student1 = new GradeOfStudents(70, 80, 60);
		
		String student1Grade = findGrade(student1.averageMark());
		System.out.println("The grade of Student1 :"+student1Grade);
		
		GradeOfStudents student2 = new GradeOfStudents(10, 20, 0);
	
		String student2Grade = findGrade(student2.averageMark());
		System.out.println("The grade of Student2 :"+student2Grade);
				
	}

}
