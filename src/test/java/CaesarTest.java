import models.Caesar;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaesarTest {

        @Test
        public void anotherEncode () throws Exception{
            Caesar testEncode=new Caesar ("brendah", 4);
            assertEquals (true, testEncode instanceof Caesar);
        }

        @Test
        public void getkey () throws Exception{
            Caesar Encode=new Caesar ("brendah", 7);
            assertEquals (7, Encode.getShiftKey ());
        }

        @Test
        public void word () throws Exception{
            Caesar Encode=new Caesar ("brendah",5);
            assertEquals ("brendah",Encode.getText ());
        }

        @Test
        public void testtext() {
            int shiftKey = 1;
            String text = "odille";
            String expectedtext = "pejmmf";
            String actualtext = Caesar.encrypt(text, shiftKey);

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
        assertEquals(expectedch, Caesar.encrypt( cha, key ));
    }
    @Test
    public void testIfletterisLowerCaseWork() {
        int key = 2;
        String cha = "m";
        String expectedcha = "o";
        assertEquals(expectedcha, Caesar.encrypt ( cha, key ));
    }


}







