package oopcoding;

import java.util.ArrayList;

public class PersonMain {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("Alice", 25, "Female"));
        people.add(new Person("Bob", 17, "Male"));
        people.add(new Person("Charlie", 30, "Male"));
        people.add(new Person("David", 16, "Male"));
        people.add(new Person("Eve", 20, "Female"));
        people.add(new Person("Frank", 19, "Male"));
        people.add(new Person("Grace", 18, "Female"));
      
        people.add(new Person("Jack", 15, "Male"));

        System.out.println("Eligible voters:");

        for (Person person : people) {
            if (person.isEligibleToVote()) {
                System.out.println(person.getName());
            }
        }
    }
}
