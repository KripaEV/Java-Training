package Question4;

import java.util.*;

public class StudentMain {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Student> studentList=new ArrayList<>();
		System.out.println("Enter the number of students:");
		int n=scanner.nextInt();
		scanner.nextLine();
		
		for(int i=0;i<n;i++) {
			System.out.print("Enter name of student:");
			String studName=scanner.nextLine();
			System.out.print("Enter the rollno:");
			int studRollno=scanner.nextInt();
			scanner.nextLine();
			Student student=new Student(studName, studRollno);
			studentList.add(student);
		}
		
		Collections.sort(studentList);
		
		System.out.println("The array list sorted in ascending order:");
		for(int i=0;i<n;i++) {
			System.out.println(studentList.get(i).getRollno()+":"+studentList.get(i).getName());
		}
		
		Collections.reverse(studentList);


		TreeSet<Student> revTreeList=new TreeSet<Student>(new CompareRollno());
		revTreeList.addAll(studentList);
		
		System.out.println("The tree set sorted in descending order:");

		for(Student stud:revTreeList) {
			System.out.println(stud.getRollno()+":"+stud.getName());
		}
	}	

}
