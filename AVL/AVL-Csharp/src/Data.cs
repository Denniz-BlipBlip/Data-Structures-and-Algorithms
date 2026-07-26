using System

namespace src
{
  struct Data 
  {
    Data(string data,int id)
    {
      this.data=data;
      this.id=id;
    }

    public string data{set;get;}
    public int id{set;get;}
  }
}
