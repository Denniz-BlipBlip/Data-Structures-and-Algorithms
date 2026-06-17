#pragma once
#include<iostream>

class Data 
{
  public:
    Data(std::string word,int id):word(word),id(id){}

    void setId(int id){this->id=id;}
    void setWord(std::string word){this->word=word;}
    std::string getWord(){return this->word;}
    int getId(){return this->id;}

  private:
    int id;
    std::string word;
};
