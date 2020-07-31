package designmodel.watcher;

import java.util.ArrayList;

/**
 * @Todo
 * @Author mina
 * @Date 2020-07-31  17:35
 */
public class WatcherA implements  Watcher {

    private ArrayList<Observer> arrayList = new ArrayList<>();





    @Override
    public void add(Observer observer) {

        this.arrayList.add(observer);

    }

    @Override
    public void delete(Observer observer) {

        this.arrayList.remove(observer);

    }

    @Override
    public void notifySth() {

        for (Observer observer:
             arrayList) {
            observer.afterNotified();
        }

    }
}


class Test{

    public static void main(String args[]){

        WatcherA watcherA = new WatcherA();


        watcherA.add(new ObserverA());
        watcherA.add(new ObserverB());
        watcherA.notifySth();

    }


}
