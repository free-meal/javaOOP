// String data field named symbol
// string data field named name
// double data field named previousClosingPrice prior days price
// double data field named currentPrice current price
// constructor w/ symbol, name, and previous price
// getChangePercent returns percentage difference in price from yesterday to current
// Create Stock object symbol = ORCL, name = Oracle Corporation, previous = 34.5, current = 34.35
// print testStock change percentage
public class Stock {
    String name = "";
    String symbol = "";
    double previousClosingPrice;
    double currentPrice;

    Stock(String newSymbol, String newName, double newPreviousClosingPrice){
        name = newName;
        symbol = newSymbol;
        previousClosingPrice = newPreviousClosingPrice;
    }

    double getChangePercent(){
        return ((previousClosingPrice - currentPrice)/previousClosingPrice) * 100.00;
    }

    void setCurrentPrice(double newCurrentPrice){
        currentPrice = newCurrentPrice;
    }

    public static void main(String[] args){
        Stock testStock = new Stock("ORCL", "Oracle Corporation", 34.5);
        testStock.setCurrentPrice(34.35);
        System.out.println(testStock.getChangePercent());
    }
}




