import static java.lang.Thread.sleep;

public class Main {

  public static void main(String[] args) {
    Thread t1 = new Thread() {
      @Override
      public void run() {

        ThreadSafe threadSafe = ThreadSafe.getInstance();
        for (int i = 0; i < 5; i++) {
          threadSafe.count ++;
        }
        System.out.println(threadSafe.count);
        try {
          sleep(500);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }
    };
    t1.start();
    Thread t2 = new Thread() {
      @Override
      public void run() {
        ThreadSafe threadSafe = ThreadSafe.getInstance();
        System.out.println(threadSafe.count);
      }
    };
    t2.start();
  }
}