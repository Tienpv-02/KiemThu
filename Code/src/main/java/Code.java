public class Code {
  public static long fibonacci(long n) {
    long f0 = 0;
    long f1 = 1;
    long fn = 1;
    if (n < 0) {
      return -1;
    } else if (n == 0 || n == 1) {
      return n;
    } else {
      for (int i = 2; i < n; i++) {
        f0 = f1;
        f1 = fn;
        if (f1 > Long.MAX_VALUE - f0) {
          return Long.MAX_VALUE;
        }
        fn = f0 + f1;
      }
    }
    return fn;
  }

//  Fib[92]=7540113804746346429
//  Fib[91]=4660046610375530309
public static void main(String[] args) {
  System.out.println(fibonacci(3));
}
}
