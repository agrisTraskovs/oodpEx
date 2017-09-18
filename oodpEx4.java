import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class oodpEx4 {
public static void main(String[] args){
  //not optimal code
  //Mailer mailer =  new Mailer();
  //mailer.from("builder@something.com");
  //mailer.to("myemail@address.com");
  //mailer.subject("code is bad");
  //mailer.body("Because of not using good pattersn");
  //mailer.send();


//cascade patter / builder pattern
new Mailer()
  .from("builder@something.com")
  .to("myemail@address.com")
  .subject("code is somewhat ok")
  .body("Because of using some patterns")
  .send();

}

}

class Mailer{

  public static void print(String inc){System.out.println(inc);}

  public Mailer from(String inc){print(inc);return this;}
  public Mailer to(String inc){print(inc);return this;}
  public Mailer subject(String inc){print(inc);return this;}
  public Mailer body(String inc){print(inc);return this;}
  public void send(){print("sending");}
  }
