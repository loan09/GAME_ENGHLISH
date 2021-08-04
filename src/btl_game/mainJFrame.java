
package btl_game;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class mainJFrame extends JFrame{    
    
    myListener mainListener = new myListener(this);
    myJPanel mainJpanel  = new myJPanel(mainListener);
    ImageIcon logo = new ImageIcon(getClass().getClassLoader().getResource("icon/gau.jpg"));
    
    public mainJFrame(){
        super();
        this.setResizable(false);
        this.setSize(550, 660);
        this.setTitle("Game_English");
        this.setLocationRelativeTo(null); //set giao dien game nam giua man hinh
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setIconImage(logo.getImage());
        
        this.setContentPane(mainJpanel);       
    }   
}
