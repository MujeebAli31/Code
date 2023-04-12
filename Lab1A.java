package monmouth.edu.student;
import java.io.PrintStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Lab1A {

	public static void main(String[] args) {
		try {
			PrintStream newIO = new
			PrintStream(Lab1Constants.LOGFILENAME);
			System.setOut(newIO);
			System.setErr(newIO);
			} catch (FileNotFoundException e) {
			System.err.println(e.getMessage() + " Cannot redirect STDERR or STDOUT ");
			e.printStackTrace();
			System.exit(Lab1Constants.REDIRECTFAILURE);
			}
		Student students[] = new Student[]{
				new Student(100,18,"John"),
				new Student(101,19,"Jane"),
				new Student(102,20,"Larry"),
				new Student(103,20,"Karen"),
				new Student(104,21,"Karl")};
System.out.println("The number of students: "+students.length);
//loop that references through each student array
		for(Student student: students)
		{
			System.out.print(students.toString());
		}
//loop switching larrys age to 21
		for(Student student: students)
		{
			if(student.getName().equals("Larry")) {
				student.setAge(21);
			}	
		}
//loop that iterates through each reference in the students array < 20
		System.out.println("Student < 20:");
		for(Student student: students)
		{
			if(student.getAge()<20){
				System.out.println(student.toString());
			}
}
//new array to reference newStudents at a capacity of 3
		Student[] newStudents = new Student[3];
		int atNumber=0;
		for(Student student: students)
		{
			if(student.getName().equals("Larry")||student.getName().equals("Karen")||student.getName().equals("Karl"))
			{
				newStudents[atNumber]=student;
			atNumber++;
		}

		}
		//loop that iterates through the newStudents array
		System.out.println("New students: ");
		for(Student student: newStudents)
		{
				
			System.out.println(student.toString());
		}
		}
}


		

