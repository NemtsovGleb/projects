package ru.nemtsov.springcourse.Less91FirstRestApp.util;

public class PersonNotCreatedException extends  RuntimeException{
    public PersonNotCreatedException(String msg){
        super(msg);
    }
}
