/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package LibraryApp;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alexc
 */
public class ReaderTest {
    
    public ReaderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toString method, of class Reader.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Reader instance = new Reader();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Reader.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Reader instance = new Reader();
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Reader.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String id = "";
        Reader instance = new Reader();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Reader.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Reader instance = new Reader();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Reader.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Reader instance = new Reader();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBorrowedBooks method, of class Reader.
     */
    @Test
    public void testGetBorrowedBooks() {
        System.out.println("getBorrowedBooks");
        Reader instance = new Reader();
        ArrayList<Book> expResult = null;
        ArrayList<Book> result = instance.getBorrowedBooks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBorrowedBooks method, of class Reader.
     */
    @Test
    public void testSetBorrowedBooks() {
        System.out.println("setBorrowedBooks");
        ArrayList<Book> borrowedBooks = null;
        Reader instance = new Reader();
        instance.setBorrowedBooks(borrowedBooks);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of receiveBook method, of class Reader.
     */
    @Test
    public void testReceiveBook() {
        System.out.println("receiveBook");
        Book book = null;
        Reader instance = new Reader();
        instance.receiveBook(book);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of giveBook method, of class Reader.
     */
    @Test
    public void testGiveBook() {
        System.out.println("giveBook");
        Book book = null;
        Reader instance = new Reader();
        instance.giveBook(book);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
