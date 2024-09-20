package Creational.Builder;

public class Person {

    private String name;
    private String surName;
    private int age;

    public Person(Builder personBuilder) {
        name = personBuilder.name;
        surName = personBuilder.surName;
        age = personBuilder.age;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", surName=" + surName + ", age=" + age + "]";
    }

    public static class Builder {
        private String name;
        private String surName;
        private int age;



        public Builder withName(String name) {
            this.name = name;
            return this;
        }
        public Builder withSurName(String surName) {
            this.surName = surName;
            return this;
        }
        public Builder withAge(int age) {
            this.age = age;
            return this;
        }
        public Person build() {
            return new Person(this);
        }
    }
}
