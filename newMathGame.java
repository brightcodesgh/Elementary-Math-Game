import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class newMathGame extends JFrame implements ActionListener{
    Random random = new Random();
    int digit1;
    int digit2;
    int correct;
    String operator = "";
    final int LIMIT = 10;

    int rightCounter = 0;
    int wrongCounter = 0;
   
    JLabel gameoverlabel = new JLabel();
    JLabel mathlabel = new JLabel("Math Quiz Game");
    JLabel sign = new JLabel("===============================");
    JLabel question = new JLabel();
    JLabel sign2 = new JLabel("===============================");
    JLabel answerlabel = new JLabel("Answer: ");
    JTextField answerfield = new JTextField(11);
    JTextField correctAnswer = new JTextField(5);
    JTextField wrongAnswer = new JTextField(5);
    JTextField responsefield = new JTextField(15);


    JButton multiply = new JButton("x");
    JButton add = new JButton("+");
    JButton subtract = new JButton("-");
    JButton divide = new JButton("/");
    JButton back = new JButton("BACK");
   
   
   


    Container c = getContentPane();
    static int score;

    public newMathGame(){
        //adding components
        setLayout(new FlowLayout());
        add(mathlabel);
        add(sign);
        add(question);
        add(sign2);
        add(answerlabel);
        add(answerfield);
        add(correctAnswer);
        add(multiply);
        add(add);
        add(subtract);
        add(divide);
        add(wrongAnswer);
        add(responsefield);
        add(gameoverlabel);

       

        //formatting components
        mathlabel.setFont(new Font("Tahoma", Font.BOLD, 30));
        sign.setFont(new Font("Tahoma", Font.BOLD, 20));
        question.setFont(new Font("Tahoma", Font.BOLD, 25));
        sign2.setFont(new Font("Tahoma", Font.BOLD, 20));
        answerlabel.setFont(new Font("Tahoma", Font.BOLD, 25));
        answerfield.setFont(new Font("Tahoma", Font.BOLD, 20));
        correctAnswer.setFont(new Font("Tahoma", Font.BOLD, 20));
        multiply.setFont(new Font("Tahoma", Font.BOLD, 25));
        add.setFont(new Font("Tahoma", Font.BOLD, 25));
        subtract.setFont(new Font("Tahoma", Font.BOLD, 25));
        divide.setFont(new Font("Tahoma", Font.BOLD, 25));
        wrongAnswer.setFont(new Font("Tahoma", Font.BOLD, 20));
        responsefield.setFont(new Font("Tahoma", Font.BOLD, 20));
        gameoverlabel.setFont(new Font("Tahoma", Font.BOLD, 20));

        correctAnswer.setEditable(false);
        wrongAnswer.setEditable(false);
        responsefield.setEditable(false);

        responsefield.setHorizontalAlignment(JTextField.CENTER);
        wrongAnswer.setHorizontalAlignment(JTextField.RIGHT);
       

        mathlabel.setForeground(Color.RED);
       sign.setForeground(Color.red);
        sign2.setForeground(Color.red);
        add.setBackground(Color.black);
        add.setForeground(Color.RED);
        multiply.setBackground(Color.black);
        multiply.setForeground(Color.YELLOW);
        subtract.setBackground(Color.black);
        subtract.setForeground(Color.GREEN);
        divide.setBackground(Color.black);
        divide.setForeground(Color.BLUE);
        back.setBackground(Color.YELLOW);
        correctAnswer.setForeground(Color.GREEN);
        wrongAnswer.setForeground(Color.RED);
        gameoverlabel.setForeground(Color.RED);

        //adding Actionlistener

        multiply.addActionListener(this);
        add.addActionListener(this);
        subtract.addActionListener(this);
        divide.addActionListener(this);
        answerfield.addActionListener(this);
        
        



        //setting frame
        setSize(450,450);
        setVisible(true);
        setLocation(600,20);
        setResizable(false);
        setTitle("Math Quiz Game version 2.0");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon("lock.jpg").getImage());
        //c.setBackground(Color.WHITE);
    }

    public void actionPerformed(ActionEvent e){
        

        if(e.getSource()==multiply){
             operator = "x";
            question.setText(setQuestion(operator));
          
        }

        if(e.getSource()==subtract){
             operator = "-";
            question.setText(setQuestion(operator));
          
        }

        if(e.getSource()==add){
            operator = "+";
            question.setText(setQuestion(operator));
          
        }

        if(e.getSource()==divide){
            operator = "/";
            question.setText(setQuestion(operator));
        }


        if(e.getSource()==answerfield){
            int userinput = Integer.parseInt(answerfield.getText());
            if(userinput == correct){
                responsefield.setForeground(Color.green);
                responsefield.setText(getCorrectResponse());
                answerfield.setText("");
                correctAnswer.setText(rightCounter + "");
                question.setText(setQuestion(operator));
            }
            else{
                responsefield.setForeground(Color.red);
                responsefield.setText(getWrongResponse());
                answerfield.setText("");
                wrongAnswer.setText(wrongCounter + "");

            }

            if(wrongCounter==LIMIT){
                gameoverlabel.setText("GAME OVER");
                new mathGamegameover();
               dispose();
            }
          
        }
    }

    public String  getCorrectResponse(){
        String response ="";
        rightCounter++;
        switch(random.nextInt(5)){
            case 0: response = "Good"; break;
            case 1: response = "Correct"; break;
            case 2: response = "Very Good"; break;
            case 3: response = "That's Right"; break;
            case 4: response = "Awesome"; break;
        }
        return response;
    }
    public String  getWrongResponse(){
        String response ="";
        wrongCounter++;
        switch(random.nextInt(5)){
            case 0: response = "Wrong"; break;
            case 1: response = "Sorry, Try again"; break;
            case 2: response = "Incorrect"; break;
            case 3: response = "Don't give up"; break;
            case 4: response = "Try once more"; break;
        }
        return response;
    }

    public int getRandomNumber(){
        return random.nextInt(10);
    }

    public String setQuestion(String operator){
        digit1 = getRandomNumber();
        digit2 = getRandomNumber();

        switch(operator){
            case "x": correct = digit1 * digit2; break;
            case "+": correct = digit1 + digit2; break;
            case "-": correct = digit1 - digit2; break;
            case "/": correct = digit1 / digit2; break;
        }



        return "What is " + digit1 + operator + digit2 + " ?";
    }



   
    

    
}
