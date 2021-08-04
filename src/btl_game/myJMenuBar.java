
package btl_game;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class myJMenuBar extends JMenuBar implements ActionListener{
    public myJMenuBar(){
        this.setBackground(new Color(243, 242, 197));
        JMenu ToMnu = new JMenu("Topic");
        JMenu PrMnu = new JMenu("Practice");
        JMenu heMnu = new JMenu("Help");
        JMenu exMnu = new JMenu("Exit");
        
        JMenuItem AnMnu = new JMenuItem("Animal");
        JMenuItem FlMnu = new JMenuItem("Flower");
        JMenuItem VeMnu = new JMenuItem("Vegetables");
        
        JMenuItem StMnu = new JMenuItem("Start_Game");
        
        JMenuItem HeMnu = new JMenuItem("Tutorial");
        
        JMenuItem ExMnu = new JMenuItem("Exit");
         //////////////
        ToMnu.add(AnMnu);
        ToMnu.add(FlMnu);
        ToMnu.add(VeMnu);
        
        PrMnu.add(StMnu);
        
        heMnu.add(HeMnu);
        
        exMnu.add(ExMnu);
        
        this.add(ToMnu);
        this.add(PrMnu);
        this.add(heMnu);
        this.add(exMnu);
        
        ToMnu.addActionListener(this);
        StMnu.addActionListener(this);
        HeMnu.addActionListener(this);
        ExMnu.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand() == "Tutorial"){
            JOptionPane.showMessageDialog(this, "Hướng dẫn:"
                    + "\n1. Nếu bạn muốn học từ mới thì chọn một trong ba biểu tượng phía dưới."
                    + "\n Mỗi biểu tượng sẽ đại diện cho một chủ đề."
                    + "\n -Animal\n -Flower \n-Vegetable."
                    + "\n2. Để chơi game bạn cần nhấn và nút 'Practice' --> 'Start_Game'"
                    + "\n3. Để xem tên các chủ đề bạn nhấn vào nút 'Topic'."
                    + "\n4. Để thoát ứng dụng bạn nhấn nút 'Exit' --> 'Exit'");
        }
        if(e.getActionCommand() == "Start_Game"){
            mainJFrame main = new mainJFrame();       
            main.setVisible(true); 
        }
        if(e.getActionCommand()=="Exit"){
            System.exit(0);
        }
    }
}

