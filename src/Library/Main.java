package Library;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date(12-01-1994);
        Bog bog1 = new Bog(123,"Jens",date);
        Bog bog2 = new Bog(456,"Jens",date);
        Bog bog3 = new Bog(789,"Jens",date);
        Bog bog4 = new Bog(456,"Jens",date);
        Bog bog5 = new Bog(654,"Jens",date);

        Bibliotek bib = new Bibliotek();

        bib.addBook(bog1);
        bib.addBook(bog2);
        bib.addBook(bog3);

        System.out.println(bib.isBookInStock(bog5));
    }
}
