package hello.game.out;

import hello.game.Entity.Money;
import org.springframework.stereotype.Component;

@Component
public class ExchangeRate {

    private ExtendClass extendClass;

    public ExchangeRate(ExtendClass extendClass) {
        this.extendClass = extendClass;
    }

    public double findByExchangeRate(Money money, String nation) {
        double Rate;

        if(money.getName().equals("KOR")) {

            switch(nation) {
                case "USA":
                    Rate = 1.6;
                    break;
                case "JAN":
                    extendClass.String();
                    Rate = 2;
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
                    extendClass.String();
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
