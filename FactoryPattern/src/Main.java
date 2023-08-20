// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

  public static void main(String[] args) {
    Candy hardCandy = CandyFactory.getCandy(CandyType.HARD);
    System.out.println(hardCandy.getCandyName());

    System.out.println("====================");

    Candy mintyCandy = CandyFactory.getCandy(CandyType.MINTY);
    System.out.println(mintyCandy.getCandyName());
  }
}