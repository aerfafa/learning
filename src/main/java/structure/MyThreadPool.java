package structure;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyThreadPool {

    public static void main(String[] args) {
        //线程池参数设置技巧 http://www.imooc.com/article/5887
        ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(5);
        ThreadPoolExecutor pool = new ThreadPoolExecutor(5, 10, 200, TimeUnit.MILLISECONDS, queue);
        for(int i=0; i<15; i++){
            MyTask myTask = new MyTask(i);
            pool.execute(myTask);
            System.out.println("线程池中的线程数目："+pool.getPoolSize()+",队列中等待执行的任务数量："+pool.getQueue().size()+",已执行完的任务数目："+pool.getCompletedTaskCount());

        }
        pool.shutdown();
    }

}
class MyTask implements Runnable{

    private int taskNum;

    public MyTask(int num){
        this.taskNum = num;
    }

    public void run(){
        System.out.println("正在执行task " + taskNum);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("task "+taskNum+"执行完毕");
    }

}
