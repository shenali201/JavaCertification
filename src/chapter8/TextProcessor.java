package chapter8;
/*A method that counts the words in a sentence
and print them in a new line*/

public class TextProcessor {

    public static void main(String arg[]){
        countWords("487 DUPLEX AVE");
        reverseString("hello");
        addSpaces("HeyWorldIt'sMeShenali");
    }

    private static void addSpaces(String text) {
        var modifiedText = new StringBuilder(text);
        for(int i=0; i<text.length(); i++){
            if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                

            }
        }
    }

    private static void reverseString(String text) {
        for (int i=text.length()-1; i>=0; i--){
            System.out.print(text.charAt(i));
        }
    }

    private static void countWords(String text) {
        var words = text.split("");
        int numOfWords = words.length;

        String message = String.format("your string contains %d words: ", numOfWords);
        System.out.println(message);

        for (int i=0; i<numOfWords; i++){
            System.out.print(words[i]);
        }

    }
}
