package treeIntersection;

public class Tree {

    public TreeNode root;
    public TreeNode getRoot(){return root;}
    public  void setRoot(TreeNode root){this.root=root;}
    public Tree()
    {
        root = null;
    }

    public TreeNode addrecursive(TreeNode node,int val)
    {
        if (node == null)
        {
            return new TreeNode(val);
        }

        if (val < node.value)
        {
            node.leftChild = addrecursive(node.leftChild, val);
        }
        else if (val > node.value)
        {
            node.rightChild = addrecursive(node.rightChild, val);
        }
        else
        {
            return node;
        }
        return node;
    }


    public void add(int val)
    {
        root = addrecursive(root, val);
    }
    /// <summary>
    /// output the tree
    /// </summary>
    /// <param name="node"></param>
    public void preOrder(TreeNode node)
    {
        if (node != null)
        {
           System.out.println(node.value);
            preOrder(node.leftChild);
            preOrder(node.rightChild);
        }

    }

}
