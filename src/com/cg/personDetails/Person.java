package com.cg.personDetails;
import java.util.Comparator;
import java.util.List;

public class Person implements Comparator<Person> {

	

	     String name;
	     private Integer age;

	     public Person() {
	           super();
	     }

	     public Person(String name, Integer age) {
	           super();
	           this.name = name;
	           this.age = age;
	     }

	     public String getName() {
	           return name;
	     }

	     public void setName(String name) {
	           this.name = name;
	     }

	     public Integer getAge() {
	           return age;
	     }

	     public void setAge(Integer age) {
	           this.age = age;
	     }

	     @Override
	     public String toString() {
	           return "Person [name=" + name + ", age=" + age + "]";
	     }
	    
	    /* void sortUsingComparator(List<Person> personList) {
	    	
	     }

	     private void sortUsingLambda(List<Person> personList) {
	                

	     }

	     private void sortUsingStreamLambda(List<Person> personList) {
	                

	     }*/

	     @Override
	 		public int compare(Person o1, Person o2) {
	 			
	    	 return o2.name.compareTo(o1.name);
	    	 }

		public Comparator sortUsingComparator(List<Person> persons) {
			
			return null;
		}
	     

		

	}

