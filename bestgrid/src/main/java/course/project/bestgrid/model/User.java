package course.project.bestgrid.model;

import course.project.bestgrid.model.enumerate.AccessLevel;

public class User {
    private int login;
    private String password;
    private AccessLevel accessLevel;
    
    public User() {
    }
    public int getLogin() {
        return login;
    }
    public void setLogin(int login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public AccessLevel getAccessLevel() {
        return accessLevel;
    }
    public void setAccessLevel(AccessLevel accessLevel) {
        this.accessLevel = accessLevel;
    }
    
}
