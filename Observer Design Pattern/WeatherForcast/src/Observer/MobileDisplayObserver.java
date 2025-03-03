package Observer;

import Observable.WSObservable;
import Observable.WsObservableImple;

public class MobileDisplayObserver implements DisplayObserver {
    WSObservable wso;

    public MobileDisplayObserver(WSObservable wso)
    {
        this.wso = wso;
    }
    public void update()
    {
        System.out.println("Temperature in Mobile: " +  wso.getData());
    }

}
