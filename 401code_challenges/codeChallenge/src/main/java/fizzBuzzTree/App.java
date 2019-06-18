package fizzBuzzTree;

public class App {


    public static void main(String[] args){
        Tree tr = new Tree();
        tr.root=new Node(5);
        tr.root.leftChild=new Node(15);
        tr.root.rightChild=new Node(4);
        tr.root.leftChild.leftChild=new Node(9);
        Object[] r = tr.preOrder();
        for(Object o:r){
            System.out.println(o);
        }
          Tree res = fizzBuzzTree(tr.root,tr);

System.out.println("++++++++++++++++++++++++++");
        Object[] rr = res.preOrder();
        for(Object o:rr){
            System.out.println(o);
        }
    }


    public static Tree fizzBuzzTree(Node node,Tree tr) {

        if (node != null) {
               if((int)node.value%15==0){
                   node.value="FizzBuzz";
               }
               else if((int)node.value%5==0){
                   node.value="Buzz";
               }
               else if((int)node.value%3==0){
                   node.value="Fizz";
               }

               if(node.leftChild!=null){
                   fizzBuzzTree(node.leftChild,tr);
               }
            if(node.rightChild!=null){
                fizzBuzzTree(node.rightChild,tr);
            }
        }
      return tr;
    }
}
