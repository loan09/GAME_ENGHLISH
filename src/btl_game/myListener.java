
package btl_game;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class myListener  implements ActionListener{
    mainJFrame main;
    
    ReadData re = new ReadData();
    WriteData wr = new WriteData();
    
    public int thoigian, diem = 0, img, checkcauhoi = -1, qA=-1, qB=-1, qC=-1, qD=-1, n1;
    public Timer time;
    boolean gameover = false;
    String x;
    
    int level;
    String[] name = {" Shark", " Dog", " Mouse", " Chickens ", " Monkey ", "Pig", " Cat", " Zebra", " Hedgehog ", " Rabbit ", " Elephant"};
    String[] Flower = {" Flower marbles", " Lotus", " Apricot flowers", " Rose ", " Orchid", " Sun Flower", " Lilies", " Phoenix Flower", " Peach blossom", " Violet", " Virgin flowers", " Forget-me-not", " Lily of the valley", " Poppy"};
    String[] Vegetable = {" Tomato", " Carrot", " Onion", " Cucumber", " Cauliflower", " Eggplant", " Bell pepper", " Cabbage", " Red pumpkin", " Potato", " Soybean", " Kohlrabi"};

    int x1 = name.length, x2 = Flower.length, x3 = Vegetable.length;
        
    public myListener(mainJFrame main){
        this.main = main;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand() == "Play"){
            try {
                diem = re.readd();
                gameover = false;
                load();          
                thoigian = 100;
                time = new Timer(50, new loadTime());
                time.start();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(main, "Mời bạn chọn chủ đề!");
            }
        }
        if(e.getActionCommand() == "Back"){
            if(qA != -1 && qA != -2){
                time.stop();
                JOptionPane.showMessageDialog(main, "Bạn sẽ bị mất hết điểm ở Level này!");
                Frame main = new Frame();       
                main.setVisible(true); 

            }else{
                Frame main = new Frame();       
                main.setVisible(true); 
            }
        }
        if(e.getActionCommand()=="Stop"){
            if(thoigian>0){
                time.stop();
            }
            else{
                JOptionPane.showMessageDialog(main, "Mời bạn chọn chủ đề!");
            }
        }
        if(e.getActionCommand()=="Cancel"){
            System.exit(0);
        }
        if(e.getActionCommand()=="Animals"){
            JOptionPane.showMessageDialog(main, "Bạn vừa chọn chủ đề: Animals!");            
            main.mainJpanel.JAnimal.setBackground(Color.red);
            main.mainJpanel.JFlower.setBackground(Color.white);
            main.mainJpanel.JVegetable.setBackground(Color.white);
            qA = qB = qC = qD = -2;
            n1 = x1;
        }
        if(e.getActionCommand()=="Flowers"){
            JOptionPane.showMessageDialog(main, "Bạn vừa chọn chủ đề: Flowers!");            
            main.mainJpanel.JFlower.setBackground(Color.red);
            main.mainJpanel.JAnimal.setBackground(Color.white);
            main.mainJpanel.JVegetable.setBackground(Color.white);
            qA = qB = qC = qD = -2; ///de kiem tra khi da chon chu de rồi nhưng chưa nhấn nút play để chơi, mà đã chọn đáp án rồi
            n1 = x2;
        }
        if(e.getActionCommand()=="Vegetables"){
            JOptionPane.showMessageDialog(main, "Bạn vừa chọn chủ đề: Vegetables!");            
            main.mainJpanel.JVegetable.setBackground(Color.red);
            main.mainJpanel.JAnimal.setBackground(Color.white);
            main.mainJpanel.JFlower.setBackground(Color.white);
            qA = qB = qC = qD = -2;
            n1 = x3;
        }
        if(e.getActionCommand().contains("A.") == true){
            if(qA == -1){
                JOptionPane.showMessageDialog(main, "Bạn chưa chọn chủ đề!");
            }else if(qA == -2){
                JOptionPane.showMessageDialog(main, "Nhấn nút Play để bắt đầu chơi game!");
            }else{
                checkcauhoi = qA;
                check();
            }
        }
        if(e.getActionCommand().contains("B.") == true){
            if(qB == -1){
                JOptionPane.showMessageDialog(main, "Bạn chưa chọn chủ đề!");
            }else if(qB == -2){
                JOptionPane.showMessageDialog(main, "Nhấn nút Play để bắt đầu chơi game!");
            }else{
                checkcauhoi = qB;
                check();
            }
        }
        if(e.getActionCommand().contains("C.") == true){
            if(qC == -1){
                JOptionPane.showMessageDialog(main, "Bạn chưa chọn chủ đề!");
            }else if(qC == -2){
                JOptionPane.showMessageDialog(main, "Nhấn nút Play để bắt đầu chơi game!");
            }else{
                checkcauhoi = qC;
                check();
            }
        }
        if(e.getActionCommand().contains("D.") == true){
            if(qD == -1){
                JOptionPane.showMessageDialog(main, "Bạn chưa chọn chủ đề!");
            }else if(qD == -2){
                JOptionPane.showMessageDialog(main, "Nhấn nút Play để bắt đầu chơi game!");
            }else{
                checkcauhoi = qD;
                check();
            }
        }
    }
    
    public void load(){
        main.mainJpanel.score.setText(diem + "");
        Random ran = new Random();
        img = ran.nextInt(n1);
        Icon image = null;
        if(n1 == x1){
            image = new ImageIcon(getClass().getResource("/icon/" + img + ".jpg"));
        }
        if(n1 == x2){
            image = new ImageIcon(getClass().getResource("/flower/" + img + ".jpg"));
        }
        if(n1 == x3){
            image = new ImageIcon(getClass().getResource("/Vegetable/" + img + ".jpg"));
        }
        main.mainJpanel.cauhoi.setIcon(image);
        
        qA = ran.nextInt(n1);
        qB = ran.nextInt(n1);
        if(qB == qA){
            qB = ran.nextInt(n1);
        }
        qC = ran.nextInt(n1);
        if(qC==qA || qC == qB)
        {
            qC = ran.nextInt(n1);
        }
        if(qA == img || qB == img || qC == img){
            qD = ran.nextInt(n1);
        }
        if(qD==qA || qD == qB || qD == qC){
            qD = ran.nextInt(n1);
        }
        if(qA != img && qB != img && qC != img){
            qD = img;
        }

        if(n1 == x1){
            main.mainJpanel.cA.setText("A." + name[qA]);
            main.mainJpanel.cB.setText("B." + name[qB]);
            main.mainJpanel.cC.setText("C." + name[qC]);
            main.mainJpanel.cD.setText("D." + name[qD]);
        }
        if(n1 == x2){
            main.mainJpanel.cA.setText("A." + Flower[qA]);
            main.mainJpanel.cB.setText("B." + Flower[qB]);
            main.mainJpanel.cC.setText("C." + Flower[qC]);
            main.mainJpanel.cD.setText("D." + Flower[qD]);
        }
        if(n1 == x3){
            main.mainJpanel.cA.setText("A." + Vegetable[qA]);
            main.mainJpanel.cB.setText("B." + Vegetable[qB]);
            main.mainJpanel.cC.setText("C." + Vegetable[qC]);
            main.mainJpanel.cD.setText("D." + Vegetable[qD]);
        }
    }
    
    public void check(){
        if(!gameover){
            if(img == checkcauhoi){
                diem += 10;
                load();
                thoigian = 100;
                time.start();

            }else{
                diem -= 5;
                load();
                thoigian = 100;
                time.start();

            }
            if(diem == 0 || diem < 0){
                Icon image = new ImageIcon(getClass().getResource("/icon/over4.jpg"));                
                main.mainJpanel.cauhoi.setIcon(image);
                diem = 0;
                main.mainJpanel.score.setText(diem + "");
                main.mainJpanel.cA.setText("A.");
                main.mainJpanel.cB.setText("B.");
                main.mainJpanel.cC.setText("C.");
                main.mainJpanel.cD.setText("D.");
                gameover = true; ////
                
                x = String.valueOf(diem);        
                try {
                    wr.write(x);
                } catch (IOException ex) {
                    Logger.getLogger(myJPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(diem % 100 == 0 || diem % 100 == 5){
                level = diem/100;
                time.stop();
                JOptionPane.showMessageDialog(main, "Chiến Thắng Level " + (level) +"!!!!");
                JOptionPane.showMessageDialog(main, "Level: " + (++level) +"!!!!");
                time.stop();
                
                mainJFrame newGame = new mainJFrame();
                newGame.setVisible(true);

                x = String.valueOf(diem);        
                try {
                    wr.write(x);
                } catch (IOException ex) {
                    Logger.getLogger(mainJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(main, "Mời bạn chọn chủ đề khác hoặc nhấn nút Play để tiếp tục chơi game!");
        }
    }

    public class loadTime implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(thoigian > 0){
                thoigian--;
                main.mainJpanel.time_game.setValue(thoigian);
            }else{
                Icon image = new ImageIcon(getClass().getResource("/icon/over4.jpg"));                
                main.mainJpanel.cauhoi.setIcon(image);
                try {
                    diem = re.readd();
                } catch (IOException ex) {
                    Logger.getLogger(myListener.class.getName()).log(Level.SEVERE, null, ex);
                }
                main.mainJpanel.score.setText(diem + "");
                main.mainJpanel.cA.setText("A.");
                main.mainJpanel.cB.setText("B.");
                main.mainJpanel.cC.setText("C.");
                main.mainJpanel.cD.setText("D.");
                gameover = true;

            }
        }
    }
}
