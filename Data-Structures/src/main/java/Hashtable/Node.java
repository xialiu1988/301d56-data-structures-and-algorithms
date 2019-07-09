package Hashtable;

public class Node {

    public String key;
    public String value;
    public Node next;

    public Node(String key, String value) {
        this.key = key;
        this.value = value;
    }
    public Node()
    {

    }


    public void setKey(String key) {
        this.key = key;
    }


    public void setValue(String value) {
        this.value = value;
    }


    public void setNext(Node next) {
        this.next = next;
    }
}
