package ru.nemtsov.springcourse.Less91FirstRestApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.nemtsov.springcourse.Less91FirstRestApp.models.Person;
import ru.nemtsov.springcourse.Less91FirstRestApp.services.PeopleService;
import ru.nemtsov.springcourse.Less91FirstRestApp.util.PersonErrorResponse;
import ru.nemtsov.springcourse.Less91FirstRestApp.util.PersonNotFoundException;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PeopleController {


    private final PeopleService peopleService;

    @Autowired
    public PeopleController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @GetMapping()
    public List<Person> getPeople() {
        return peopleService.findAll(); // Jackson конвертирует эти объекты в JSON

    }

    @GetMapping("/{id}")
    public Person getPerson(@PathVariable("id") int id) {
        return peopleService.findOne(id);
    }

    @ExceptionHandler
    private ResponseEntity<PersonErrorResponse> handlerException(PersonNotFoundException e) {
        PersonErrorResponse response = new PersonErrorResponse(
                "Person with this id wasn't found!",
                System.currentTimeMillis()
        );

        // В Http ответе тело ответа (response) и статус в заголовке
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND); // NOT_FOUND - 404 status
    }

}
