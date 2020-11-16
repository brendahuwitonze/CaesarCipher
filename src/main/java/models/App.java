
package models;
import java.util.Scanner;
public class App {
    public static void main(String[]orgs){

        Scanner aScanner=new Scanner(System.in);
        String word;
        int key;
        System.out.println ("Enter the text");
        word=aScanner.nextLine();

        System.out.println ("Enter the key");
        key=aScanner.nextInt();


        if((key<1)||(key>26)) {
            System.out.println ("Enter the key that is between 1 and 26");
        }
        System.out.println("the encrypted text:" + Caesar.encrypt(word,key));


        System.out.println("the decrepted text:" + Caesardecrypt.decrypt(Caesar.encrypt(word,key),key));


    }


}



