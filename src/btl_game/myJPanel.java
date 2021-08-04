package btl_game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import static javax.swing.SwingConstants.CENTER;

public class myJPanel extends JPanel{
    
    JPanel north; 
    JPanel mainJpanel; 
    JPanel northJpanel;
    JPanel centerJpanel;
    JPanel southJpanel;
    JLabel english;
    JProgressBar time_game;
    JLabel Diem, score;
    JButton JAnimal, JFlower, JVegetable;
    JButton cA, cB, cC, cD;  
    JLabel cauhoi;
    JButton Play, Stop, Cancel, Back;
    Icon image = new ImageIcon(getClass().getResource("/icon/question.jpg"));        
    
    public myJPanel(myListener mainListener) {
        
        this.setLayout(new BorderLayout());
        
        north = new JPanel();
        north.setLayout(new FlowLayout());
        north.setBackground(new Color(246, 226, 215));
        
        mainJpanel = new JPanel(); 
        mainJpanel.setLayout(new BorderLayout());  
        
        northJpanel = new JPanel();
        northJpanel.setLayout(new GridLayout(2, 1, 0, 0));
        northJpanel.setBackground(new Color(246, 226, 215));
        
        centerJpanel = new JPanel();
        centerJpanel.setLayout(new GridLayout(1, 2, 30, 30));
        centerJpanel.setBackground(new Color(246, 226, 215));
        
        southJpanel = new JPanel();
        southJpanel.setLayout(new GridLayout(3, 1, 10, 10));
        southJpanel.setBackground(new Color(246, 226, 215));
        
        //----north
        JAnimal = new JButton("Animals");
        JAnimal.setBackground(Color.WHITE);
        JAnimal.setFont(new Font("Times New Roman", Font.BOLD, 18));
        
        JFlower = new JButton("Flowers");
        JFlower.setBackground(Color.WHITE);
        JFlower.setFont(new Font("Times New Roman", Font.BOLD, 18));

        JVegetable = new JButton("Vegetables");
        JVegetable.setBackground(Color.WHITE);
        JVegetable.setFont(new Font("Times New Roman", Font.BOLD, 18));
        
        //----mainJpanel
        /*
        *northJpanel
        */
        english = new JLabel("Enghlish");
        english.setFont(new Font("Times New Roman", Font.BOLD, 36));
        english.setHorizontalAlignment(CENTER);
        
        time_game = new JProgressBar();
        
        Diem = new JLabel("Score: ");
        Diem.setFont(new Font("Times New Roman", Font.BOLD, 24));        
        Diem.setHorizontalAlignment(CENTER);
        score = new JLabel("");
        score.setFont(new Font("Times New Roman", Font.BOLD, 24));
        
        /*
        centerJpanel
        */
   
        cA = new JButton("A.");
        cA.setBackground(Color.white);
        cA.setFont(new Font("Times New Roman", Font.BOLD, 18));
        
        cB = new JButton("B.");
        cB.setBackground(Color.white);
        cB.setFont(new Font("Times New Roman", Font.BOLD, 18));
        
        cC = new JButton("C.");
        cC.setBackground(Color.white);
        cC.setFont(new Font("Times New Roman", Font.BOLD, 18));
        
        cD = new JButton("D.");
        cD.setBackground(Color.white);
        cD.setFont(new Font("Times New Roman", Font.BOLD, 18));
        
        cauhoi = new JLabel(image);
        
        //southJpanel
        Play = new JButton("Play");
        Play.setBackground(Color.ORANGE);
        Play.setFont(new Font("Times New Roman", Font.BOLD, 24));
        
        Stop = new JButton("Stop");
        Stop.setBackground(Color.ORANGE);
        Stop.setFont(new Font("Times New Roman", Font.BOLD, 24));
        
        Cancel = new JButton("Cancel");
        Cancel.setBackground(Color.ORANGE);
        Cancel.setFont(new Font("Times New Roman", Font.BOLD, 24));
        
        
        Back = new JButton("Back");
        Back.setBackground(Color.ORANGE);
        Back.setFont(new Font("Times New Roman", Font.BOLD, 24));
        
        //add north
        
        north.add(JAnimal);
        north.add(JFlower);
        north.add(JVegetable);
        
        //-----------------add mainJpanel--------------//
        //-addd northJpanel
        
        JPanel enghL = new JPanel();
        enghL.add(english);
        enghL.setBackground(new Color(246, 226, 215));
        
        JPanel nor_nor = new JPanel();
        nor_nor.setLayout(new GridLayout(1, 2));
        nor_nor.setBackground(new Color(246, 226, 215));
        nor_nor.add(Diem);
        nor_nor.add(score);

        JLabel hn = new JLabel(""); ///tao khoang cach
 
        JPanel tg = new JPanel();
        tg.setLayout(new GridLayout(3, 1, 10, 10));///3 hang 1 cot
        tg.setBackground(new Color(246, 226, 215));
        
        tg.add(time_game);
        tg.add(nor_nor);
        
        //--->
        northJpanel.add(enghL);
        northJpanel.add(tg);        
        ////---------add centerJPanel
        
        JPanel cen_cen = new JPanel();
        cen_cen.setLayout(new FlowLayout());
        cen_cen.add(cauhoi);
        cen_cen.setBackground(new Color(246, 226, 215));
        
        JPanel cen_sou = new JPanel();
        cen_sou.setLayout(new GridLayout(4, 1, 10, 10));
        cen_sou.setBackground(new Color(246, 226, 215));
        cen_sou.add(cA);
        cen_sou.add(cB);
        cen_sou.add(cC);
        cen_sou.add(cD);
        cen_sou.setSize(500, 100);
        
        centerJpanel.add(cen_cen);
        centerJpanel.add(cen_sou);
        
        ///ad southJPanel
        
        JPanel sou_nor = new JPanel();
        sou_nor.setLayout(new FlowLayout());
        sou_nor.setBackground(new Color(246, 226, 215));
        
        JPanel sou_cen = new JPanel();
        sou_cen.setLayout(new FlowLayout());
        sou_cen.setBackground(new Color(246, 226, 215));
                
        sou_nor.add(Play);
        sou_nor.add(Stop);
        sou_nor.add(Back);
        sou_nor.add(Cancel);
        
        sou_cen.add(hn);///tao khoang cach

        southJpanel.add(sou_cen);
        southJpanel.add(sou_nor);
        
        mainJpanel.add(northJpanel, BorderLayout.NORTH);
        mainJpanel.add(centerJpanel, BorderLayout.CENTER);
        mainJpanel.add(southJpanel, BorderLayout.SOUTH);      
       
        this.add(north, BorderLayout.NORTH);
        this.add(mainJpanel, BorderLayout.CENTER);
        
        ///set action
        Play.addActionListener(mainListener);
        Stop.addActionListener(mainListener);
        Back.addActionListener(mainListener);
        Cancel.addActionListener(mainListener);     
        JAnimal.addActionListener(mainListener);
        JFlower.addActionListener(mainListener);
        JVegetable.addActionListener(mainListener);
        cA.addActionListener(mainListener);
        cB.addActionListener(mainListener);
        cC.addActionListener(mainListener);
        cD.addActionListener(mainListener);
        
    }   
}
