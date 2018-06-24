package tech.valery;

public class User {
    private long id;
    private String name;

    public User() {
    }

    public User(String name) {

        this.name = name;
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
