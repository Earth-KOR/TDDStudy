package hello.game.Entity;

public class Money {

    private String name;
    private int amountOfMoney;
    private int countOfMoney;

    public Money(String name, int amountOfMoney, int countOfMoney) {
        this.name = name;
        this.amountOfMoney = amountOfMoney;
        this.countOfMoney = countOfMoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(int amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public int getCountOfMoney() {
        return countOfMoney;
    }

    public void setCountOfMoney(int countOfMoney) {
        this.countOfMoney = countOfMoney;
    }
}
