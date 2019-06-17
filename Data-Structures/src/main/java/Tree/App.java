package Tree;

import java.util.ArrayList;
import java.util.List;

public class App {
    public  static void main(String[] args){
        Tree tr = new BinaryTree();
        ((BinaryTree) tr).createTree();

        List<Integer> list1 = tr.preOrder(tr.getRoot(),new ArrayList<>());
        for (Integer a:
                list1 ) {
            System.out.println(a);
        }

        System.out.println("++++++++++++++++");

      List<Integer> list2 = tr.inOrder(tr.getRoot(),new ArrayList<>());
        for (Integer a:
            list2 ) {
            System.out.println(a);
        }
        System.out.println("++++++++++++++++");

        List<Integer> list3 = tr.postOrder(tr.getRoot(),new ArrayList<>());
        for (Integer a:
                list3 ) {
            System.out.println(a);
        }


    }
}
