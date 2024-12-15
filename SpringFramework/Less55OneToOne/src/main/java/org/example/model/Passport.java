package org.example.model;

import javax.persistence.*;

@Entity
@Table(name="Passport")
public class Passport {

    @OneToOne
    @JoinColumn(name="person_id",referencedColumnName = "id")
    private Person person;

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;


    @Column(name ="passport_number")
    private int passportNumber;

    public Passport(int passportNumber) {
        this.passportNumber = passportNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Passport() {

    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "passportNumber=" + passportNumber +
                ", person=" + person +
                '}';
    }
}
