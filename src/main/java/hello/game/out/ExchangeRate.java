package hello.game.out;

import hello.game.Entity.Money;
import org.springframework.stereotype.Component;

@Component
public class ExchangeRate {

    public double findByExchangeRate(Money money, String nation) {
        double Rate;

        if(money.getName().equals("KOR")) {

            switch(nation) {
                case "USA":
                    Rate = 1.6;
                    break;
                case "JAN":
                    Rate = 2.3;
                    break;
                default:
                    Rate = 1.0;

                    break;
            }

        } else {
            switch(nation) {
                case "USA":
                    Rate = 1.3;
                    break;
                case "KOR":
                    Rate = 1.5;
                    break;
                default:
                    Rate = 1.0;
                    break;
            }
        }

    return Rate;
    }
}
