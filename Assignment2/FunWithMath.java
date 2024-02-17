/*
John Skinner
2024-02-16
*/

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class FunWithMath {
    public static void main(String[] args) {

        int currentValue = 0;
        int futureValue = 1000000;

        Double annualInterestRate = Math.random() * 0.1; // random *0.1 to put it in our target range of 0% and 10%

        int yearsInFuture = 20;

        Double presentValue = (futureValue / (1 + annualInterestRate) * yearsInFuture);

        System.out.println(presentValue);

        NumberFormat dollars = NumberFormat.getCurrencyInstance(Locale.US);

        System.out.println(dollars.format(presentValue));

        NumberFormat decimal = new DecimalFormat("#.###");

        System.out.println(decimal.format(annualInterestRate));

    }
}