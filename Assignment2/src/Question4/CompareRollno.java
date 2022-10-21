package Question4;

import java.util.*;

public class CompareRollno implements Comparator<Student>{
	@Override
	public int compare(Student stud1, Student stud2) {
		if(stud1.getRollno()<stud2.getRollno()) {
			return 1;
		}
		else if(stud1.getRollno()>stud2.getRollno()) {
			return -1;
		}
		else {
			return 0;
		}
	}

}
