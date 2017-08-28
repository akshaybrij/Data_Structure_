import os
class Node:
    def __init__(self,item):
        self.left=None
        self.right=None
        self.item=item
def levelorder(root):
    q=[]
    q.append(root)
    while(len(q)>0):
        node=q.pop(0)
        print node.item
        if node.left is not None:
            q.append(node.left)
        if node.right is not None:
            q.append(node.right)
root=Node(1);
root.left=Node(2);
root.right=Node(3);
root.left.left=Node(4)
root.left.right=Node(5)
levelorder(root)
