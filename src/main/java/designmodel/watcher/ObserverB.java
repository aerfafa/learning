package designmodel.watcher;

/**
 * @Todo
 * @Author mina
 * @Date 2020-07-31  17:37
 */
public class ObserverB extends Observer {
    @Override
    public void afterNotified() {
        System.out.println("ObserverB 收到通知");
    }
}
