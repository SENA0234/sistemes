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

   
    @Test
    public void testGetiSetId() {
        System.out.println("getId");
        Reader instance = new Reader();
        String nom = "11AJ3";
        instance.setId(nom);
        String expResult = nom;
        String result = instance.getId();
        assertEquals(expResult, result);

    }
    
    
    @Test
    public void testGetiSetName() {
        System.out.println("getName");
        Reader instance = new Reader();
        String nom = "FRANCISCO";
        String expResult = nom;
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    

    /**
     * Test of getBorrowedBooks method, of class Reader.
     */
    @Test
    public void testGetiSetBorrowedBooks() {
        System.out.println("getBorrowedBooks");
         ArrayList<Book> borrowedBooks = new ArrayList<>();
         Book b1 = new Book();
         b1.setId("44");
         b1.setTitle("QUIJOTE");
         
         Book b2 = new Book();
        b2.setId("45P");
        b2.setTitle("ALBERTO");
         borrowedBooks.add(b1);
         borrowedBooks.add(b2);
       
                 
        Reader instance = new Reader();
        instance.setBorrowedBooks(borrowedBooks);
        ArrayList<Book> result = instance.getBorrowedBooks();
        assertEquals(borrowedBooks, result);
       
    }


    @Test
    public void testReceiveBook() {
        System.out.println("receiveBook");
        
      
        Book book = new Book();
        book.setId("4");
        book.setTitle("PERE");
        
        Reader instance = new Reader();
        instance.receiveBook(book);
        
        
        assertEquals(instance.getBorrowedBooks().contains(book),true);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    
    @Test
    public void testGiveBook() {
        System.out.println("giveBook");
        Book book = new Book();
        book.setId("4");
        book.setTitle("PERE");
        Reader instance = new Reader();
        instance.giveBook(book);
        
        assertEquals(instance.getBorrowedBooks().contains(book),false);
    }
    
}
