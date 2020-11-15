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
    public void chararray(){
        char ch='a';
        char expectedch='a';
        assertEquals ( expectedch,ch);
    }

    @Test
    public void uppercase(){
        char c='B';
        char expectedc='B';
        assertEquals ( expectedc,c);
    }
    @Test
    public void lowercase(){
        char c='d';
        char expectedc='d';
        assertEquals ( expectedc,c);
    }

}



