package Ex4Generic;

class Person implements Comparable<Person> 
{
 private String firstName;
 private String surname;
 public Person(String firstName, String surname) 
 {
 this.firstName = firstName;
 this.surname = surname;
 }
 public String toString() 
 {
 return firstName + " " + surname;
 }
 public int compareTo(Person person) 
 {
 int result = surname.compareTo(person.surname);
 return result == 0 ? firstName.compareTo(((Person) 
person).firstName) : result;
 }
}