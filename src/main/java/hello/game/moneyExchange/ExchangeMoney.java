package hello.game.moneyExchange;

import hello.game.Entity.Money;
import hello.game.Entity.MoneyUser;

public interface ExchangeMoney {

    int addMoney(Money money);

    double exchangeMoney(Money money, String nation);


}
