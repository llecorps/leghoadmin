package ch.rts.si.micro.legho.clientui.beans;

public class ListUserBeans {

    private String username;
    private String client;
    private String Login;

    public ListUserBeans() {
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

    public ListUserBeans(String username, String client, String login) {
        this.username = username;
        this.client = client;
        Login = login;
    }

    @Override
    public String toString() {
        return "ListUserBeans{" +
                "username='" + username + '\'' +
                ", client='" + client + '\'' +
                ", Login='" + Login + '\'' +
                '}';
    }
}
