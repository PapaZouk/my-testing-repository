package pl.zajavka.case2;

import java.math.BigDecimal;

record Person(String name, Long age, BigDecimal salary) {

    public Boolean doYouHaveABike() {
        return true;
    }

    public BigDecimal howMuchDoYouEarn() {
        return salary;
    }

    public Boolean doYouLikePizza() {
        return true;
    }

    public String whatDoYouLike() {
        return "Strawberries";
    }
}
