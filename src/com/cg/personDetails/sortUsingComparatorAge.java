package com.cg.personDetails;

import java.util.Comparator;

public class sortUsingComparatorAge implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		
		return o2.getAge().compareTo(o1.getAge());
	}


}
