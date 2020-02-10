package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class News {
    private List<Observer> observers = new ArrayList<>();
    public void subscribe(Observer observer){
        observers.add(observer);
    }
    public void unsubscribe(Observer observer){
        observers.remove(observer);
    }

    public void notifyA() {
        for(Observer observer:observers){
            observer.update("更新了");
        }
    }
}
