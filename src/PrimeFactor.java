import java.util.ArrayList;

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
    printPrimes();
    return primes;
  }

  void printPrimes() {
    if (primes.size() >= 1) {
      System.out.print(primes.get(0));
    }

    for(int i = 1; i < primes.size(); i++) {
      System.out.print(", " + primes.get(i));
    }
  }

  public static void main(String[] args) {
    new PrimeFactor(30).findFactors();
    new PrimeFactor(1).findFactors();
  }
}
