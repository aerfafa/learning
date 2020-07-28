package structure;

import java.util.concurrent.*;

/**
 * @Todo
 * @Author mina
 * @Date 2020-07-28  16:47
 */
public class MyThreadPool {


    public static  void  main(String args[]){

//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor();

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        CountDownLatch countDownLatch = new CountDownLatch(10);

        for (int i = 0; i < 10; i++) {

            executorService.submit(new Job());

        }
        executorService.shutdown();;

    }

    static class  Job implements  Runnable{




        @Override
        public void run() {

            System.out.println("ss");


        }
    }

}
