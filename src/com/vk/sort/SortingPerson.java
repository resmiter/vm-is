package com.vk.sort;

import com.vk.model.Person;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

interface SortingPerson {

    void sortByName(ArrayList<Person> people);

    void sortByAge(ArrayList<Person> people);

    void sortBySex(ArrayList<Person> people);

    default void sort(ArrayList<Person> people){
        sortByName(people);
        sortByAge(people);
        sortBySex(people);
    }
}
