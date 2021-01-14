package edu.cnm.deepdive;

public class TernaryOperator {

  public static void main(String[] args) {
    int x = 10;
    int y;

    if(x > 5) {
      y = 2 * x;
    } else {
      y = 4 * x;
    }
    System.out.println("y = " + y);

    //ternary operator
    //y = x > 5 ? 2 * x : 4 * x; easier to read with brackets as on line 18.
    y = (x > 5) ? (2 * x) : (4 * x);
    System.out.println("y = " + y);

    // since Java 7 ternary operators works similar as short circuit operators (&&, ||, ^), meaning
    // that the second operator will only be evaluated if needed.

    int a = 1;
    int b = 1;
    int c = a < 10 ? a++ : b++;// c = 1, a = 2 and b stays 1 because it is short circuited.


    int d = 1;
    int e = 2;
    int f = 3;

    if (d < 10) {
      f = d++ < 1 ? e++ : f++;
    } else {
      f = (d + e) < 2 ? d++ : e++;
    }
  }
}
