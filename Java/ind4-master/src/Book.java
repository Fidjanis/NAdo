import java.util.Comparator;

public class Book {
    private int year, pages;
    private String author, name;
    Book(String name, String author, int year, int pages){
        this.name = name;
        this.author = author;
        this.year = year;
        this.pages = pages;
    }

    public int getPages() {
        return this.pages;
    }

    public int getYear() {
        return this.year;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.name;
    }

    public String toString(){
        return "Name: "+name+" Author: "+author+" Year: "+year+" Pages: "+pages;
    }
    public static Comparator<Book> NameComparator = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
    public static Comparator<Book> AuthorComparator = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getAuthor().compareTo(o2.getAuthor());
        }
    };
}
