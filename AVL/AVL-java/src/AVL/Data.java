package AVL;

public class Data 
{
  public Data(String data,int id)
  {
    this.data=data;
    this.id=id;
  }

  public String get_data(){return this.data;}
  public int get_id(){return this.id;}
  private String  data;
  private int id;
}
