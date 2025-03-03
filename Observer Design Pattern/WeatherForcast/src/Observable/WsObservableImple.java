package Observable;

import Observer.DisplayObserver;

import java.security.DigestException;
import java.util.ArrayList;
import java.util.List;

public class WsObservableImple implements WSObservable {
    List<DisplayObserver> ls;
    int temperature;

    public WsObservableImple()
    {
        ls = new ArrayList<DisplayObserver>();
        temperature = 32;
    }

    public void add(DisplayObserver ds)
    {
        ls.add(ds);
    }

    public void remove(DisplayObserver ds)
    {
        ls.remove(ds);
    }

    public void broadCast()
    {
        for(DisplayObserver obj : ls)
        {
            obj.update();
        }
    }

    public void setData(int temperature)
    {
        this.temperature = temperature;
        broadCast();
    }

    public int getData()
    {
        return temperature;
    }

}
