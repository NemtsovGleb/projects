package gleb.nemtsov.springcourse.dao;


import gleb.nemtsov.springcourse.models.Person;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class PersonDAO {

    private final EntityManager em;

    @Autowired
    public PersonDAO(EntityManager em) {
        this.em = em;
    }

    @Transactional(readOnly = true)
    public void testNPlus1() {
        Session session = em.unwrap(Session.class);

        //Solution
        Set<Person> people = new HashSet<>(session.createQuery("select p  from Person p LEFT JOIN FETCH p.items")
                .getResultList());

        for (Person person : people)
            System.out.println("Person " + person.getName() + " has: " + person.getItems());


//        //1 request
//        List<Person> people = session.createQuery("select p from Person p", Person.class)
//                .getResultList();
//
//
//        // N requestov to DB
//        for ( Person person : people )
//            System.out.println("Person " + person.getName() + " has: " + person.getItems());
    }
}
