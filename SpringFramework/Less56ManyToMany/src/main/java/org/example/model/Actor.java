package org.example.model;


import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Actor")
public class Actor {


    @Id
    @Column(name="actor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="age")
    private int age;

    @ManyToMany
    @JoinTable(
            name="Actor_Movie",
            joinColumns =@JoinColumn(name = "actor_id"),
            inverseJoinColumns = @JoinColumn(name ="movie_id")
    )
    private List<Movie> movies;

    public List<Movie> getMovies() {
        return movies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return id == actor.id && age == actor.age && Objects.equals(name, actor.name) && Objects.equals(movies, actor.movies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, movies);
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public Actor(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public Actor() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
