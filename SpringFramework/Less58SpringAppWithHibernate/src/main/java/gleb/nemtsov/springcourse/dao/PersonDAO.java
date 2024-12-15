package gleb.nemtsov.springcourse.dao;

import gleb.nemtsov.springcourse.models.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {

    private final SessionFactory sessionFactory;

    public PersonDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }



    @Transactional(readOnly = true)
    public List<Person> index() {
        Session session = sessionFactory.getCurrentSession();

        List<Person> people = session.createQuery("select p from Person p", Person.class)
                .getResultList();



        return people;
    }

    public Person show(int id) {
        return null;
    }

    public void save(Person person) {

    }

    public void update(int id, Person updatePerson) {

    }

    public void delete(int id) {

    }
}
