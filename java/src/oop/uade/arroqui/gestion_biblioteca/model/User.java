package oop.uade.arroqui.gestion_biblioteca.model;

public class User {
    private static long lastId = 1;

    private Long id;
    private String fistName;
    private String lastName;
    private String email;
    private String password;

    public User(String fistName, String lastName, String email, String password) {
        this.id = lastId++;
        this.fistName = fistName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static long getLastId() {
        return lastId;
    }

    public static void setLastId(long lastId) {
        User.lastId = lastId;
    }
}
