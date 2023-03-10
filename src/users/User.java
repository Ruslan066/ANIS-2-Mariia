package users;
import features.Feature;

import java.io.Serializable;

public abstract class User extends Feature implements Serializable {
    private final int id;
    private final String name;
    private final String phoneNumber;
    private final String login;
    private final String password;
    private final boolean isEmployee;

    public User(int id, String name, String phoneNumber, String login, String password, boolean isEmployee) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.login = login;
        this.password = password;
        this.isEmployee = isEmployee;
    }

    public abstract void showUserInfo();

    //Getter
    public int getId() { return id; }
    public String getLogin() {
        return login;
    }
    public String getName() { return name; }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getPassword() {
        return password;
    }
    public boolean isEmployee() {
        return isEmployee;
    }
}
