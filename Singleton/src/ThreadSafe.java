public class ThreadSafe {
  public static int count = 0;

  private ThreadSafe() {
  }

  public static synchronized ThreadSafe getInstance() {
    return new ThreadSafe();
  }
}
