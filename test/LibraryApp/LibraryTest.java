/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package LibraryApp;

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
public class LibraryTest {
    
    public LibraryTest() {
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
     * Test of addMember method, of class Library.
     */
    @Test
    public void testAddMember() {
        System.out.println("addMember");
        Reader member = null;
        Library instance = new Library();
        instance.addMember(member);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isMemberIdExist method, of class Library.
     */
    @Test
    public void testIsMemberIdExist() {
        System.out.println("isMemberIdExist");
        String id = "";
        Library instance = new Library();
        Boolean expResult = null;
        Boolean result = instance.isMemberIdExist(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of giveBook method, of class Library.
     */
    @Test
    public void testGiveBook() {
        System.out.println("giveBook");
        String bookId = "";
        String memberId = "";
        Library instance = new Library();
        instance.giveBook(bookId, memberId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of receiveBook method, of class Library.
     */
    @Test
    public void testReceiveBook() {
        System.out.println("receiveBook");
        String bookId = "";
        String memberId = "";
        Library instance = new Library();
        instance.receiveBook(bookId, memberId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
