package DBEx.Entity.concretes;

import DBEx.Entity.abstacts.Customers;

public class Channels extends Customers {
    private int id;
    private String name;

    public Channels(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
