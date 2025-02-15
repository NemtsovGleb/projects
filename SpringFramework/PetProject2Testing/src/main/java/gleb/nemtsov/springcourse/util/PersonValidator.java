package gleb.nemtsov.springcourse.util;

import gleb.nemtsov.springcourse.models.Person;
import gleb.nemtsov.springcourse.services.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.ConstraintViolation;
import java.util.Set;

@Component
public class PersonValidator implements Validator {

    private final PeopleService peopleService;

    @Autowired
    public PersonValidator(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @Override
    public boolean supports(Class<?> aClass) { return Person.class.equals(aClass);}

    @Override
    public void validate(Object o, Errors errors) {
        Person person = (Person) o;

        if(peopleService.getPersonByName(person.getName()).isPresent())
            errors.rejectValue("name", "", "Person already exists");

    }
}
