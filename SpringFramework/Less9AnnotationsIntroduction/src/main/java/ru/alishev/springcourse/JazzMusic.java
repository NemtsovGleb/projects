package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music{
    public String getSong() {
        return "Whiplash";
    }
}
