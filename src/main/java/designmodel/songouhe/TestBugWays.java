package designmodel.songouhe;

/**
 * @Todo
 * @Author mina
 * @Date 2020-07-30  10:52
 */
public class TestBugWays {


    public static void main(String args[]){

        Animal animal = new Dog();
        animal.doSth();  //调的是子类重写方法，这就是动态绑定，提高了可扩展性。
        System.out.println();

    }




}
