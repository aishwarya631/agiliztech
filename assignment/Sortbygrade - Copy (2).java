package com.at.example.assignment;

import java.util.Comparator;

public class Sortbygrade implements Comparator<Studentsort> {

	@Override
	public int compare(Studentsort o1, Studentsort o2) {
		// TODO Auto-generated method stub
		return o1.grade.compareTo(o2.grade);

	}

	
	}


