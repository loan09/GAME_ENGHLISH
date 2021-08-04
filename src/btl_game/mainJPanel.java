
package btl_game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class mainJPanel extends JPanel{
    JPanel northJFrame, centerJframe;
    JLabel topic, topic1, topic2, topic3, topic4;
    Icon img1, img2, img3, img4;
    
    public mainJPanel(){
        
        this.setLayout(new BorderLayout());
        northJFrame = new JPanel();
        northJFrame.setLayout(new FlowLayout());
        northJFrame.setBackground(new Color(243, 232, 216));
        
        centerJframe = new JPanel();
        centerJframe.setLayout(new GridLayout(4, 1));
        centerJframe.setBackground(new Color(243, 232, 216));
        
        ///add north
        topic = new JLabel("Game_English");
        topic.setFont(new Font("Times New Roman", Font.BOLD, 30));
        northJFrame.add(topic);
        
        /// addd centerJF
        
        img1 = new ImageIcon(getClass().getResource("/icon/animal.png"));
        img2 = new ImageIcon(getClass().getResource("/icon/flower.png"));
        img3 = new ImageIcon(getClass().getResource("/icon/vege.png"));
        img4 = new ImageIcon(getClass().getResource("/icon/hs3.jpg"));
        
        topic1 = new JLabel(img1, JLabel.CENTER);
        topic2 = new JLabel(img2, JLabel.CENTER);
        topic3 = new JLabel(img3, JLabel.CENTER);
        topic4 = new JLabel(img4, JLabel.CENTER);
               
        centerJframe.add(topic1);
        centerJframe.add(topic2);
        centerJframe.add(topic3);
        centerJframe.add(topic4);
        
        this.add(northJFrame, BorderLayout.NORTH);
        this.add(centerJframe, BorderLayout.CENTER);
        
        topic1.addMouseListener(new MyMouseListener_animal());
        topic2.addMouseListener(new MyMouseListener_Flower());
        topic3.addMouseListener(new MyMouseListener_Vege());
        
    }
}

class MyMouseListener_animal extends MouseAdapter {
    @Override
    public void mouseClicked(MouseEvent evt) {            
        if (evt.getClickCount() == 1) {
            String t = "Animal";
            int Size = 11;
            JFrameTopic Tp = new JFrameTopic(t, Size);
            Tp.setVisible(true);
        }
    }
}
class MyMouseListener_Flower extends MouseAdapter {
    @Override
    public void mouseClicked(MouseEvent evt) {            
        if (evt.getClickCount() == 1) {
            String t = "Flowers";
            int Size = 14;
            JFrameTopic Tp = new JFrameTopic(t, Size);
            Tp.setVisible(true);
        }
    }
}
class MyMouseListener_Vege extends MouseAdapter {
    @Override
    public void mouseClicked(MouseEvent evt) {            
        if (evt.getClickCount() == 1) {
            String t = "Vegetables";
            int Size = 12;
            JFrameTopic Tp = new JFrameTopic(t, Size);
            Tp.setVisible(true);

        }
    }
}