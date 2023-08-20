public class CandyFactory {

  public static Candy getCandy(CandyType candyType) {
    if (candyType.equals(CandyType.HARD)) {
      return HardCandy.getInstance();
    } else {
      return MintyCandy.getInstance();
    }
  }
}
