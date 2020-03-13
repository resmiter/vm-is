package com.vk.sort;

import com.vk.model.Person;
import com.vk.sort.SortingPerson;

import java.util.*;

public class SortingPersonByComparator implements SortingPerson {

    @Override
    public void sortByName(ArrayList<Person> people) {
        people.sort(Comparator.comparing(Person::getName));
    }

    @Override
    public void sortByAge(ArrayList<Person> people) {
        people.sort((o1, o2) -> o2.getAge() - o1.getAge());
    }

    @Override
    public void sortBySex(ArrayList<Person> people) {
        people.sort(Comparator.comparing(Person::getSex));
    }
}
