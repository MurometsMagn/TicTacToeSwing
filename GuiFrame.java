package MainPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Smolentsev Il'ya on 03.11.2019.
 */
public class GuiFrame extends JFrame {

    private JButton button[][] = new JButton[3][3];
    private String xo = "0";
    private JLabel label = new JLabel("ход игрока " + xo);
    private Font font1 = new Font("SanSerif", Font.PLAIN, 40);
    private Font font2 = new Font("SanSerif", Font.PLAIN, 70);
    private int pressingCounter = 0;
    //private int i;
    //private int j;

    public GuiFrame() {
        super("Крестики-нолики");
        setSize(305, 425);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        JPanel jPanel = new JPanel();
        add(jPanel);
        jPanel.setLayout(null);
        label.setSize(300, 100);
        label.setFont(font1);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        jPanel.add(label);


        ActionListener listener = (ActionEvent e) -> {
            JButton b = (JButton) e.getSource();
            b.setText(xo);
            b.setEnabled(false);

            //здесь написать логику игры?
            //if(TicTacToe.winner(i, j, xo)) label.setText("победа игрока " + xo);

            xo = xo.equals("X") ? "0" : "X";
            label.setText("ход игрока " + xo);
            if (pressingCounter++ >= 8) label.setText("ничья..");
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                button[i][j] = new JButton();
                button[i][j].setBounds(j * 100, i * 100 + 100, 100, 100);
                button[i][j].setText(TicTacToe.arrayTicTac[i][j]);
                button[i][j].setFont(font2);
                jPanel.add(button[i][j]);
                button[i][j].addActionListener(listener); //как в слушатель передать индексы массива?
            }
        }
    }
}
