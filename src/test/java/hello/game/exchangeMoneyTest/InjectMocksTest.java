package hello.game.exchangeMoneyTest;

import hello.game.Entity.Money;
import hello.game.Entity.MoneyUser;
import hello.game.moneyExchange.ExchangeMoneyImpl;
import hello.game.out.ExchangeRate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.Mergeable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class InjectMocksTest {

    @MockBean
    ExchangeRate exchangeRate;

    @MockBean
    MoneyUser moneyUser;

    @InjectMocks
    @Autowired
    ExchangeMoneyImpl exchangeMoney;

    @Test
    void InjectMocksTest() {
        exchangeMoney.addMoney(new Money("KOR",1000,2));

    }
}
