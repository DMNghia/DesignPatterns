public class MintyCandy implements Candy {

  @Override
  public String getCandyName() {
    return "Minty candy";
  }

  private MintyCandy() {}

  public static Candy getInstance() {
    return new MintyCandy();
  }
}
