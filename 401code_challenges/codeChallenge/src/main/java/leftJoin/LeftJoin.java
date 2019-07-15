package leftJoin;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class LeftJoin {
    public  static void main(String[] args)
    {
        Hashtable hs1 = new Hashtable();
        hs1.put("fond", "enamored");
        hs1.put("wrath", "anger");
        hs1.put("diligent", "employed");
        hs1.put("outift", "garb");

        Hashtable hs2 = new Hashtable();
        hs2.put("fond", "average");
        hs2.put("wrath", "delight");
        hs2.put("guide", "follow");

        //printout table one which is left table
        hs1.forEach(
                (k, v) -> System.out.println("Key : " + k + ", Value : " + v));


        System.out.println("  ");
        //print out the right table
        hs2.forEach(
                (k, v) -> System.out.println("Key : " + k + ", Value : " + v));

         System.out.println("===================");
        //get the list from the method
        List<String> list= Leftjointables(hs1, hs2);
        //print the list out to the console.
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println("["+list.get(i)+ "]");
        }

    }

    /// <summary>
    /// leftjoin table
    /// </summary>
    /// <param name="hs1"></param>
    /// <param name="hs2"></param>
    /// <returns></returns>
    public static List<String> Leftjointables(Hashtable hs1,Hashtable hs2)
    {
        List<String> list = new ArrayList<>();

        hs1.forEach(
                (k, v) -> {
                    if (hs2.containsKey(k)){
                        list.add(k + ":" + hs1.get(k) + "," + hs2.get(k));
                    }
                    else{
                        list.add(k + ":" + hs1.get(k) + "," + "null");
                    }
                }

        );


        return list;

    }
}
