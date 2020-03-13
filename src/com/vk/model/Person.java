package com.vk.model;

public class Person {
    private int id;
    private int age;
    private Person.Sex sex;
    private String name;

    public Person(int age, Person.Sex sex, String name) {
        this.id = (int) (Math.random() * 2_147_483_647);
        this.age = age;
        this.sex = sex;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                age == person.age &&
                sex == person.sex &&
                name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "[name: " + this.name + ", sex: " + this.sex + ", age: " + this.age + "]";
    }

    public enum Sex {
        MAN("Man"), WOMAN("Woman");
        private String sex;

        Sex(String sex) {
            this.sex = sex;
        }

        @Override
        public String toString() {
            return this.sex;
        }
    }
}
