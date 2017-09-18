import java.util.* ;
import java.util.function.Predicate;
public class oodpEx {
//strategy pattern with simple lambda
  public static void main(String[] args){
    List<Integer> numbers = Arrays.asList(1,2,3,4,5,7,8,9,10,11,13,16,18,20);
//higher function calls
    System.out.println("Total:  " +  totalValues(numbers, e -> true));
    System.out.println("Even sum:  " +  totalValues(numbers, Util::isEven));
    System.out.println("Odd sum:  " +  totalValues(numbers,  Util::isOdd));

    numbers.forEach(e -> System.out.println(e));
  }
  public static int totalValues(List<Integer> values, Predicate<Integer> selector ){
    int result = 0;
      for(Integer i : values){
        if(selector.test(i))
        result += i;
      }
    return result;
  }

  //extreme use of streams and functionals

  public static int sumValues(List<Integer> values, Predicate<Integer> selector ){
    return values.stream() // converts to stream
            .filter(selector) // uses the selector Predicate function to only get the values that pass the selector
            .reduce(0, Integer::sum); // reduce - initial value, lambda function that combines the passed element the initial
            //the result is then returned
  }


}


class Util{
public static boolean isEven(int num){
  return num%2 == 0;
}
public static boolean isOdd(int num){
  return num%2 != 0;
}

}
