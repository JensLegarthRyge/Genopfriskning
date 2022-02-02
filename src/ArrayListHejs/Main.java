package ArrayListHejs;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    }

    boolean doesArrayListContainString(ArrayList<String> strings, String string){
        for (String currentString:strings) {
            if (strings.contains(string)) {
                System.out.println("The String has been found");
                return true;
            }
        }
        strings.add(string);
        return false;
    }


}
