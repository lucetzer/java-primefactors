import java.util.*;

/**
 * Created by lucetzer on 19/02/2016.
 */
public class PrimeFactor {
  int number;
  ArrayList<Integer> factors = new ArrayList<>();


  PrimeFactor(int n) {
    number = n;
  }

  public ArrayList<Integer> findFactors() {
    if (number == 1) {
      factors.add(0);
    }
    for(int i = 2; i <= number; i++) {
      if (number % i == 0) {
        factors.add(i);
      }
    }
    for (int e: factors) {
      System.out.println(e);
    }
    return factors;
  }

  public static void main(String[] args) {
    new PrimeFactor(30).findFactors();
  }
}
