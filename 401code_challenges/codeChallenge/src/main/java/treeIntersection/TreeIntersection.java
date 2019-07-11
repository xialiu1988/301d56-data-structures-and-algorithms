package treeIntersection;

import java.util.ArrayList;
import java.util.List;

public class TreeIntersection {

    public static void main(String[] args)
    {
        Tree tr1 = new Tree();
        tr1.add(64);
        tr1.add(9);
        tr1.add(10);
        tr1.add(14);
        tr1.add(33);
        tr1.add(18);

        Tree tr2 = new Tree();
        tr2.add(64);
        tr2.add(10);
        tr2.add(74);
        tr2.add(23);
        tr2.add(18);
        tr1.preOrder(tr1.root);
       System.out.println("===================");
        tr2.preOrder(tr2.root);
        System.out.println("===================");
        System.out.println("===================");
        List<Integer> res=   treeIntersection(tr1.root, tr2.root);
        for(int i :res){
            System.out.println(i);
        }

    }




    public static List<Integer> treeIntersection(TreeNode root1, TreeNode root2)
    {
        List<Integer> res = new ArrayList<>();
        List<Integer> raw1 = new ArrayList<>();
        List<Integer> raw2 = new ArrayList<>();
        List<Integer> list = filloutlist(root1,raw1);

        List<Integer> list2 = filloutlist(root2,raw2);

        for(int i = 0; i < list.size(); i++)
        {
            for(int j = 0; j < list2.size(); j++)
            {
                if (list.get(i) == list2.get(j))
                {
                    res.add(list.get(i));
                }
            }
        }



        return res;
    }

    public static List<Integer> filloutlist(TreeNode node,List<Integer> list)
    {

        if (node != null)
        {
            list.add(node.value);
        }
        if (node.leftChild != null)
        {
            filloutlist(node.leftChild,list);
        }
        if (node.rightChild != null)
        {
            filloutlist(node.rightChild,list);
        }
        return list;

    }

}
