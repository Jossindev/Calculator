
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewCalculator {

    private double total = 0.0;
    private double total1 = 0.0;
    private char math_operator;


    private JPanel JavaCalculator;
    private JTextField textDisplay;
    private JButton clearButton;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a4Button;
    private JButton a7Button;
    private JButton a3Button;
    private JButton a5Button;
    private JButton a8Button;
    private JButton zeroButton;
    private JButton PlusButton;
    private JButton DivideButton;
    private JButton EqualButton;
    private JButton MinusButton;
    private JButton MultipleButton;
    private JButton ButtonPoint;


    private void getOperator(String btnText){
        math_operator = btnText.charAt(0);
        total = total + Double.parseDouble(textDisplay.getText());
        textDisplay.setText("");
    }

    public NewCalculator() {
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a1ButtonText = textDisplay.getText() + a1Button.getText();
                textDisplay.setText(a1ButtonText);
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a2ButtonText = textDisplay.getText() + a2Button.getText();
                textDisplay.setText(a2ButtonText);
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a3ButtonText = textDisplay.getText() + a3Button.getText();
                textDisplay.setText(a3ButtonText);
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a4ButtonText = textDisplay.getText() + a4Button.getText();
                textDisplay.setText(a4ButtonText);
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a5ButtonText = textDisplay.getText() + a5Button.getText();
                textDisplay.setText(a5ButtonText);
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a6ButtonText = textDisplay.getText() + a6Button.getText();
                textDisplay.setText(a6ButtonText);
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a7ButtonText = textDisplay.getText() + a7Button.getText();
                textDisplay.setText(a7ButtonText);
            }
        });a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a8ButtonText = textDisplay.getText() + a8Button.getText();
                textDisplay.setText(a8ButtonText);
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a9ButtonText = textDisplay.getText() + a9Button.getText();
                textDisplay.setText(a9ButtonText);
            }
        });
        zeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String  zeroButtonText = textDisplay.getText() +  zeroButton.getText();
                textDisplay.setText(zeroButtonText);
            }
        });
        PlusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = PlusButton.getText();
                getOperator(button_text);
            }
        });
        EqualButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               switch (math_operator){
                   case '+':
                       total1 = total + Double.parseDouble(textDisplay.getText());
                       break;
                   case '-':
                       total1 = total - Double.parseDouble(textDisplay.getText());
                       break;
                   case '/':
                       total1 = total / Double.parseDouble(textDisplay.getText());
                       break;
                   case '*':
                       total1 = total * Double.parseDouble(textDisplay.getText());
                       break;
               }

                textDisplay.setText(Double.toString(total1));
                total = 0;
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = 0;
                textDisplay.setText("");
            }
        });
        ButtonPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textDisplay.getText().equals("")) {
                    textDisplay.setText("0.");
                }
                 else if(textDisplay.getText().contains(".")) {
                 ButtonPoint.setEnabled(false);
                }
                 else {
                 String ButtonPointText = textDisplay.getText() + ButtonPoint.getText();
                 textDisplay.setText(ButtonPointText);
                }
                 ButtonPoint.setEnabled(true);
            }
        });
        MinusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = MinusButton.getText();
                getOperator(button_text);
            }
        });
        DivideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = DivideButton.getText();
                getOperator(button_text);
            }
        });
        MultipleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = MultipleButton.getText();
                getOperator(button_text);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("NewCalculator");
        frame.setContentPane(new NewCalculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
