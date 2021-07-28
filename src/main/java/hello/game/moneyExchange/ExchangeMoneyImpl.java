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

        int amount = money.getAmountOfMoney();
        int count = money.getCountOfMoney();

        return amount * count;
    }

    @Override
    public double exchangeMoney(MoneyUser moneyUser, Money money, String nation) {

        double rate = exchangeRate.findByExchangeRate(money, nation);

        return addMoney(money) * (findByRate(moneyUser)*rate);
    }

    private double findByRate(MoneyUser moneyUser) {

        double rate = 0;

        if(moneyUser.getMembership().equals("VIP")) {
            rate = 1.1;
        }else if(moneyUser.getMembership().equals("VVIP")) {
            rate = 1.2;
        }else{
            rate = 1.0;
        }

        return rate;
    }
}
