package com.cg.personDetails;

import java.util.Comparator;

public class sortUsingComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
	
		return o2.name.compareTo(o1.name);
		
	}

}
