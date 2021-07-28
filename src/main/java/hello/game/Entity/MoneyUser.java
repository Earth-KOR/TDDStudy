package hello.game.Entity;

public class MoneyUser {

    private String name;
    private String membership = "NORMAL";

    public MoneyUser() {
    }
    public MoneyUser(String name, String membership) {
        this.name = name;
        this.membership = membership;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }
}
