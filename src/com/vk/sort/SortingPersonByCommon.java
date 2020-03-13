package com.vk.sort;

import com.vk.model.Person;
import com.vk.sort.SortingPerson;

import java.util.ArrayList;

public class SortingPersonByCommon implements SortingPerson {

    private void swap(ArrayList<Person> people, int firstIndex, int secondIndex) {
        Person person = people.get(firstIndex);
        people.set(firstIndex, people.get(secondIndex));
        people.set(secondIndex, person);
    }

    @Override
    public void sortByName(ArrayList<Person> people) {
        for (int i = 0; i < people.size() - 1; i++) {
            for (int j = i; j < people.size(); j++) {
                if (people.get(i).getName().compareTo(people.get(j).getName()) < 0) {
                    swap(people, i, j);
                }
            }
        }
    }

    @Override
    public void sortByAge(ArrayList<Person> people) {
        for (int i = 0; i < people.size() - 1; i++) {
            for (int j = i; j < people.size(); j++) {
                if (people.get(i).getAge() < people.get(j).getAge()) {
                    swap(people, i, j);
                }
            }
        }
    }

    @Override
    public void sortBySex(ArrayList<Person> people) {
        for (int i = 0; i < people.size() - 1; i++) {
            for (int j = i; j < people.size(); j++) {
                if (people.get(i).getSex().compareTo(people.get(j).getSex()) < 0) {
                    swap(people, i, j);
                }
            }
        }
    }
}
