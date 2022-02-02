package Kvadrat;

public class Kvadrat {
    public static void main(String[] args) {
        printSquare(6,")");
    }

    public static void printSquare(int size, String symbol){
        for (int i = 0; i < size; i++) {
            if (i>=1){
                System.out.println();
            }
            for (int j = 0; j < size; j++) {
                System.out.print(symbol+"  ");
            }
        }
    }
}
