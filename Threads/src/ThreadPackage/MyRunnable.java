package ThreadPackage;

import static ThreadPackage.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from myRunnables implementation of run()");
    }
}
