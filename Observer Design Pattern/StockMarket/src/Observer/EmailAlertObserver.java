package Observer;

import Observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver{
    String emailId;

    public EmailAlertObserver(String emailId)
    {
        this.emailId = emailId;
    }

    public void update(double stockPrice)
    {
        System.out.println("Listed at " + stockPrice);
        sendMail("Hurry up!");
    }

    private void sendMail(String message)
    {
        System.out.println("Email is sent to " + emailId + " " + message);
    }
}
