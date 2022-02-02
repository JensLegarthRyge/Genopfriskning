package Library;

import java.util.Date;

public class Bog {
    private int ISBNnumber;
    private String title;
    private Date releaseDate;

    public Bog(int ISBNnumber, String title, Date releaseDate){
        this.ISBNnumber = ISBNnumber;
        this.title = title;
        this.releaseDate = releaseDate;
    }

    public int getISBNnumber(){
        return this.ISBNnumber;
    }

    public String getTitle() {
        return title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setISBNnumber(int ISBNnumber) {
        this.ISBNnumber = ISBNnumber;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Library.Bog{" +
                "ISBNnumber=" + ISBNnumber +
                ", title='" + title + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
