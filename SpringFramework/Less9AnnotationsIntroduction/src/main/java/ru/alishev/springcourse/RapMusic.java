package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music{
    public String getSong() {
        return "Candy Shop";
    }
}
