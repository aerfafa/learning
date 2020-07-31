package designmodel.watcher;

/**
 * @Todo 观察者
 * @Author mina
 * @Date 2020-07-31  17:27
 */
public interface Watcher {



    //添加被观察者对象
     void add(Observer observer);
     //移除被观察者对象
    void delete(Observer observer);
    //监听后的动作
    void notifySth();

}
