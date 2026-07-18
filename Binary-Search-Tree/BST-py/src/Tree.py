from Data.Node import Node
from Data.Data import Data

class Tree:
    def __init__(self):
        self.root:Node=None

    def insert(self,data:str,id:int)->None:
        self.root=self.__insert(self.root,data,id)

    def delete(self,id:int)->None:
        self.root=self.__delete(self.root,id)

    def view(self)->None:
        self.__view(self.root)

    def __insert(self,root:Node,data:str,id:int)->Node:
        if root is None:
            return Node(Data(data,id))

        if id>root.data.id:
            root.right=self.__insert(root.right,data,id)

        elif id<root.data.id:
            root.left=self.__insert(root.left,data,id)

        else:
            return None

    def __delete(self,root:Node,id:int)->Node:
        if root is None:
            return  None

        if id>root.data.id:
            root.right=self.__delete(root.right,id)
        elif id<root.data.id:
            root.left=self.__delete(root.left,id)
        else:
            if root.right is None:
                root.left
            elif root.left is None:
                root.right
            else:
                temp:Node=self.__findMin(root.right)
                root.data=temp.data
                root.right=self.__delete(root.right,temp.data.id)

    def __view(self,root:Node)->None:
        if root is None:
            return

        self.__view(root.left)
        print(root.data.data, end="")
        self.__view(root.right)


    def __findMin(self,root:Node)->Node:
        if root is None:
            return None

        while root is not None and root.left is not None:
            root=root.left
        return root
