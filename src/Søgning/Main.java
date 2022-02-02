package Søgning;

public class Main {
    public static void main(String[] args) {
        String[] navne ={"Jens","Timmy","Samuel","Johannes","Mikkel"};
        System.out.println(isStringInArrayWithException(navne, "Benjamin"));

    }

    public static int isStringInArray(String[] arrayToSearch, String stringToFind) {
        for (int i = 0; i < arrayToSearch.length; i++) {
            if (arrayToSearch[i].equals(stringToFind)) {
                return i;
            }
        }
        return -1;
    }

    public static int isStringInArrayWithException(String[] arrayToSearch, String stringToFind) {
        int indexOfWordInArray = -1;
        for (int i = 0; i < arrayToSearch.length; i++) {
            if (arrayToSearch[i].equals(stringToFind)) {
                return i;
            }
        }
        try{
            if (indexOfWordInArray==-1){
                throw new Exception("String not found");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return indexOfWordInArray;
    }
}
