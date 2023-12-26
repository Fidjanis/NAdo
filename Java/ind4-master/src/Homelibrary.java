import java.util.ArrayList;

public class Homelibrary {
    ArrayList<Book> arrayList;
    Homelibrary(){
        arrayList = new ArrayList<Book>();
    }
    ArrayList<Book> getArrayList(){
        return arrayList;
    }
    void add(Book b){
        arrayList.add(b);
    }
    int getIdByName(String name){
        for(int i = 0; i<arrayList.size(); i++)
            if(name.equals(arrayList.get(i).getName()))
                return i;
        return -1;
    }
    void removeBookByInd(int ind){
        arrayList.remove(ind);
    }
    void findbook(String author){
        for(int i = 0; i<arrayList.size(); i++)
            if(author.equals(arrayList.get(i).getAuthor()))
                System.out.println(arrayList.get(i).toString());
    }
    void print(){
        for (int i = 0; i<arrayList.size(); i++)
            System.out.println(arrayList.get(i).toString());
    }
    void sortByName(){
        arrayList.sort(Book.NameComparator);
    }
    void sortByAuthor(){
        arrayList.sort(Book.AuthorComparator);
    }
}
