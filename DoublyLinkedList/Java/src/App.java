import DoublyLinkedList.*;

public class App {
    public static void main(String[] args) {
      FavouriteFood<String> myFavorites=new FavouriteFood<String>();
      myFavorites.add_at(0,"Water Melon");
      myFavorites.add_at(1,"Bread");
      myFavorites.add_at(2,"Apple");
      myFavorites.add_at(3,"Banana");
      myFavorites.add_at(4,"Orange");
      myFavorites.display();
    }
}
