package gleb.nemtsov.springcourse.dao;

import gleb.nemtsov.springcourse.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_COUNT,"Sergey"));
        people.add(new Person(++PEOPLE_COUNT,"Gleb"));
        people.add(new Person(++PEOPLE_COUNT,"Ilya"));
        people.add(new Person(++PEOPLE_COUNT,"Alexander"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }
}
