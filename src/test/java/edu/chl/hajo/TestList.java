package edu.chl.hajo;

import static java.lang.System.out;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
    
     This is a test class (for some other class, in this case the List class)

 */
public class TestList {

    @Test
    public void testAdd() {
        List l = new List();
        l.add(1);                        // Call method to test
        assertTrue(l.getLength() == 1);  // The logical check
    }

    @Test
    public void testRemove(){
        List l = new List();
        l.add(3);
        int i = l.remove();
        assertEquals(3, i);
        assertTrue(l.getLength() == 0);

    }

    @Test
    public void testGet(){
        List l = new List();
        l.add(4);
        l.add(2);
        l.add(8);
        l.add(6);
        l.add(1);

        int i = l.get(2);
        assertEquals(8,i);
        assertTrue(l.getLength()== 5);

    }

    @Test(expected=IllegalArgumentException.class)
    public void testGetBadIndex() {
        List l = new List();
        l.add(6);
        l.add(9);
        l.add(3);

        // Get a list then ...
        l.get(-1); // Exception!!!
    }
}
