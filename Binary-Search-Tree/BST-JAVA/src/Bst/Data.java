package Bst;

public class Data 
{
  public Data(String word,int id)
  {
    this.word=word;
    this.id=id;
  }

  public String getWord(){return this.word;}
  public void setWord(String word){this.word=word;}
  public int getId(){return this.id;}
  public void setId(int id){this.id=id;}
  private String word;
  private int id;
}
