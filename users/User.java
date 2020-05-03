package users;

public class User {
    protected String name;
    protected int id;

    public User(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}