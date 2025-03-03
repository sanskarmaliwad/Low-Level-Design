package Observable;

import Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class TataStock implements StockObservable {
    private double stockPrice = 0;
    List<NotificationAlertObserver> observerList = new ArrayList<NotificationAlertObserver>();

    public void add(NotificationAlertObserver observer)
    {
        observerList.add(observer);
    }

    public void remove(NotificationAlertObserver observer)
    {
        observerList.remove(observer);
    }

    public void notifySubscribers()
    {
        for(NotificationAlertObserver observer : observerList)
        {
            observer.update(stockPrice);
        }
    }

    public double getStockPrice()
    {
        return stockPrice;
    }

    public void setStockPrice(double stockPrice)
    {
        if(this.stockPrice == 0)
        {
            this.stockPrice = stockPrice;
            notifySubscribers();
        }else
        {
            this.stockPrice = stockPrice;
        }
    }
}
