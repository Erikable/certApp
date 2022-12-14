package com.erk.able.models;




import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import javax.persistence.*;

@Entity
@Table(name = "Holder")
public class Holder {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "Name must be not empty!")
    @Size(min = 3, max = 48, message = "size between 3-48 ")
    @Column(name = "name")
    private String name;

    public Holder() {
    }

    public Holder(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
