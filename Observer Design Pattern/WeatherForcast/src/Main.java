import Observable.WSObservable;
import Observable.WsObservableImple;
import Observer.DisplayObserver;
import Observer.MobileDisplayObserver;
import Observer.NewsChannelObserver;

public class Main {
    public static void main(String[] args) {
        WSObservable Wso = new WsObservableImple();

        DisplayObserver aajTak = new NewsChannelObserver(Wso);
        DisplayObserver news24 = new NewsChannelObserver(Wso);

        DisplayObserver iPhone = new MobileDisplayObserver(Wso);

        Wso.add(aajTak);
        Wso.add(news24);
        Wso.add(iPhone);

        Wso.setData(35);
    }
}