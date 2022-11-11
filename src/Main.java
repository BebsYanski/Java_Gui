import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*Layout Manager = Defines the natural layout for components within a container.
        3 common Managers
        BorderLayout = A BorderLayout places components in five areas:
            NORTH, SOUTH, WEST, EAST
        All extra space is placed in the center area.
         */
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,500);
        frame.getContentPane().setBackground(Color.cyan);
        frame.setLayout(new BorderLayout(10,10));
        frame.setTitle("YANSKI");
        frame.setVisible(true);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.gray);
        panel3.setBackground(Color.YELLOW);
        panel4.setBackground(Color.MAGENTA);
        panel5.setBackground(Color.black);

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));

        //----------------------------------Sub Panels------------------------------
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        panel6.setBackground(Color.blue);
        panel7.setBackground(Color.green);
        panel8.setBackground(Color.lightGray);
        panel9.setBackground(Color.darkGray);
        panel10.setBackground(Color.white);

        panel5.setLayout(new BorderLayout(10,10));

        panel6.setPreferredSize(new Dimension(50,50));
        panel7.setPreferredSize(new Dimension(50,50));
        panel8.setPreferredSize(new Dimension(50,50));
        panel9.setPreferredSize(new Dimension(50,50));
        panel10.setPreferredSize(new Dimension(50,50));

        panel5.add(panel6,BorderLayout.NORTH);
        panel5.add(panel7,BorderLayout.SOUTH);
        panel5.add(panel8,BorderLayout.EAST);
        panel5.add(panel9,BorderLayout.WEST);
        //panel5.add(panel10,BorderLayout.NORTH);

        //----------------------------------Sub Panels------------------------------

        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.WEST);
        frame.add(panel3,BorderLayout.EAST);
        frame.add(panel4,BorderLayout.SOUTH);
        frame.add(panel5,BorderLayout.CENTER);
    }
}