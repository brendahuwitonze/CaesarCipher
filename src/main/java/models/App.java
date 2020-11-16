package models;
import java.io.Console;
public class App {
    public static void main(String[]orgs){
        Console myConsole=System.console();
        System.out.println ("Enter the text");
        String word=myConsole.readLine ();
        System.out.println ("Enter the key");
        String key=myConsole.readLine ();
        int nKey=Integer.parseInt (key);
        if((nKey<1)||(nKey>26)){

        }

    }


}
