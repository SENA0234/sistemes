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
public class MainTest {
    
    public MainTest() {
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
     * Test of initLibraryData method, of class Main.
     */
    @Test
    public void testInitLibraryData() {
        System.out.println("initLibraryData");
        Main.initLibraryData();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of chooseMenu method, of class Main.
     */
    @Test
    public void testChooseMenu() {
        
        System.out.println("chooseMenu");
        int expResult = 7;
        int result = Main.chooseMenu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of showBooks method, of class Main.
     */
    @Test
    public void testShowBooks() {
        System.out.println("showBooks");
        Main.showBooks();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showMembers method, of class Main.
     */
    @Test
    public void testShowMembers() {
        System.out.println("showMembers");
        Main.showMembers();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addMember method, of class Main.
     */
    @Test
    public void testAddMember() {
        System.out.println("addMember");
        Main.addMember();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of borrowBook method, of class Main.
     */
    @Test
    public void testBorrowBook() {
        System.out.println("borrowBook");
        Main.borrowBook();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnBook method, of class Main.
     */
    @Test
    public void testReturnBook() {
        System.out.println("returnBook");
        Main.returnBook();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
