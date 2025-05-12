package stringMethodsTest;

public class CurrencyConversion {
    public static void main(String args[]) {

        // printing
        double amountInUSD = 100.0;
        double exchangeRateUSDToEUR = 0.85;
        System.out.println("initialAmountUSD: " + amountInUSD + "USD");

        // convert usd to eur + print 3, 4

        amountInUSD *= exchangeRateUSDToEUR;  // forgot the semicolon
        System.out.println("Amount in EUR: " + amountInUSD + "EUR");

        //Deduct expenditures 5

        amountInUSD -=55;
        System.out.println("Balance after expenditure" + amountInUSD + "EUR"); // forgot the semicxolon

        // convert back eur to usd 6

        double exchangeRateEURToUSD = 1 / exchangeRateUSDToEUR;
        amountInUSD *= exchangeRateEURToUSD;
        System.out.printf("Amount in USD after converting back: USD%.2f%n", amountInUSD);
    }
}
/*

initialAmountUSD: 100.0USD
Amount in EUR: 85.0EUR
Balance after expenditure30.0EUR
Amount in USD after converting back: USD35.29
*/
