package gleb.nemtsov.springcourse.models;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;


@Entity
@Table(name="Item")
public class Item {


    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "Item name should not be empty")
    @Column(name="item_name")
    private String itemName;


    @ManyToOne
    @JoinColumn(name="person_id", referencedColumnName = "id")
    private Person owner;

    public Item(String itemName, Person owner) {
        this.itemName = itemName;
        this.owner = owner;
    }

    public Item() {
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", itemName='" + itemName + '\'' +
                '}';
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
