#pragma once
#include <iostream>

class Data 
{
  public:
    Data(std::string word):word(word){}

    std::string getWord(){return this->word;}

  private:
    std::string word;
};
