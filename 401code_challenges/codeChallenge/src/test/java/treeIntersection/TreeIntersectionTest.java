package treeIntersection;

import org.junit.Test;

import java.util.List;
import static org.junit.Assert.*;
import static treeIntersection.TreeIntersection.treeIntersection;

public class TreeIntersectionTest {

    @Test
    public void cantesttreeIntersection() {

        Tree tr1 = new Tree();
        tr1.add(3);
        tr1.add(5);
        Tree tr2 = new Tree();
        tr2.add(5);

        List<Integer> res= treeIntersection(tr1.root, tr2.root);


        assertTrue(res.size() == 1);

        assertTrue(res.get(0)==5);
    }


    @Test
    public void cantesttwotrees() {

        Tree tr1 = new Tree();
        tr1.add(31);
        tr1.add(51);
        Tree tr2 = new Tree();
        tr2.add(51);
        tr2.add(31);
        List<Integer> res= treeIntersection(tr1.root, tr2.root);


        assertTrue(res.size() == 2);

        assertTrue(res.get(0)==31);
        assertTrue(res.get(1)==51);

    }

    @Test
    public void cantesttwotree() {

        Tree tr1 = new Tree();
        tr1.add(31);
        tr1.add(51);
        Tree tr2 = new Tree();
        tr2.add(1);
        tr2.add(11);
        List<Integer> res= treeIntersection(tr1.root, tr2.root);


        assertTrue(res.size() == 0);


    }


}