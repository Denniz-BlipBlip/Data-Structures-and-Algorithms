import LinkedList.LinkedList; 

public class App {
    public static void main(String[] args) {
      LinkedList<String>list=new LinkedList<>();

      list.push_front("Denniz");
      list.push_rear("gabriel");
      list.push_at("Cruz", 5);
      list.view();
    }
}
