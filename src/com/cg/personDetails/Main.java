package com.cg.personDetails;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



public class Main {

	public static void main(String[] args) {
		
		Person person=new Person();
		 List<Person> persons = new ArrayList<>();
	        persons.add(new Person("Ankush", 25));
	        persons.add(new Person("Ganesh", 18));
	        persons.add(new Person("Zzzzz", 22));
	        persons.add(new Person("Sawmya", 19));
	        
	        System.out.println("*********Sort Using Comparator***********\n");
	      Collections.sort(persons , new sortUsingComparator());
	      System.out.println("Sorted by name");
	       for(int i=0; i<persons.size(); i++)
	       {
	    	   System.out.println(persons.get(i));
	       }
	       
	       Collections.sort(persons , new sortUsingComparatorAge());
	       
	       System.out.println("Sorted by age");
	       for(int i=0; i<persons.size(); i++)
	       {
	    	   System.out.println(persons.get(i));
	       }
	       
	       System.out.println("*********Sort Using Lambda***********\n");
	       
	       persons.sort((Person p1,Person p2)->p2.getAge().compareTo(p1.getAge()));
	        
	        System.out.println("Sort By Age:\n");
	        for(int i=0; i<persons.size();i++)
	        {
	        	System.out.println(persons.get(i));
	        }
	        
	        persons.sort((Person p1,Person p2)->p2.getName().compareTo(p1.getName()));
	        
	        
	        System.out.println("Sort by Name: \n");
	        for(int i=0; i<persons.size();i++)
	        {
	        	System.out.println(persons.get(i));
	        }
	        
	        System.out.println("*********Sort Using StreamLambda***********\n");
	        
	        
	        persons = persons.stream().sorted(Comparator.comparing(Person::getAge).reversed()).collect(Collectors.toList());
	        System.out.println("Sort by Age: \n");
	        for(int i=0; i<persons.size();i++)
	        {
	        	System.out.println(persons.get(i));
	        }
	        persons = persons.stream().sorted(Comparator.comparing(Person::getName).reversed()).collect(Collectors.toList());
	        System.out.println("Sort by Name: \n");
	        for(int i=0; i<persons.size();i++)
	        {
	        	System.out.println(persons.get(i));
	        }
	}

	
}
