package ProperCase;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String jensErSej = "JENS er enormt SEJ";
        System.out.println(properCase(jensErSej));
    }

    public static String properCase(String string){
        String[] words = string.split(" ");
        String finalString="";

        for (String currentWord:words) {
            if (currentWord.toUpperCase().equals(currentWord)){
                finalString+=currentWord+" ";
                continue;
            } else if (currentWord.length()>3){
                currentWord=currentWord.toLowerCase();
                currentWord=currentWord.substring(0,1).toUpperCase()+currentWord.substring(1);
            } else if (currentWord.length()<=3){
                currentWord=currentWord.toLowerCase();
            }
            finalString+=currentWord+" ";

        }
        return finalString;
    }
}
