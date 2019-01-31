package pl.marekkalkowski;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Human {

    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Human> sort(List<Human> humans) {
        Collections.sort(humans, new Comparator<Human>() {
            @Override
            public int compare(Human h1, Human h2) {
                return h1.getName().compareTo(h2.getName());
            }
        });

        return humans;
    }

    public List<Human> sortWithLambda(List<Human> humans) {
        Collections.sort(humans, (h1,h2)-> h1.getName().compareToIgnoreCase(h2.getName()));
        return humans;
    }
}
