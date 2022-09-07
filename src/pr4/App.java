package pr4;

import java.awt.event.*;
import javax.swing.*;

class FootballMatch extends JFrame {
    int milanScore = 0, madridScore = 0;

    JLabel resultLbl = new JLabel("Result: 0 X 0");
    JLabel lastScorerLbl = new JLabel("Last Scorer: N/A");
    JLabel winnerLbl = new JLabel("Winner: DRAW");
    JButton MilanButton = new JButton("AC Milan");
    JButton MadridButton = new JButton("Real Madrid");

    public FootballMatch() {
        super("Football Match!");
        setSize(800, 700);
        setLayout(null);
        MilanButton.setBounds(300, 0, 200, 200);
        add(MilanButton);
        MadridButton.setBounds(300, 480, 200, 200);
        add(MadridButton);
        MilanButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                milanScore++;
                resultLbl.setText("Result: " + milanScore + " X " + madridScore);
                lastScorerLbl.setText("Last Scorer: AC Milan");
                if (milanScore > madridScore) {
                    winnerLbl.setText("Winner: AC Milan");
                }
                else if (milanScore == madridScore) {
                    winnerLbl.setText("Winner: DRAW");
                }
            }
            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        });
        MadridButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                madridScore++;
                resultLbl.setText("Result: " + milanScore + " X " + madridScore);
                lastScorerLbl.setText("Last Scorer: Real Madrid");
                if (madridScore > milanScore) {
                    winnerLbl.setText("Winner: Real Madrid");
                }
                else if (madridScore == milanScore) {
                    winnerLbl.setText("Winner: DRAW");
                }
            }
            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        });
        resultLbl.setBounds(350,200,200,200);
        winnerLbl.setBounds(350,250,200,200);
        lastScorerLbl.setBounds(350,300,200,200);
        add(resultLbl);
        add(winnerLbl);
        add(lastScorerLbl);
    }

    public static void main(String[] args) {
        new FootballMatch().setVisible(true);
    }
}
