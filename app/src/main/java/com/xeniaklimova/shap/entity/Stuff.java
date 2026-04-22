package com.xeniaklimova.shap.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name="stuff", schema="shapdev")
public class Stuff {
    @Id
    @Column(length = 40)
    private String id;

    @Column(length = 100)
    private String name;

    public Stuff() {
        this.id = UUID.randomUUID().toString();
    }

    public Stuff(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
