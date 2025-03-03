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
//        TataStocks.setStockPrice(0);
//        TataStocks.setStockPrice(90.22);

    }
}