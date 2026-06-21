from Node import Node
from Data import Data

class LinkedList:
    def __init__(self):
        self.rear=None
        self.front=None
        self.size=0

    def insertFront(self,word):
        newNode=new Node(new Data(word));

        if self.__isEmpty():
            self.rear=newNode
            self.front=newNode
        else:
            newNode.next=self.front
            self.front=newNode
        self.size+=1



    def __isEmpty(self):
        return self.front is None
