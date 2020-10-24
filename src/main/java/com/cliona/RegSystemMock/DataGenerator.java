package com.cliona.RegSystemMock;

import com.cliona.SoftwareEngA1.*;

import java.util.ArrayList;

import org.joda.time.*;

public class DataGenerator {
	
	static Student s1, s2, s3;
	static Course c1, c2;
	static Module m1, m2, m3, m4;
		
	public static void main(String[] args) {
		
		s1 = new Student("Sean Byrne", 21, new LocalDate(02/9/1999), "123", new ArrayList<Course>(), new ArrayList<Module>());
		s2 = new Student("Tara Blake", 21, new LocalDate(12/12/1994), "124", new ArrayList<Course>(), new ArrayList<Module>());
		
		c1 = new Course("Computer Science", new ArrayList<Module>(), new ArrayList<Student>());
		c2 = new Course("Commerce", new ArrayList<Module>(), new ArrayList<Student>());
		
		m1 = new Module("Programming", "CT404", new ArrayList<Student>(), new ArrayList<Course>());
		m2 = new Module("Machine Learning", "CT417", new ArrayList<Student>(), new ArrayList<Course>());
		m3 = new Module("Management", "BC111", new ArrayList<Student>(), new ArrayList<Course>());
		m4 = new Module("Accounting", "BC422", new ArrayList<Student>(), new ArrayList<Course>());
		
		s1.courses.add(c1);
		s1.modules.add(m1);
		s1.modules.add(m2);
		s1.courses.add(c2);
		s1.modules.add(m3);
		s1.modules.add(m4);
		
		s2.courses.add(c2);
		s2.modules.add(m3);
		s2.modules.add(m4);
		
		m1.courses.add(c1);
		m1.students.add(s1);
		
		m2.courses.add(c1);
		m2.students.add(s1);
		
		m3.courses.add(c2);
		m3.students.add(s1);
		m3.students.add(s2);
		
		m4.courses.add(c2);
		m4.students.add(s1);
		m4.students.add(s2);
		
		c1.students.add(s1);
		c1.modules.add(m1);
		c1.modules.add(m2);
		
		c2.students.add(s1);
		c2.students.add(s2);
		c2.modules.add(m3);
		c2.modules.add(m4);
		
		String out = "Course: "+c1.courseName+" has modules:\n";
		for(int i=0; i<c1.modules.size();i++) {
			out += c1.modules.get(i).modName+"\n";
		}
		out += "Course: "+c2.courseName+" has modules:\n";
		for(int i=0; i<c2.modules.size();i++) {
			out+= c2.modules.get(i).modName+"\n";
		}
		out += "Student: "+s1.getUsername()+" is registered for the following course(s): \n";
		for(int i=0; i<s1.courses.size();i++) {
			out+= s1.courses.get(i).courseName+"\n";
		}
		out+= "and for the following modules:\n";
		for(int i=0; i<s1.modules.size();i++) {
			out+= s1.modules.get(i).modName+"\n";
		}
		out += "Student: "+s2.getUsername()+" is registered for the following course(s): \n";
		for(int i=0; i<s2.courses.size();i++) {
			out+= s2.courses.get(i).courseName+"\n";
		}
		out+= "and for the following modules:\n";
		for(int i=0; i<s2.modules.size();i++) {
			out+= s2.modules.get(i).modName+"\n";
		}
		System.out.print(out);
	}
	
}
