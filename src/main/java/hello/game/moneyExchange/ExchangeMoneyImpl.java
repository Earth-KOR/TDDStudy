package hello.game.moneyExchange;

import hello.game.Entity.Money;
import hello.game.Entity.MoneyUser;
import hello.game.out.ExchangeRate;
import org.springframework.stereotype.Component;

@Component
public class ExchangeMoneyImpl implements ExchangeMoney {

    private ExchangeRate exchangeRate;

    public ExchangeMoneyImpl(ExchangeRate exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    @Override
    public int addMoney(Money money) {
        return 0;
    }

    @Override
    public double exchangeMoney( Money money, String nation) {

        return 0;
    }


}
