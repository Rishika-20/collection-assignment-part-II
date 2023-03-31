package com.knoldus.question_fifteen;
import java.util.*;

public class ComparatorExample {

        public static void main(String[] args) {

            List<Person> people = new ArrayList<>();
            people.add(new Person("Rishika",25));
            people.add(new Person("Jiya", 20));
            people.add(new Person("Shri", 10));
            people.add(new Person("Akuu",31));

            System.out.println("\nBefore sorting: " +people);

            Collections.sort(people, new PersonAgeComparator());
            System.out.println("\nAfter sorting:\n");

            for (Person member:people) {
                System.out.println(member.getName()+" "+member.getAge());

            }
        }
    }




