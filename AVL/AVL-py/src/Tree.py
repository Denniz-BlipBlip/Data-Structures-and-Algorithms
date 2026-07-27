from Node import Node
from Data import Data

class Tree:
    def __init__(self):
        self.root=None

    def insert(self,data:str,id:int)->None:
        self.root=self.insert(self.root,data,id)

    def delete(self,id:int):
        self.root=self.delete(self.root,id)

    def view(self):
        self.traversal(self.root)

    def __insert(self,root:Node,data:str,id:int)->Node:
        if root is None:
            return Node(Data(data,id))
        if id>root.data.id:
            root.right=self.__insert(root.right,data,id)
        elif id<root.data.id:
            root.left=self.__insert(root.left,data,id)
        else:
            root
        self.__rebase(root)

    def __delete(self,root:Node,id:int)->Node:
        if root is None:
            return None
        if id>root.data.id:
            root.right=self.__delete(root.right,id)
        elif id<root.data.id:
            root.left=self.__delete(root.left,id)
        else:
            if root.right is None and root.left is None:
                return None
            elif root.right is None:
                root.left
            elif root.left is None:
                root.right
            else:
                temp:Node=self.find_min(root.right)
                root.data=temp.data
                root.right=self.__delete(root.right,temp.data.id)
        self.__rebase(root)

    def __find_min(self,node:Node)->Node:
        if node is None:
            return
        while node is not None and node.left is not None:
            node=node.left
        return node

    def __traversal(self,node:Node)->None:
        if node is None:
            return

        self.__traversal(node.left)
        print(node.data.data,end="")
        self.__traversal(node.right)

    def __height(self,node:Node)->int:
        return (node is not None) if node.height else 0

    def __balance_factor(self,node:Node)->int:
        return (node is not None) if (self.__height(node.left)-self.__height(node.right)) else 0

    def __update_height(self,node:Node)->None:
        node.height=1+max(self.__height(node.left),self.__height(node.right))

    def __rotate_right(self,y:Node)->Node:
        x:Node=y.left
        t2:Node=x.right
        x.right=y
        y.left=t2
        self.__update_height(y)
        self.__update_height(x)
        return x

    def __rotate_left(self,x:Node)->Node:
        y:Node=x.right
        t2:Node=y.left
        y.left=x
        x.right=t2
        self.__update_height(x)
        self.__update_height(y)
        return y

    def __rebase(self,node:Node)->Node:
        self.__update_height(node)
        balance:int=self.__balance_factor(node)

        if balance>1:
            if self.__balance_factor(node.left)<0:
                node.left=self.__rotate_left(node.left)
            return self.__rotate_right(node)

        if balance<-1:
            if(self.__balance_factor(node.right)<0):
                node.right=self.__rotate_right(node.right)
            return self.__rotate_left(node)
        return node
