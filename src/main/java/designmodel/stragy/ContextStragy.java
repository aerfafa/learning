package designmodel.stragy;

/**
 * @Todo
 * @Author mina
 * @Date 2020-07-31  17:04
 */
public class ContextStragy {

    private Stragy stragy;

    public ContextStragy(Stragy stragy){
        this.stragy = stragy;
    }

    //根据需求任意抽取Stragy 中的某个行为
    public void val(){
        stragy.valWays();
    }



}

class Test{

    public static void main(String args[]){

        ContextStragy contextStragy = new ContextStragy(new ValA());
        contextStragy.val();

    }


}
