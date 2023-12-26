import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel {
    JLabel l01, l02, l1, l2, l3, l4;
    static JTextField f1, f2, f3,f4;
    JButton addButton, showButton, deleteButton;
    public static Homelibrary Homelibrary;

    MyPanel() {
        Homelibrary = new Homelibrary();

        l1 = new JLabel("name");
        add(l1);
        f1 = new JTextField();
        f1.setColumns(10);
        add(f1);

        l2 = new JLabel("author");
        add(l2);
        f2 = new JTextField();
        f2.setColumns(10);
        add(f2);

        l3 = new JLabel("year");
        add(l3);
        f3 = new JTextField();
        f3.setColumns(10);
        add(f3);

        l4 = new JLabel("pages");
        add(l4);
        f4 = new JTextField();
        f4.setColumns(10);
        add(f4);

        setLayout(new GridLayout(0, 2, 10, 10));


        addButton = new JButton("Add");
        AddListener m = new AddListener();
        addButton.addActionListener(m);
        add(addButton);



        deleteButton = new JButton("Delete");
        DeleteListener d = new DeleteListener();
        deleteButton.addActionListener(d);
        add(deleteButton);

        showButton = new JButton("Show books in library");
        ShowListener s = new ShowListener();
        showButton.addActionListener(s);
        add(showButton);

        showButton = new JButton("Sort by name");
        SortByNameListener n = new SortByNameListener();
        showButton.addActionListener(n);
        add(showButton);

        showButton = new JButton("Sort by author");
        SortByAuthorListener a = new SortByAuthorListener();
        showButton.addActionListener(a);
        add(showButton);

    }

    static class AddListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = f1.getText();
            String author = f2.getText();
            int year = Integer.parseInt(f3.getText());
            int pages = Integer.parseInt(f4.getText());
            Book book = new Book(name,author,year,pages);
            Homelibrary.add(book);
        }
    }

    static class ShowListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            StringBuilder allBooks = new StringBuilder();
            for (Book b : Homelibrary.getArrayList()){
                allBooks.append("Name: '").append(b.getName()).append("' Author: ").append(b.getAuthor()).append(" Pages: ").append(b.getPages()).append(" Year: ").append(b.getYear()).append("\n");
            }
            JOptionPane.showMessageDialog(null, allBooks.toString(), "Books in library", JOptionPane.PLAIN_MESSAGE);
        }
    }

    static class DeleteListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String name = f1.getText();
            int index = Homelibrary.getIdByName(name);
            System.out.println(index + " " + name);
            if (index != -1) {
                Homelibrary.removeBookByInd(index);
            } else {
                JOptionPane.showMessageDialog(null, "Book not in library", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    static class SortByNameListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            Homelibrary.sortByName();
        }
    }

    static class SortByAuthorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            Homelibrary.sortByAuthor();
        }
    }
}