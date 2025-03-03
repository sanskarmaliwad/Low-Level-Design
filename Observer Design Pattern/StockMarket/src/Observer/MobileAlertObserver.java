package Observer;

import Observable.StockObservable;

public class MobileAlertObserver implements NotificationAlertObserver {
    String userName;

    public MobileAlertObserver(String userName)
    {
        this.userName = userName;
    }

    public void update(double stockPrice)
    {
        System.out.println("Listed at " + stockPrice);
        sendMsgOnMobile("Hurry up!");
    }

    private void sendMsgOnMobile(String message)
    {
        System.out.println("Message is sent to " + userName + " " + message);
    }
}
