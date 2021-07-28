package hello.game.exchangeMoneyTest;

import hello.game.Entity.Money;
import hello.game.Entity.MoneyUser;
import hello.game.moneyExchange.ExchangeMoney;
import hello.game.moneyExchange.ExchangeMoneyImpl;
import hello.game.out.ExchangeRate;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class exchangeMoneyTest {

    @Mock
    ExchangeRate exchangeRate;

    @Test
    void sut_addMoney_test() {
        //red

            // given
            Money koreaMoney = new Money("KOR",1000,2);
            ExchangeMoney exchangeMoney = new ExchangeMoneyImpl(exchangeRate, new MoneyUser());

            //when
            int amount = exchangeMoney.addMoney(koreaMoney);

            //then
            Assertions.assertThat(amount).isEqualTo(2000);


        //green

            // 서비스 구현

        //blue

            // 리펙토링

    }

    @Test
    void sut_exchangeMoney_test() {
        //red

            //given
            Money koreaMoney = new Money("KOR",1000,2);
            ExchangeMoney exchangeMoney = new ExchangeMoneyImpl(exchangeRate, new MoneyUser());
            when(exchangeRate.findByExchangeRate(any(),any())).thenReturn(2.0);

            //when
            double result = exchangeMoney.exchangeMoney(new MoneyUser(), koreaMoney, "JAN");

            //then
            Assertions.assertThat(result).isEqualTo(4000);

        //green

            // 서비스 구현

        //blue

            // 리펙토링
    }

    @Test
    void sut_membership_test() {
        //red

        //given
        Money koreaMoney = new Money("KOR", 1000, 2);
        ExchangeMoney exchangeMoney = new ExchangeMoneyImpl(exchangeRate, new MoneyUser());
        MoneyUser moneyUser = new MoneyUser("이상권","VIP");
        when(exchangeRate.findByExchangeRate(any(),any())).thenReturn(2.0);

        //when
        double result = exchangeMoney.exchangeMoney(moneyUser, koreaMoney, "JAN");

        //then
        Assertions.assertThat(result).isEqualTo(4000 * 1.1);

    }

}
