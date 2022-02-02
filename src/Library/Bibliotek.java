package Library;

import java.util.ArrayList;

public class Bibliotek {
    private ArrayList<Bog> bogListe;

    public Bibliotek() {
        this.bogListe = new ArrayList<Bog>();
    }

    public void addBook(Bog bog){
        this.bogListe.add(bog);
    }

        public boolean isBookInStock(Bog bogToCheck){
        for (Bog currentBog:this.bogListe) {
            if (currentBog.getISBNnumber()==bogToCheck.getISBNnumber()){
                return true;
            }
        }
        return false;
    }

}
