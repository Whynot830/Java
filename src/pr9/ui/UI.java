package pr9.ui;

import pr9.db.db;
import pr9.students.*;

import javax.swing.*;
import java.util.ArrayList;

public class UI {
    JLabel nameLbl = new JLabel("Имя:");
    JTextField nameInput = new JTextField(30);

    JLabel surnameLbl = new JLabel("Фамилия:");
    JTextField surnameInput = new JTextField(30);

    JLabel innLbl = new JLabel("ИНН:");
    JTextField innInput = new JTextField(30);

    JButton sortBtn = new JButton("Отсортировать");

    String inn = "", name = "", surname = "";

    public UI(JFrame window) {
        window.add(nameLbl);
        window.add(nameInput);
        nameInput.addActionListener(e -> {
            name = nameInput.getText();
            surname = surnameInput.getText();
            System.out.println(StudentsController.search(new Student(name, surname)));
        });

        window.add(surnameLbl);
        window.add(surnameInput);
        surnameInput.addActionListener(e ->  {
            name = nameInput.getText();
            surname = surnameInput.getText();
            System.out.println(StudentsController.search(new Student(name, surname)));
        });

        window.add(innLbl);
        window.add(innInput);
        innInput.addActionListener(e -> {
            inn = innInput.getText();
            System.out.println(StudentsController.check(inn));
        });

        window.add(sortBtn);
        sortBtn.addActionListener(e -> {
            ArrayList<Student> arr = db.getStudents();
            arr.sort(new SortingStudentsByGPA());
            for (Student st : db.getStudents())
                System.out.println(st);
        });

        nameLbl.setBounds(70, 60, 100, 20);
        nameInput.setBounds(170, 60, 200, 20);
        surnameLbl.setBounds(70, 110, 100, 20);
        surnameInput.setBounds(170, 110, 200, 20);
        innLbl.setBounds(70, 160, 100, 20);
        innInput.setBounds(170, 160, 200, 20);
        sortBtn.setBounds(150, 220, 140, 40);

    }
}
