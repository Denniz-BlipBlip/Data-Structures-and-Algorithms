#pragma once
#include <iostream>

class Data
{
  public:
    Data(std::string data,int id):
      data(data),id(id){}

    std::string get_data(){return this->data;}
    int get_id(){return this->id;}
    void set_data(std::string &data){this->data=data;}
    void set_id(int &id){this->id=id;}

  private:
    int id;
    std::string data;
};
