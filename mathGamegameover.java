import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mathGamegameover extends JFrame implements ActionListener{

    JLabel gameoverlabel = new JLabel("GAME OVER");
    //JLabel label = new JLabel("<:::Elementary Math Quize Game:::>");
    JLabel label2 = new JLabel("Time out,");
    JLabel label3 = new JLabel("no more attempts");
    JLabel label4 = new JLabel("NB: you have only 10 attempts");
    JLabel label5 = new JLabel("in all. Give correct answers ");
    JButton exit = new JButton("EXIT");
    JButton restart = new JButton("RESTART");

    Container c = getContentPane();

    public mathGamegameover(){
        setLayout(new FlowLayout());
        add(gameoverlabel);
        add(label2);
        add(label3);
        add(label4);
        add(label5);
        add(restart);
        add(exit);

        gameoverlabel.setFont(new Font("Tahoma", Font.BOLD, 50));
        label2.setFont(new Font("Tahoma", Font.BOLD, 20));
        label3.setFont(new Font("Tahoma", Font.BOLD, 20));
        label4.setFont(new Font("Tahoma", Font.BOLD, 20));
        label5.setFont(new Font("Tahoma", Font.BOLD, 20));
        restart.setFont(new Font("Tahoma", Font.BOLD, 20));
        exit.setFont(new Font("Tahoma", Font.BOLD, 20));
        gameoverlabel.setForeground(Color.RED);
        label2.setForeground(Color.CYAN);
        label3.setForeground(Color.CYAN);
        label4.setForeground(Color.CYAN);
        label5.setForeground(Color.CYAN);
        restart.setBackground(Color.YELLOW);
        exit.setBackground(Color.YELLOW);

        restart.addActionListener(this);
        exit.addActionListener(this);
        
      

        setVisible(true);
        setSize(400,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(600,20);
        setResizable(false);
        setTitle("Math Quize Game");
        setIconImage(new ImageIcon("R.png").getImage());
        c.setBackground(Color.BLACK);

    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==restart){
            new MathGameFirstPage();
            dispose();
        }

        if(e.getSource()==exit){
           System.exit(0);
        }


    }

}
