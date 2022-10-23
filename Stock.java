


public class Stock {

        String symbol;
        String name;

        double previousClosingPrice = 4.5 ;
        double currentPrice =   4.35;


        public double getChangePercent() {
                return ((previousClosingPrice - currentPrice) / currentPrice) * 100;
        }

        public Stock(String symbol, String name){
                this.symbol = symbol;
                this.name = name;
                System.out.println("Symbol : " + symbol + "\nName : " + name);
                System.out.println("\nChangePercent : " + getChangePercent() +"% Increased");
        }



}
