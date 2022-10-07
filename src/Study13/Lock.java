package Study13;

public class Lock {
    public static void main(String[] args) {
        T01 t01 = new T01();
        t01.setDaemon(true);
        t01.start();
        t01.setName("t01线程");
        System.out.println(t01.getName());
//        try {
//            t01.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        T02 t02 = new T02();
        new Thread(t02).start();

    }
}

class T01 extends Thread {
    public int i = 0;
    @Override
    public void run() {
        synchronized (this) {
            while (true) {
                System.out.println("你好！01===" + (++i));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (i == 10) {
                    break;
                }
            }
        }

    }
}

class T02 implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("你好！02");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}