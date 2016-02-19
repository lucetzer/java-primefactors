import java.util.*;

/**
 * Created by lucetzer on 19/02/2016.
 */
public class PrimeFactor {
  int number;
  ArrayList<Integer> factors = new ArrayList<>();
  ArrayList<Integer> primes = new ArrayList<>();


  PrimeFactor(int n) {
    number = n;
  }

  boolean isPrime(int n) {
    if (n == 2) primes.add(n);
    if (n % 2 == 0) return false;
    for (int i = 3; i * i <= n; i += 2) {
      if (n % i == 0) return false;
    }
    primes.add(n);
    return true;
  }

  public ArrayList<Integer> findFactors() {
    if (number == 1) return primes;
    for(int i = 2; i <= number; i++) {
      if (number % i == 0) factors.add(i);
    }
    for (int e : factors) {
      isPrime(e);
    }
    for (int e : primes) {
      System.out.println(e);
    }
    return primes;
  }

  public static void main(String[] args) {
    PrimeFactor primeTest = new PrimeFactor(30);
    primeTest.findFactors();
    new PrimeFactor(1);
  }
}
