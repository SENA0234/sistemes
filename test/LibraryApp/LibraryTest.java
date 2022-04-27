/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package LibraryApp;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex
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
        Reader member = new Reader();
        member.setName("Pere");
        member.setId("44");
        Library instance = new Library();
        try {
            instance.addMember(member);
        } catch (Exception ex) {
            Logger.getLogger(LibraryTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        boolean found = false;
        for (Reader member1 : instance.members) {
            if (member1.equals(member)) {
                found = true;
            }
        }
        assertEquals(found, true);
    }

    /**
     * Test of isMemberIdExist method, of class Library.
     */
    @Test
    public void testIsMemberIdExist() {
        System.out.println("isMemberIdExist");
        Reader m = new Reader();
        String id = "44";
        m.setId(id);
        String nom = "Pep";
        m.setName(nom);
        Library instance = new Library();
        instance.members.add(m);//Si no l'afegeixes llavors et donaria error de test
        Boolean expResult = true;
        Boolean result = instance.isMemberIdExist(id);
        assertEquals(expResult, result);

    }

    /**
     * Test of giveBook method, of class Library.
     */
    @Test
    public void testGiveBookAndRecieveBook() {
        Library instance = InicialitzarLibrary();

        Book bookf = InicialitzarBook();
        Reader readerf = InicialitzarReader();
        instance.members.add(readerf);
        instance.books.add(bookf);

        instance.giveBook(bookf.getId(), readerf.getId());
        boolean found = false;
        boolean found2 = false;
        //Comprobo si el member l'ha rebut.

        found = readerf.getBorrowedBooks().contains(bookf);
        found2 = !instance.books.contains(bookf);

        assertEquals(found, true);
        assertEquals(found2, true);
//        //
        instance.receiveBook(bookf.getId(), readerf.getId());
        found = !readerf.getBorrowedBooks().contains(bookf);
        found2 = instance.books.contains(bookf);
        assertEquals(found, true);
        assertEquals(found2, true);

    }

    /**
     * Test of giveBook method, of class Library.
     */
    @Test
    public void testUniqueReader() {

        Library instance = InicialitzarLibrary();
        Reader n1 = InicialitzarReader();
        Reader n2 = InicialitzarReader();
        String hola = "";
        try {
            instance.addMember(n1);
            instance.addMember(n1);
            fail("My method didn't throw when I expected it to");
        } catch (Exception expectedException) {
        }

    }

    @Test
    public void testUniqueBook() {

        Library instance = InicialitzarLibrary();
        Book n1 = InicialitzarBook();
        Book n2 = InicialitzarBook();
        String hola = "";
        try {
            instance.books.add(n1);
            instance.books.add(n2);
            fail("My method didn't throw when I expected it to");
        } catch (Exception expectedException) {
        }

    }

    public Book InicialitzarBook() {
        String bookId = "45";
        String bookTitle = "Pepito los Palotes";
        Book b = new Book();
        b.setId(bookId);
        b.setTitle(bookTitle);
        return b;
    }

    public Reader InicialitzarReader() {
        String memberId = "32";
        String memberName = "Pere";
        Reader m = new Reader();
        m.setName(memberName);
        m.setId(memberId);

        return m;
    }

    public Library InicialitzarLibrary() {

        Library instance = new Library();

        return instance;
    }

}
