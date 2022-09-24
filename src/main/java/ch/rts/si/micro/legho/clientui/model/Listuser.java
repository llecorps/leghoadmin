package ch.rts.si.micro.legho.clientui.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Listuser {

    @Id
    private int id;
    private String username;
    private String client;
    private String Login;

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

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public Listuser() {
    }

    public Listuser(int id, String username, String client, String login) {
        this.id = id;
        this.username = username;
        this.client = client;
        Login = login;
    }

    @Override
    public String toString() {
        return "Listuser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", client='" + client + '\'' +
                ", Login='" + Login + '\'' +
                '}';
    }
}
