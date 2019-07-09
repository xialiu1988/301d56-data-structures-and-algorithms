package Hashtable;

public class App {
    public static  void main(String[] args){
        Hashtable ht = new Hashtable(16);
        ht.add("John", "Husband");
        System.out.println(ht.get("John").getlist());
        ht.add("Cathy", "Boss");
        ht.add("Amanda", "The Real Boss");
        ht.add("Allie", "Kid");
        ht.add("Zach", "Kid");
        ht.add("Zach", "Kiddggegeg");
        System.out.println("done");
        System.out.println(ht.get("Zach").getlist());

    }
}
