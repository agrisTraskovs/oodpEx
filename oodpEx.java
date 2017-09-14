import java.util.* ;
import java.util.function.Predicate;
public class oodpEx {

  public static void main(String[] args){
    List<Integer> numbers = Arrays.asList(1,2,3,4,5,7,8,9,10,11,13,16,18,20);

    System.out.println("Total:  " +  totalValues(numbers, e -> true));
    System.out.println("Even sum:  " +  totalValues(numbers, e -> e%2 == 0));
    System.out.println("Odd sum:  " +  totalValues(numbers, e -> e%2 != 0));

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


}
