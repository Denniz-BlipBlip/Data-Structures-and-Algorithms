from Node import Node
from Data import Data

class Stack:
    def __init__(self):
        self.top=None
        self.size=0

    def push(self,word):
        newNode=Node(Data(word))
        newNode.next=self.top
        self.top=newNode
        self.size+=1

    def peek(self):
        if self.isEmpty():
            return
        print(self.top.data.word)

    def pop(self):
        if self.isEmpty():
            return
        self.top=self.top.next
        self.size-=1

    def isEmpty(self):
        return self.top is None
