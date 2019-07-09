package Hashtable;

public class Llist {
   public Node root;
    public Llist(){
        root=new Node();
    }

    public void setRoot(Node root){
        this.root=root;
    }

    //insert an item to link-list
    public void add(String key,String val){

        Node n = new Node(key,val);
        Node cur=root;
        while(cur.next!=null){
            if(cur.next.key==key){
                cur.next.next=n;
                return;
            }
            cur=cur.next;
        }
      cur.next=n;
    }



    //delete an item from llst
    public boolean delete(String key){
        Node cur=root;
        while(cur.next!=null){
            if(cur.next.key==key){
               cur.next=cur.next.next;
                return true;
            }
            cur=cur.next;
        }
        return  false;
    }



    //get value by key
    public String get(String key)
    {
        Node cur = root;
        while (cur.next != null)
        {
            if (cur.next.key == key)
            {
                return cur.next.value;
            }
            cur = cur.next;
        }
        return "Not Exsits";
    }


    //traversal llist output all values
    public String getlist(){

        {
            String str = "";
            Node cur = root.next;
            while (cur != null)
            {
                str += "(" + cur.key + "," + cur.value + "),";
                cur = cur.next;
            }
            return str;
        }
    }


}
