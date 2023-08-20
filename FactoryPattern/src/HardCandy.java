public class HardCandy implements Candy {

  @Override
  public String getCandyName() {
    return "Hard candy";
  }

  private HardCandy() {}

  public static Candy getInstance() {
    return new HardCandy();
  }
}
