from Node import Node
from Data import Data

class Link:
    def __init__(self):
        self.top=None
        self.bottom=None
        self.size=0

    def insertTop(self,data):
        newNode=Node(Data(data));
        if self.isEmpty():
            self.top=newNode
            self.bottom=newNode
        else:
            newNode.next=self.top
            self.top=newNode
        self.size+=1

    def insertBottom(self,data):
        newNode=Node(Data(data));
        if self.isEmpty():
            self.top=newNode
            self.bottom=newNode
        else:
            self.bottom.next=newNode
            self.bottom=newNode
        self.size+=1

    def insertAt(self,index,data):
        if index==0:
            self.insertTop(data)
            return
        elif index==self.size:
            self.insertBottom(data)
            return

        current=self.top
        newNode=Node(Data(data));
        count=0
        while count<index-1:
            current=current.next
            count+=1

        temp=current.next
        current.next=newNode
        newNode.next=current
        self.size+=1

    def deleteTop(self):
        if self.isEmpty():
            return

        self.top=top.next
        if top is None:
            self.bottom=None
        self.size-=1

    def deleteBottom(self):
        if self.isEmpty():
            return

        if  self.top==self.bottom:
            self.bottom=None
            self.top=None
            self.size-=1
            return

        count=0
        current=self.top
        while current!=self.bottom:
            current=current.next
            count+=1
        current.next=None
        self.bottom=current

    def deleteAt(self,index):
        if index<0 or index>self.size:
            return

        if index-1==0:
            self.deleteTop()
            return
        elif index-1==self.size:
            self.deleteBottom()
            return

        count=0
        current=self.top
        while count<index-1:
            current=current.next
            count+=1

        current.next=current.next.next
        self.size-=1

    def view(self):
        if self.isEmpty():
            return

        current=self.top
        while current!=None:
            print(current.data.word)
            current=current.next

    def isEmpty(self):
        return self.top is None
