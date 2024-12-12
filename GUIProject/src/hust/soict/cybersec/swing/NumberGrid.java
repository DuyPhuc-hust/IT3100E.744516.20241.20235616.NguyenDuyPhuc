package hust.soict.cybersec.swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberGrid extends JFrame {
    private JButton[] btnNumbers; 
    private JButton btnDelete;   
    private JButton btnReset;    
    private JTextField tfDisplay;

    public NumberGrid() {
        this.setTitle("Number Grid");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        tfDisplay = new JTextField();
        tfDisplay.setHorizontalAlignment(JTextField.RIGHT);
        tfDisplay.setEditable(false);
        this.add(tfDisplay, BorderLayout.NORTH);

        JPanel panelButtons = new JPanel();
        panelButtons.setLayout(new GridLayout(4, 3)); 

                btnNumbers = new JButton[10];
        for (int i = 1; i <= 9; i++) {
            btnNumbers[i] = new JButton(String.valueOf(i));
            panelButtons.add(btnNumbers[i]);
            btnNumbers[i].addActionListener(new ButtonListener()); 
        }

        btnDelete = new JButton("DEL");
        btnNumbers[0] = new JButton("0");
        btnReset = new JButton("C");

        panelButtons.add(btnDelete);
        panelButtons.add(btnNumbers[0]);
        panelButtons.add(btnReset);

        btnDelete.addActionListener(new ButtonListener());
        btnNumbers[0].addActionListener(new ButtonListener());
        btnReset.addActionListener(new ButtonListener());

        this.add(panelButtons, BorderLayout.CENTER);

        this.setVisible(true);
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String button = e.getActionCommand();

            if (button.charAt(0) >= '0' && button.charAt(0) <= '9') {
                tfDisplay.setText(tfDisplay.getText() + button);
            }
            else if (button.equals("DEL")) {
                String currentText = tfDisplay.getText();
                if (!currentText.isEmpty()) {
                    tfDisplay.setText(currentText.substring(0, currentText.length() - 1));
                }
            }
            else if (button.equals("C")) {
                tfDisplay.setText("");
            }
        }
    }

    public static void main(String[] args) {
        new NumberGrid();
    }
}
