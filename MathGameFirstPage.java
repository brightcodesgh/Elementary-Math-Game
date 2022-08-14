import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MathGameFirstPage extends JFrame implements ActionListener{
    JLabel label = new JLabel("<:::Elementary Math Quiz Game:::>");
    JLabel label2 = new JLabel("Know your addition,");
    JLabel label3 = new JLabel("subtraction");
    JLabel label4 = new JLabel("multiplication");
    JLabel label5 = new JLabel("and division");
    JButton play = new JButton("PLAY");

    Container c = getContentPane();

    public MathGameFirstPage(){
        //Layout and adding components
        setLayout(new FlowLayout());
        add(label);
        add(label2);
        add(label3);
        add(label4);
        add(label5);
        add(play);
      


        //components formatting
        label.setFont(new Font("Tahoma", Font.BOLD, 20));
        label2.setFont(new Font("Tahoma", Font.BOLD, 20));
        label3.setFont(new Font("Tahoma", Font.BOLD, 20));
        label4.setFont(new Font("Tahoma", Font.BOLD, 20));
        label5.setFont(new Font("Tahoma", Font.BOLD, 20));
        play.setFont(new Font("Tahoma", Font.BOLD, 40));
        play.setBackground(Color.yellow);
        label.setForeground(Color.CYAN);
        label2.setForeground(Color.CYAN);
        label3.setForeground(Color.CYAN);
        label4.setForeground(Color.CYAN);
        label5.setForeground(Color.CYAN);

       
    
        //adding Action listener to the play button
        play.addActionListener(this);


        //Frame Settings
        setVisible(true);
        setSize(400,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(600,20);
        setResizable(false);
        setTitle("Math Quiz Game");
        setIconImage(new ImageIcon("R.png").getImage());
        c.setBackground(Color.BLACK);


    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==play){
            new newMathGame();
            dispose();
        }

    }


    public static void main(String[]args){
        new MathGameFirstPage();

    } 
    
}
