import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

  /*
   * Complete the 'findSmallestMissingPositive' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts INTEGER_ARRAY orderNumbers as parameter.
   */

  public static int findSmallestMissingPositive(List<Integer> orderNumbers) {
    // Write your code here
    int i = 0;
    while (i < orderNumbers.size()) {
      Integer current = orderNumbers.get(i);
      Integer correctPosition = orderNumbers.get(i) - 1;
      if (current > 0
          && current <= orderNumbers.size()
          && !current.equals(orderNumbers.get(correctPosition))) {
        Collections.swap(orderNumbers, i, correctPosition);
      } else {
        i++;
      }
    }
    for (i = 0; i < orderNumbers.size(); i++) {
      Integer atual = orderNumbers.get(i);
      int iMais1 = i + 1;
      if (atual != iMais1) {
        return i + 1;
      }
    }

    return orderNumbers.size() + 1;
  }
}

public class Solution {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int orderNumbersCount = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> orderNumbers = IntStream.range(0, orderNumbersCount).mapToObj(i -> {
          try {
            return bufferedReader.readLine().replaceAll("\\s+$", "");
          } catch (IOException ex) {
            throw new RuntimeException(ex);
          }
        })
        .map(String::trim)
        .map(Integer::parseInt)
        .collect(toList());

    int result = Result.findSmallestMissingPositive(orderNumbers);

    System.out.println(result);

    bufferedReader.close();
  }
}
