package com.safenar.data;

public class Ability {
    public String name;
    public String description;
    public String id;

    public Ability(String name, String description, String id) {
        this.name = name;
        this.description = description;
        this.id = id;
    }

    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean equals(Object o) {
        if (o instanceof Ability a) {
            return a.id.equals(id);
        }
        return false;
    }

    public int hashCode() {
        return id.hashCode() * 31 + name.hashCode() * 31 + description.hashCode() * 31;
    }
}
