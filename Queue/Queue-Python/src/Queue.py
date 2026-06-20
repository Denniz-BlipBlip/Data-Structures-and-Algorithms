from Node import Node
from Data import Data

class Queue:
    def __init__(self):
        self.rear=None
        self.front=None
        self.size=0

    def enqueue(self,word):
        newNode=Node(Data(word))
        if self.__isEmpty():
            self.rear=newNode
            self.front=newNode
        else:
            self.rear.next=newNode
            self.rear=newNode
        self.size+=1

    def dequeue(self):
        if self.__isEmpty():
            return
        self.front=self.front.next
        if self.front is None:
            self.rear=None
        self.size-=1

    def size(self):
        return self.size

    def view(self):
        if self.__isEmpty():
            return

        current=self.front
        while current is not None:
            print(current.data.word)
            current=current.next

    def __isEmpty(self):
        return self.front is None
