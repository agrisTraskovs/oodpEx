import java.util.*;
import java.util.function.*;

public class oodpEx2 {
  public static void main(String[] args){
    Function<Integer, Integer> inc = e -> e+1;
    Function<Integer,Integer> doubleIt = i -> i*2;

    doWork(5,inc);
    doWork(13, doubleIt);
    doWork(2, inc.andThen(doubleIt).andThen(inc));
  }

  public static void doWork (int value, Function<Integer,Integer> func){
    System.out.println(func.apply(value));
  }



}
