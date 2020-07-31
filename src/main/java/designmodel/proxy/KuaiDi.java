package designmodel.proxy;

/**
 * @Todo  渗入需要被对象，从本代理对象调用 对象方法。
 * @Author mina
 * @Date 2020-07-31  9:57
 */
public class KuaiDi implements  Portal{

    ShangJia shangJia;

    public KuaiDi(){

        shangJia = new ShangJia();

    }
    //代理，-- 控制被代理者
    @Override
    public void sendGoods() {
        this.shangJia.sendGoods();
    }
}

class Test{

    public static void main(String args[]){

        Portal portal = new KuaiDi();
        portal.sendGoods();

    }


}