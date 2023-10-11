import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello World");
         
        //System.out.println("~~~~~");
        //System.out.println("Red vs. Blue"); 
        //System.out.println("~~~~~");

        Main window = new Main();


    }

    class Canvas extends JPanel{
        public Canvas(){

        setPreferredSize(new Dimension(720, 720));

        }

    }

    private Main(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);
       

    }


}