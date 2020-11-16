import models.Caesardecrypt;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaesardecryptTest {
    @Test
    public void anotherEncode () throws Exception{
        Caesardecrypt testEncode=new Caesardecrypt ("brendah", 4);
        assertEquals (true, testEncode instanceof Caesardecrypt);
    }

    @Test
    public void getkey () throws Exception{
        Caesardecrypt Encode=new Caesardecrypt ("brendah", 7);
        assertEquals (7, Encode.getShiftKey ());
    }

    @Test
    public void word () throws Exception{
        Caesardecrypt Encode=new Caesardecrypt ("brendah",5);
        assertEquals ("brendah",Encode.getText ());
    }

    @Test
    public void testtext() {
        int shiftKey = 1;
        String text = "pejmmf";
        String expectedtext = "odille";
        String actualtext = Caesardecrypt.decrypt(text, shiftKey);

        assertEquals(expectedtext, actualtext);
    }
    @Test
    public void theText(){
        String cipherText="hello";
        String expectedtext="hello";
        assertEquals ( expectedtext,cipherText);
    }
    @Test
    public void testUpperCase() {
        int key = 2;
        String cha = "M";
        String expectedch = "O";
        assertEquals(expectedch, Caesardecrypt .decrypt( cha, key ));
    }
    @Test
    public void testIfletterisLowerCaseWork() {
        int key = 2;
        String cha = "m";
        String expectedcha = "o";
        assertEquals(expectedcha, Caesardecrypt .decrypt ( cha, key ));
    }
}
