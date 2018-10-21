package com.Prac.Dec26.Main;

import java.util.ArrayList;
import java.util.List;

import com.Prac.Dec26.Entity.Marks;
import com.Prac.Dec26.Entity.Student;

public class StudentMain {

	public static void main(String[] args) {
		Student s = new Student("S101","Madhu");
		List<Marks> marks = new ArrayList<>();
		marks.add(new Marks("Subject1" , 90));
		marks.add(new Marks("Subject2",85));
		marks.add(new Marks("Subject3",87));
		
		StudentMapEx stu = new StudentMapEx();
		stu.addStudentandMarks(s, marks);
		double avg = stu.getGarde();
		if(avg>90)
		{
			s.setGrade("Outstanding");
		}else if(avg>80 && avg<=90)
		{
			s.setGrade("Excellent");
		}else if(avg>70 && avg<=80)
		{
			s.setGrade("Meet Expection");
		}else if(avg>55 && avg<=35)
		{
			s.setGrade("Fair");
		}else
		{
			s.setGrade("Fail");
		}
		
		System.out.println(stu.showRecord().keySet());
	}

}
