package org.example.recursion;

import java.util.ArrayList;
import java.util.List;

public class Recursion {

  public int fact(int n) {
    if (n >= 1) {
      return n * fact(n - 1);
    }
    return 1;
  }

  public List<Integer> fibonacci(int n) {
    List<Integer> fibonacci = new ArrayList<Integer>();
    int before = 1;
    int next = 1;
    fibonacci.add(before);
    fibonacci.add(next);
    for(int i = 2; i < n; i++) {
      int soma = before + next;
      fibonacci.add(soma);
      before = next;
      next = soma;
    }
    return fibonacci;
  }

  public int fibonacciRecursion(int n) {
    if(n >= 3) {
      return fibonacciRecursion(n -1) + fibonacciRecursion(n -2);
    }
    return 1;
  }
}
