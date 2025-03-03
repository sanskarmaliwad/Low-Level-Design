package Observer;

import Observable.WSObservable;
import Observable.WsObservableImple;

public class NewsChannelObserver implements DisplayObserver{
    WSObservable wso;

    public NewsChannelObserver(WSObservable wso)
    {
        this.wso = wso;
    }

    public void update()
    {
        System.out.println("Temperature in News: " +  wso.getData());
    }
}
