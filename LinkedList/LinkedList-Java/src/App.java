import LinkedList.LinkedList;

public class App
{
  public static void main(String[] args) {
    LinkedList list=new LinkedList();

    list.insertFront("Denniz");
    list.view();
    list.deleteAt(0);
    list.view();
  }
}
