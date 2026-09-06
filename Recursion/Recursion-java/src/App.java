import Linear.Linear;
import Mutual.Mutual;
import Nested.Nested;
import Binary.Binary;
import Multiple.Multiple;
import Tail.Tail;

public class App  
{
  public static void main(String[] args) 
  {
    Nested nest=new Nested();
    Multiple multi=new Multiple();
    Mutual  mutual=new Mutual();
    Tail tail=new Tail();
    Binary binary=new Binary();
    Linear linear=new Linear();

    System.out.println("Linear");
    System.out.println(linear.addUpTo(10));
    System.out.println();
    System.out.println("Mutual");
    mutual.even(10);
    System.out.println();
    System.out.println("Tail");
    tail.count(10);
    System.out.println();
    System.out.println("Binary");
    System.out.println(binary.fibonacci(5));
    System.out.println();
    System.out.println("Nested");
    System.out.println(nest.ackerman(2, 2));
    System.out.println();
    System.out.println("Multiple");
    System.out.println(multi.stairs(2));
  }
}
