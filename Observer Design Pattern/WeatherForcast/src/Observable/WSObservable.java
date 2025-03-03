package Observable;

import Observer.DisplayObserver;

public interface WSObservable {
    void add(DisplayObserver ds);
    void remove(DisplayObserver ds);
    void broadCast();
    void setData(int t);
    int getData();

}
