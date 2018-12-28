package MehdiAfsariBook.BookLibrary.model.TOs;

import java.sql.Clob;

/**
 * Created by Amir on 12/28/2018.
 */
public class BookTO {
    private String name;
    private long ID;
    private String ISBN;
    private String author;//author
    private Clob text;

    public BookTO() {
    }

    public BookTO(String name, String ISBN, String author, Clob text) {
        this.name = name;
        this.ISBN = ISBN;
        this.author = author;
        this.text = text;
    }

    public Clob getText() {
        return text;
    }

    public void setText(Clob text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public long getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BookTO{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", ISBN='" + ISBN + '\'' +
                ", author='" + author + '\'' +
                ", text=" + text +
                '}';
    }
}
