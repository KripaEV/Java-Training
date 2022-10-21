package Question4;

import java.util.*;

public class Student implements Comparable<Student>{
	private String name;
	private Integer rollno;
	
	public Student(String name, int rollno) {
		this.name=name;
		this.rollno=rollno;
		
	}
	public String getName() {
		return name;
	}
	
	public int getRollno() {
		return rollno;
	}
	@Override
	public int compareTo(Student stud) {
		return rollno.compareTo(stud.rollno);
	}
	
	
}
