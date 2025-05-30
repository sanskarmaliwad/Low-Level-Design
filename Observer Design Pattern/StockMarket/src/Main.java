import Observable.StockObservable;
import Observable.TataStock;
import Observer.EmailAlertObserver;
import Observer.MobileAlertObserver;
import Observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {
        StockObservable TataStocks = new TataStock();

        NotificationAlertObserver mobileObserver = new MobileAlertObserver("Sanskar Maliwad");
        NotificationAlertObserver emailObserver = new EmailAlertObserver("sanskarmaliwad148@gmail.com");

        TataStocks.add(mobileObserver);
        TataStocks.add(emailObserver);

        TataStocks.setStockPrice(20.22);


        // Experimental Code 
       TataStocks.setStockPrice(0);
       TataStocks.setStockPrice(90.22);

       // Experimental Code 1
       TataStocks.setStockPrice(1);
       TataStocks.setStockPrice(888);

       //Added Experimental Code 2 
       TataStocks.setStockPrice(1299);
       TataStocks.setStockPrice(2345678);

       //Added Experimental Code 3
       TataStocks.setStockPrice(19);
       TataStocks.setStockPrice(2378);

    }
}