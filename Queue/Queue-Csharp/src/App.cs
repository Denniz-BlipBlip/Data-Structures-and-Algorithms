
namespace Queue
{
  class App
  {
    static void Main()
    {
      Queue qu=new Queue();

      qu.enqueue("Denniz");
      qu.view();
      qu.dequeue();
      qu.view();
    }
  }
}
