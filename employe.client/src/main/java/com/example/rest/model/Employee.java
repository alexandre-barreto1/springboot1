package com.example.rest.model;

import com.google.common.base.Objects;

public class Employee {

    private String id;

    private String name;

    private String city;

    Employee() {
    }

    public Employee(final String id, final String name, final String city) {
        this.id = id;
        this.name = name;
        this.city = city;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("id", id)
                .add("name", name)
                .add(city, city)
                .toString();
    }
}
