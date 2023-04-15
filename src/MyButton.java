import javax.swing.*;

public class MyButton extends JButton {

    ImageIcon xIcon = new ImageIcon("xIcon.png");
    ImageIcon oIcon = new ImageIcon("oIcon.png");
    ImageIcon blankIcon = new ImageIcon("blankIcon.png");

    char status;

    MyButton(java.awt.event.ActionListener object){

        this.setIcon(blankIcon);
        this.addActionListener(object);
        status = 'b';
    }

    public void setXIcon(){
        this.setDisabledIcon(xIcon);
        this.setEnabled(false);
        status = 'x';
    }
    public void setOIcon(){
        this.setDisabledIcon(oIcon);
        this.setEnabled(false);
        status = 'o';
    }

    public char getStatus(){
        return status;
    }


}
