package leftJoin;

import org.junit.Test;

import java.util.Hashtable;
import java.util.List;

import static leftJoin.LeftJoin.Leftjointables;
import static org.junit.Assert.assertEquals;

public class LeftJoinTest {

    /// both table has food,can combine the values
    @Test
    public void leftjointables() {

        Hashtable h1 = new Hashtable();
        h1.put("food", "apple");

        Hashtable h2 = new Hashtable();
        h2.put("food", "kiwi");

        List<String> list= Leftjointables(h1, h2);
        String expected = "food:apple,kiwi";
        //string expected2 ="drink:coke,water";
        //string expected3 = "desert:cake,null";
        assertEquals(expected,list.get(0));
    }

    //left table has food , so the right table value will be null
     @Test
     public void cantestLeftjoin() {
    Hashtable h1 = new Hashtable();
    h1.put("food", "apple");

    Hashtable h2 = new Hashtable();
    h2.put("drink", "kiwi");

    List<String> list = Leftjointables(h1, h2);
    String expected = "food:apple,null";
         assertEquals(expected, list.get(0));

}

    // left table has drink, so right table value will be null for the drink

    @Test
    public void cancombinethevaluesbasedonlefttable() {
        Hashtable h1 = new Hashtable();

        h1.put("drink", "coke");

        Hashtable h2 = new Hashtable();
        h2.put("food", "kiwi");

        List<String> list = Leftjointables(h1, h2);

        String expected2 ="drink:coke,null";


        assertEquals(expected2, list.get(0));

    }

}