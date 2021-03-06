package ru.etg.prog.database;

/**
 * Created by Prog on 08.11.2016.
 */
public class Users {
    private int id;
    private String username;
    private String password;

    public Users() {
    }

    public Users(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Users(String password, int id, String username) {
        this.password = password;
        this.id = id;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()
                + "{ id:" + id
                + ", username: " + username
                + ", password: " + password
                + "}";
    }
}
