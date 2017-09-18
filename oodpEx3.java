import java.util.*;
import java.util.function.*;
import java.awt.*;
import java.util.stream.*;
//Example for decorator pattern
class Camera{
  private Function<Color,Color> filter;
  public Color snap(Color input){return filter.apply(input);}
  public void setFilters(Function<Color, Color>...filters){

    filter = Stream.of(filters)
                    .reduce(Function.identity() // the same as color -> color in this specific case
                    ,Function::andThen);// the same as (theFilters, afilter) -> theFilters.andThen(afilter)); //

  }
  public Camera(Function<Color, Color>...filters){
    setFilters(filters);
  }


}


public class oodpEx3 {
  public static void printSnap(Camera camera){
    System.out.println(camera.snap(new Color(125,123,124)));
  }

  public static void main(String[] args){
    printSnap(new Camera());
  // with decorated color options.
        printSnap(new Camera(Color::darker, Color::darker));
  }
}
