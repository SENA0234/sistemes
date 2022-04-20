
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
public class BookTest {
    
    public BookTest() {
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

    
    @Test
    public void testToString() {
        System.out.println("toString");
        Book instance = new Book();
        instance.setId("4");
        instance.setTitle("Perro");
        
        String expResult = instance.getId()+" "+instance.getTitle();
        String result = instance.toString();
        assertEquals(expResult, result);
    
    }

    
    @Test
    public void testGetiSetId() {
        System.out.println("getId");
        Book instance = new Book();
        String id = "11PP";
        instance.setId(id);
        String expResult = id;
        String result = instance.getId();
        assertEquals(expResult, result);
   
    }


    @Test
    public void testGetiSetTitle() {
        System.out.println("getTitle");
        Book instance = new Book();
        String title = "EL QUIJOTE LOS PALOTES";
        instance.setTitle(title);
        String expResult = title;
        String result = instance.getTitle();
        assertEquals(expResult, result);

    }

    
}
