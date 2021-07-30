package hello.game.moneyExchange;

import hello.game.Entity.Money;
import hello.game.Entity.MoneyUser;
import hello.game.out.ExchangeRate;
import org.springframework.stereotype.Component;

@Component
public class ExchangeMoneyImpl implements ExchangeMoney {

    private ExchangeRate exchangeRate;
    private MoneyUser moneyUser;

    public ExchangeMoneyImpl(ExchangeRate exchangeRate, MoneyUser moneyUser) {
        this.exchangeRate = exchangeRate;
        this.moneyUser = moneyUser;
    }

    @Override
    public int addMoney(Money money) {

        int amountOfMoney = money.getAmountOfMoney();
        int countOfMoney = money.getCountOfMoney();

        return amountOfMoney * countOfMoney;


        int amountOfMoney1 = money.getAmountOfMoney();

        String name = money.getName();



    }

    @Override
    public double exchangeMoney( Money money, String nation, MoneyUser moneyUser) {

        double rate2 = findMembership(moneyUser);

        int amount2 = addMoney(money);

        double rate =exchangeRate.findByExchangeRate(money, "JAN");

        double amountOfMoney = amount2 * rate;

        int amountOfMoney1 = money.getAmountOfMoney();

        return amountOfMoney * rate2;
    }

    private double findMembership(MoneyUser moneyUser) {

        double rate2 = 0;
        if(moneyUser.getMembership().equals("VIP")) {
            rate2 = 1.1;
        } else{
            rate2 = 1.0;
        }

        return rate2;

    }

}
