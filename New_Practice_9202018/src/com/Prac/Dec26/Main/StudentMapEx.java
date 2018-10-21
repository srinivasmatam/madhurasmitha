package com.Prac.Dec26.Main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.Prac.Dec26.Entity.Marks;
import com.Prac.Dec26.Entity.Student;

public class StudentMapEx {
	
	Map<Student,List<Marks>> stumap = new HashMap<>();
	
	public void addStudentandMarks(Student s , List<Marks> m)
	{
		stumap.put(s, m);
	}
	
	public double getGarde()
	{
		double total=0,avg=0;
		
		for (Map.Entry<Student, List<Marks>> entry: stumap.entrySet())
		{
			
				List<Marks> marks = entry.getValue();
				for(Marks m:marks)
				{
					total+=m.getScore();
				}
				avg= total/marks.size();
		}		
		
		return avg;
		
	}
	
	public Map<Student ,List<Marks>> showRecord()
	{
		return stumap;
		
	}

}
