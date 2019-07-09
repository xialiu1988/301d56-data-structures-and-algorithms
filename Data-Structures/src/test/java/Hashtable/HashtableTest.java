package Hashtable;

import Tree.Tree;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest extends Tree {

//    Adding a key/value to your hashtable results in the value being in the data structure
//    Retrieving based on a key returns the value stored
//    Successfully returns null for a key that does not exist in the hashtable
//    Successfully handle a collision within the hashtable
//    Successfully retrieve a value from a bucket within the hashtable that has a collision
//    Successfully hash a key to an in-range value

    @Test
    public void testadd() {
        Hashtable h = new Hashtable();
        h.add("5", "test");
        assertTrue(h.contains("5"));

    }

    @Test
    public void hash() {
        Hashtable h = new Hashtable();
        assertEquals("shold have the leter to the value in-range",42,h.hash("l"));
    }


   // Retrieving based on a key returns the value stored
    @Test
    public void cabgetVal() {
        Hashtable ht = new Hashtable(16);
        ht.add("John", "Husband");
        assertEquals("should get value of Husband when key is John","(John,Husband),",ht.get("John").getlist());
    }


//Successfully handle a collision within the hashtable
@Test
public void handlecollision() {
    Hashtable h = new Hashtable();
    h.add("5", "test");
    h.add("15", "test");
    assertTrue(h.contains("5"));
    assertTrue(h.contains("15"));

}


  //  Successfully returns null for a key that does not exist in the hashtable
        @Test
        public void cantestnullvalue() {
        Hashtable h = new Hashtable();
        h.add("5", "test");
        assertEquals(null, h.get("11"));


    }
//Successfully retrieve a value from a bucket within the hashtable that has a collision
@Test
    public void retrieveVal(){
    Hashtable h = new Hashtable();
    h.add("15", "yoyo test");
    h.add("15", "pikachu");
    assertEquals("(15,yoyo test),(15,pikachu),",h.get("15").getlist());
}
}