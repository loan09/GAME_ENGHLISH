
package btl_game;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Frame extends JFrame{
    mainJPanel MainJpanel  = new mainJPanel();
    ImageIcon logo = new ImageIcon(getClass().getClassLoader().getResource("icon/gau.jpg"));
    myJMenuBar mainmenu;
    
    public Frame(){
        super();
        this.setResizable(false);
        this.setSize(550, 660);
        this.setTitle("Game_English");
        this.setLocationRelativeTo(null); //set giao dien game nam giua man hinh
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setIconImage(logo.getImage());
        
        this.setContentPane(MainJpanel);      
        mainmenu = new myJMenuBar();
        this.setJMenuBar(mainmenu);
    }
}
