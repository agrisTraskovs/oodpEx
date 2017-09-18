import java.util.*;
import java.util.function.*;
//loan pattern , pre and post processing
public class oodpEx5 {
public static void main(String[] args){

  //try(Resource resource = new Resource()){
//    resource.op1();
//    resource.op2();
//  }
//instead of writing this ^
//we should do this :
Resource.use(resource ->
  resource.op1()
          .op2());

}
}


class Resource {
  private Resource() {System.out.println("start");}
  public Resource op1() {System.out.println("op1"); return this;}
  public Resource op2() {System.out.println("op2"); return this;}
  private void close(){System.out.println("end");}

public static void use (Consumer<Resource> block){
  Resource resource = new Resource();
  try{
    block.accept(resource);
  }finally{resource.close();}
}

  //eternal sin in Java because it will prevent a normal garbage collection!
//  public void finalize() {System.out.println("cleanup..");}
}
