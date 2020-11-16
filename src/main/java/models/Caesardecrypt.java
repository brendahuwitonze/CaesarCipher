package models;



public class Caesardecrypt {
    private String text;
    private int shiftKey;

    public Caesardecrypt (String text, int shiftKey){
        this.text=text;
        this.shiftKey=shiftKey;

    }

    public int getShiftKey (){
        return this.shiftKey;
    }

    public String getText (){
        return this.text;
    }
    public static String decrypt (String text,int shiftKey){
        if(shiftKey >26){

            shiftKey=(shiftKey%26);
        }
        else if(shiftKey < 0){

            shiftKey=(shiftKey % 26)+26;
        }
        String cipherText="";

        int length=text.length();

        for(int i=0;i<length;i++){

            char ch=text.charAt(i);

            if(Character.isLetter(ch)){

                if(Character.isLowerCase(ch)) {

                    char c=(char) (ch - shiftKey);

                    if (c < 'a') {
                        cipherText+=(char)(ch+(26-shiftKey));
                    }
                    else{
                        cipherText +=c;
                    }
                }
                else if(Character.isUpperCase(ch)){

                    char c=(char)(ch-shiftKey);

                    if(c<'A'){

                        cipherText+=(char)(ch+(26-shiftKey));
                    }
                    else{
                        cipherText +=c;
                    }
                }
            }
            else{
                cipherText+=ch;
            }
        }
        return cipherText;
    }
}
