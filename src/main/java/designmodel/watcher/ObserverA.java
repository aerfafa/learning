package designmodel.watcher;

/**
 * @Todo
 * @Author mina
 * @Date 2020-07-31  17:37
 */
public class ObserverA extends Observer {
    @Override
    public void afterNotified( ) {
        System.out.println("ObserverA 收到通知");
    }
}
