import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    MyButton button1;
    MyButton button2;
    MyButton button3;
    MyButton button4;
    MyButton button5;
    MyButton button6;
    MyButton button7;
    MyButton button8;
    MyButton button9;  
    JPanel panel;

    ImageIcon frameIcon = new ImageIcon("frameIcon.png");

    boolean turn = false;

    char buttonsStatus[][] = new char[3][3];

    private void refreshButtonsStatus(){
        buttonsStatus[0][0] = button1.getStatus();
        buttonsStatus[0][1] = button2.getStatus();
        buttonsStatus[0][2] = button3.getStatus();
        buttonsStatus[1][0] = button4.getStatus();
        buttonsStatus[1][1] = button5.getStatus();
        buttonsStatus[1][2] = button6.getStatus();
        buttonsStatus[2][0] = button7.getStatus();
        buttonsStatus[2][1] = button8.getStatus();
        buttonsStatus[2][2] = button9.getStatus();
    }

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,600);
        this.setLayout(new GridLayout(3,3,0,0));
        this.setResizable(false);
        this.setTitle("TicTacToe");
        this.setIconImage(frameIcon.getImage());


        button1 = new MyButton(this);
        button2 = new MyButton(this);
        button3 = new MyButton(this);
        button4 = new MyButton(this);
        button5 = new MyButton(this);
        button6 = new MyButton(this);
        button7 = new MyButton(this);
        button8 = new MyButton(this);
        button9 = new MyButton(this);

        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(button5);
        this.add(button6);
        this.add(button7);
        this.add(button8);
        this.add(button9);

        refreshButtonsStatus();
        this.setVisible(true);
    }

    private void disableAllButtons(){
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(turn) {
            if (e.getSource() == button1) {
                button1.setXIcon();
            } else if (e.getSource() == button2) {
                button2.setXIcon();
            } else if (e.getSource() == button3) {
                button3.setXIcon();
            } else if (e.getSource() == button4) {
                button4.setXIcon();
            } else if (e.getSource() == button5) {
                button5.setXIcon();
            } else if (e.getSource() == button6) {
                button6.setXIcon();
            } else if (e.getSource() == button7) {
                button7.setXIcon();
            } else if (e.getSource() == button8) {
                button8.setXIcon();
            } else if (e.getSource() == button9) {
                button9.setXIcon();
            }
            turn = false;
        }
        else {
            if (e.getSource() == button1) {
                button1.setOIcon();
            } else if (e.getSource() == button2) {
                button2.setOIcon();
            } else if (e.getSource() == button3) {
                button3.setOIcon();
            } else if (e.getSource() == button4) {
                button4.setOIcon();
            } else if (e.getSource() == button5) {
                button5.setOIcon();
            } else if (e.getSource() == button6) {
                button6.setOIcon();
            } else if (e.getSource() == button7) {
                button7.setOIcon();
            } else if (e.getSource() == button8) {
                button8.setOIcon();
            } else if (e.getSource() == button9) {
                button9.setOIcon();
            }
            turn = true;
        }
        refreshButtonsStatus();

        if((buttonsStatus[0][0] == buttonsStatus[0][1]) && (buttonsStatus[0][1] == buttonsStatus[0][2]) && (buttonsStatus[0][0] != 'b')){
            if(buttonsStatus[0][0] == 'x'){
                System.out.println("Player X win");
            }
            else{
                System.out.println("Player O win");
            }
            disableAllButtons();
        }
        else if ((buttonsStatus[1][0] == buttonsStatus[1][1]) && (buttonsStatus[1][1] == buttonsStatus[1][2]) && (buttonsStatus[1][0] != 'b')){
            if(buttonsStatus[1][0] == 'x'){
                System.out.println("Player X win");
            }
            else{
                System.out.println("Player O win");
            }
            disableAllButtons();
        }
        else if ((buttonsStatus[2][0] == buttonsStatus[2][1]) && (buttonsStatus[2][1] == buttonsStatus[2][2]) && (buttonsStatus[2][0] != 'b')){
            if(buttonsStatus[2][0] == 'x'){
                System.out.println("Player X win");
            }
            else{
                System.out.println("Player O win");
            }
            disableAllButtons();
        }
        else if ((buttonsStatus[0][0] == buttonsStatus[1][0]) && (buttonsStatus[1][0] == buttonsStatus[2][0]) && (buttonsStatus[0][0] != 'b')){
            if(buttonsStatus[0][0] == 'x'){
                System.out.println("Player X win");
            }
            else{
                System.out.println("Player O win");
            }
            disableAllButtons();
        }
        else if ((buttonsStatus[0][1] == buttonsStatus[1][1]) && (buttonsStatus[1][1] == buttonsStatus[2][1]) && (buttonsStatus[0][1] != 'b')){
            if(buttonsStatus[0][1] == 'x'){
                System.out.println("Player X win");
            }
            else{
                System.out.println("Player O win");
            }
            disableAllButtons();
        }
        else if ((buttonsStatus[0][2] == buttonsStatus[1][2]) && (buttonsStatus[1][2] == buttonsStatus[2][2]) && (buttonsStatus[0][2] != 'b')){
            if(buttonsStatus[0][2] == 'x'){
                System.out.println("Player X win");
            }
            else{
                System.out.println("Player O win");
            }
            disableAllButtons();
        }
        else if ((buttonsStatus[0][0] == buttonsStatus[1][1]) && (buttonsStatus[1][1] == buttonsStatus[2][2]) && (buttonsStatus[0][0] != 'b')){
            if(buttonsStatus[0][0] == 'x'){
                System.out.println("Player X win");
            }
            else{
                System.out.println("Player O win");
            }
            disableAllButtons();
        }
        else if ((buttonsStatus[0][2] == buttonsStatus[1][1]) && (buttonsStatus[1][1] == buttonsStatus[2][0]) && (buttonsStatus[0][2] != 'b')){
            if(buttonsStatus[0][2] == 'x'){
                System.out.println("Player X win");
            }
            else{
                System.out.println("Player O win");
            }
            disableAllButtons();
        }

    }
}
