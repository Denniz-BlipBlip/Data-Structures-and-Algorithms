from Data import Data

class Node:
    def  __init__(self,data:Data):
        self.data:Data=data
        self.right:Node=None
        self.left:Node=None
        self.height:int=1
