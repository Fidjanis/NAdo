import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel {
    JLabel l01, l02, l1, l2, l3, l4;
    static JTextField f1, f2;
    JButton addButton, showButton, deleteButton;
    public static School School;

    MyPanel() {
        School = new School();

        l1 = new JLabel("Fio");
        add(l1);
        f1 = new JTextField();
        f1.setColumns(10);
        add(f1);

        l2 = new JLabel("klass");
        add(l2);
        f2 = new JTextField();
        f2.setColumns(10);
        add(f2);

        setLayout(new GridLayout(0, 2, 10, 10));


        addButton = new JButton("Add");
        AddListener m = new AddListener();
        addButton.addActionListener(m);
        add(addButton);



        deleteButton = new JButton("Delete");
        DeleteListener d = new DeleteListener();
        deleteButton.addActionListener(d);
        add(deleteButton);

        showButton = new JButton("Show pupil in school");
        ShowListener s = new ShowListener();
        showButton.addActionListener(s);
        add(showButton);

        showButton = new JButton("Sort by name");
        SortByNameListener n = new SortByNameListener();
        showButton.addActionListener(n);
        add(showButton);

        showButton = new JButton("Sort by klass");
        SortByAuthorListener a = new SortByAuthorListener();
        showButton.addActionListener(a);
        add(showButton);

    }

    static class AddListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String fio = f1.getText();
            int klass = Integer.parseInt(f2.getText());
            Pupil pupil = new Pupil(fio,klass);
            School.add(pupil);
        }
    }

    static class ShowListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            StringBuilder allPupil = new StringBuilder();
            for (Pupil b : School.getArrayList()){
                allPupil.append("Name: '").append(b.getFio()).append(" Klass: ").append(b.getKlass()).append("\n");
            }
            JOptionPane.showMessageDialog(null, allPupil.toString(), "Pupil in School", JOptionPane.PLAIN_MESSAGE);
        }
    }

    static class DeleteListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String fio = f1.getText();
            int index = School.getIdByName(fio);
            System.out.println(index + " " + fio);
            if (index != -1) {
                School.removePupilByInd(index);
            } else {
                JOptionPane.showMessageDialog(null, "Pupil not in school", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    static class SortByNameListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            School.sortByName();
        }
    }

    static class SortByAuthorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            School.sortByKlass();
        }
    }
}