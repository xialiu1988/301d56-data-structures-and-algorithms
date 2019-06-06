import java.util.Arrays;

public class ArrayReverse { 
  public class Node {
    public int value;
    public Node next;

    //constructor
    public Node(int val){
        this.value=val;
    }
}
public class Llist {
  public Node head;

  public  Llist(){
      head = null;
  }


  //Insert a value as a node
  public void insert(int value) {
      Node insertNode = new Node(value);
      insertNode.next = head;
      head = insertNode;
  }

  //check if the value exists within the list
  public boolean includes(int value) {
      Node  current = head;
      while (current.next != null) {
          if (current.value == value) {
              return true;
          }
          current = current.next;
      }
      if (current.value == value) return true;
      else return false;
  }


  //return the current node
  public List<Node> print() {

      List<Node> list = new ArrayList<>();
      Node current = head;
      while (current != null) {
          list.add(current);
          current = current.next;
      }

      return list;
  }





  //.append(value) which adds a new node with the given value to the end of the list

  public void append(int val) {
      //if there is empty linked list
      if (head == null) {
          head = new Node(val);

      } else {
          Node  current = head;
          while (current.next != null) {
              current = current.next;
          }
          Node newNode = new Node(val);
          current.next = newNode;
      }
  }

  // .insertBefore(value, newVal) which add a new node with the given newValue immediately before the first value node

  public void insertBefore(int value, int newVal) {

      if(head!=null) {
          Node current = head;
          if (current.value == value) {
              insert(newVal);
              return;
          }
          while (current != null) {
              if (current.next.value == value) {
                  Node newNode = new Node(newVal);
                  newNode.next = current.next;
                  current.next = newNode;
                  return;
              }
              else {
                  if (current.next != null) {
                      current = current.next;
                  } else throw new IllegalArgumentException("Value not Exsits!");
              }
          }

      }
      else
      {
          throw new IllegalArgumentException("Value not Exsits!");
      }
  }


  //.insertAfter(value, newVal) which add a new node with the given newValue immediately after the first value nodepublic void insertAfter(int value, int newVal)


  public void insertAfter(int value, int newVal) {
      if(head!=null) {
          Node current = head;
          if (current.value == value) {
              Node nn = new Node(newVal);
              nn.next = current.next;
              current.next = nn;
              return;
          }
          while (current.next != null) {
              if (current.value == value) {
                  Node newNode = new Node(newVal);
                  newNode.next = current.next;
                  current.next = newNode;
                  return;
              }
              current = current.next;
          }

          if (current.value == value) {
              Node newNode = new Node(newVal);
              current.next = newNode;
              return;
          }
      }
      else{
          throw new IllegalArgumentException("Value not Exsits!");
      }

  }


  //find the kth node from the end of the linked list
  public int kthFromEnd(int k){

      if(k<0){
          throw new IllegalArgumentException("Not correct input number");
      }
      //create hashmap to hold <key,value> pair key is the index positon of the node while value is Node itself
      HashMap<Integer,Node> hp = new HashMap<>();
      Node current = head;
      int i =0;
      while(current.next!=null){
          hp.put(i,current);
          i++;
          current=current.next;
      }
      hp.put(i,current);
      int sizeOfHashmap=hp.size();
      if(k>=sizeOfHashmap){
          throw new IllegalArgumentException("Not correct input number");
      }
      Node res = hp.get(sizeOfHashmap-k-1);
      return res.value;

  }



}
  public static void main(String[] args){

    Llist list1= new Llist();
    list1.insert(5);
    list1.insert(8);
    list1.insert(1);

    Llist list2= new Llist();
    list2.insert(2);
    list2.insert(3);
//        list2.insert(18);
    Llist res = mergeLists(list1,list2);
    List<Node> print = res.print();
    for(Node n :print){
        System.out.println(n.value);
    }
}

public static Llist mergeLists(Llist one, Llist two){
  Llist newlist = new Llist();
  Node dummyHead = new Node(0);
  Node curNew = dummyHead;
  if((one.head == null)&&(two.head==null)) return newlist;

  if((one.head == null) &&(two.head!=null)) return  two;

  if((one.head != null) &&(two.head==null)) return  one;

  Node curOne = one.head;
  Node curTwo = two.head;

  while(curOne.next!=null){
      curNew.next = curOne;
      //curOne move on to next
      curOne = curOne.next;
      //curNew move on to next
      curNew = curNew.next;
      curNew.next=curTwo;
      if(curTwo.next!=null) {
          curTwo = curTwo.next;
      }
  }
 curNew.next = curOne;
  if(curTwo!=null) {
      curNew = curNew.next;
      while (curTwo.next != null) {

          curNew.next = curTwo;
          curNew=curNew.next;
          curTwo=curTwo.next;
      }
      curNew.next=curTwo;
  }
  return newlist;
}



   
    
}
