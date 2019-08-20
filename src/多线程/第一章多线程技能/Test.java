package 多线程.第一章多线程技能;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) {

        /**
         * 一个进程运行至少会有一个线程执行
         * */
        System.out.println(Thread.currentThread().getName());

        Thread1 thread1 = new Thread1();
        thread1.start();

        /**
         * start()与run()的区别
         * */
        Thread2 thread2 = new Thread2();
        thread2.run();
        Thread thread3 = new Thread(Thread3.task);
        thread3.start();

    }

    /**
     * 实现多线程的方式：
     * 1.继承Thread类
     * 2.实现Runnable接口
     * 3.使用Callable和Future创建线程
     * */
    public static class Thread1 extends Thread{
        @Override
        public void run() {
            super.run();
            System.out.println("Thread1");
        }
    }

    public static class Thread2 implements Runnable{
        @Override
        public void run() {
            System.out.println("Thread2");
        }
    }

    public static class Thread3 {
        static FutureTask<Integer> task = new FutureTask<>((Callable<Integer>)()->{
            int i = 0;
            for (; i <= 10; i++) {
                System.out.println("CurrentNumber is " + i);
            }
            return i;    //有返回值
        } );
    }

}
