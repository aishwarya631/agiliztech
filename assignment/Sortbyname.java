package com.at.example.assignment;

import java.util.Comparator;

class Sortbyname implements Comparator<Studentsort> {

	@Override
	public int compare(Studentsort o1, Studentsort o2) {
		// TODO Auto-generated method stub
		return o1.sname.compareTo(o2.sname);
	}
	

}
