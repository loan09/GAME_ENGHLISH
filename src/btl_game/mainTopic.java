
package btl_game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class mainTopic extends JPanel implements ActionListener{
    
    String[] name = {"<html> Shark(n): Cá Mập </html>", "<html> Dog(n): Con chó</html>", "<html> Mouse(n): Con chuột </html>", "<html> Chickens(n): Con gà </html>", "<html> Monkey(n):<BR> Con khỉ</html>", "<html> Pig(n): Con lợn </html>", "<html> Cat(n): Con mèo </html>", "<html> Zebra(n):<BR>Ngựa Vằn </html>", "<html> Hedgehog(n):<BR>Con Nhím </html>", "<html> Rabbit(n):<BR> Con Thỏ</html>", "<html> Elephant(n):<BR> Con Voi</html>"};
    String[] Flower = {"<html>Flower marbles(n):<BR>Hoa Bi</html>", "<html> Lotus(n):<BR> Hoa sen </html>", "<html> Apricot flowers(n):<BR> Hoa Mai</html>", "<html> Rose(n):<BR>Hoa Hồng </html>", "<html> Orchid(n):<BR> Hoa Phong Lan </html>", "<html> Sun Flower(n):<BR>Hoa Hướng Dương </html>", "<html> Lilies(n):<BR> Hoa Loa Kèn </html>", "<html> Phoenix Flower(n):<BR>Hoa Phượng </html>", "<html> Peach blossom(n):<BR>Hoa Đào </html>", "<html> Violet(n):<BR>Hoa Violet </html>", "<html> Virgin flowers(n):<BR>Hoa Trinh Nữ </html>", "<html> Forget-me-not(n):<BR>Hoa Lưu Ly </html>", "<html> Lily of the valley(n):<BR>Hoa Linh Lan </html>", "<html> Poppy(n):<BR>Hoa Anh Túc </html>"};
    String[] Vegetable = {"<html> Tomato(n): Cà chưa </html>", "<html> Carrot(n): Cà rốt </html>", "<html> Onion(n): Củ hành </html>", "<html> Cucumber(n):<BR>Quả Dưa Chuột </html>", "<html> Cauliflower(n):<BR>Súp Lơ Trắng </html>", "<html> Eggplant(n):<BR>Quả Cà Tím </html>", "<html> Bell pepper(n):<BR> Ớt Chuông</html>", "<html> Cabbage(n):<BR>Cải Bắp </html>", "<html> Red pumpkin(n):<BR>Bí Đỏ </html>", "<html> Potato(n):<BR>Khoai Tây </html>", "<html> Soybean(n):<BR>Đậu Nành </html>", "<html> Kohlrabi(n):<BR>Củ Su Hào </html>"};

    JPanel north_Tp, center_Tp, southTp;
    JLabel Topic_name, Topic_img, Topic_Volu;
    JButton back, next, back2;
    Icon ani, img_T;
    int i=0, tg, size_top;
    int x1 = name.length, x2 = Flower.length, x3 = Vegetable.length;
    
    
    public mainTopic(String text, int size_Topic){
        this.setLayout(new BorderLayout());
        
        size_top = size_Topic; ///để lấy giá trị size_Topic ra ngoài.
        
        north_Tp = new JPanel();
        north_Tp.setLayout(new FlowLayout());
        north_Tp.setBackground(new Color(243, 232, 216));
        
        center_Tp = new JPanel();
        center_Tp.setLayout(new GridLayout(2, 1));
        center_Tp.setBackground(new Color(243, 232, 216));
        
        southTp = new JPanel();
        southTp.setLayout(new GridLayout(3, 1));
        southTp.setBackground(new Color(243, 232, 216));
        
        Topic_name = new JLabel(text, JLabel.CENTER);
        Topic_name.setFont(new Font("Times New Roman", Font.BOLD, 30));
        
        int i = 0;
       
        if(size_Topic == x1){
            img_T = new ImageIcon(getClass().getResource("/icon/" + i + ".jpg"));
            ani = new ImageIcon(getClass().getResource("/icon/animal.png"));
            Topic_img = new JLabel(img_T);
            Topic_Volu = new JLabel(name[i], JLabel.CENTER);
            Topic_Volu.setFont(new Font("Times New Roman", Font.BOLD, 24));
        }
        if(size_Topic == x2){
            img_T = new ImageIcon(getClass().getResource("/flower/" + i + ".jpg"));
            ani = new ImageIcon(getClass().getResource("/icon/flower.png"));
            Topic_img = new JLabel(img_T);
            Topic_Volu = new JLabel(Flower[i], JLabel.CENTER);
            Topic_Volu.setFont(new Font("Times New Roman", Font.BOLD, 24));
        }
        if(size_Topic == x3){
            img_T = new ImageIcon(getClass().getResource("/Vegetable/" + i + ".jpg"));
            ani = new ImageIcon(getClass().getResource("/icon/vege.png"));
            Topic_img = new JLabel(img_T);
            Topic_Volu = new JLabel(Vegetable[i], JLabel.CENTER);
            Topic_Volu.setFont(new Font("Times New Roman", Font.BOLD, 24));
        }
        
        back = new JButton("<<:");
        next = new JButton(":>>");
        back2 = new JButton("Back");
        
        //////////////addd north
        
        north_Tp.add(Topic_name);
        
        ///////add centrer
        JLabel logo = new JLabel(ani);
              
        JPanel img_volu = new JPanel();
        img_volu.setLayout(new GridLayout(1, 2));
        img_volu.setBackground(new Color(243, 232, 216));
        img_volu.add(Topic_img);
        img_volu.add(Topic_Volu);
        
        center_Tp.add(logo);
        center_Tp.add(img_volu);
        
        ///add south
        JLabel tg = new JLabel("");
        
        JPanel bne = new JPanel();
        bne.setLayout(new FlowLayout());
        bne.setBackground(new Color(243, 232, 216));
        bne.add(back);
        bne.add(next);
        bne.add(back2);
        
        southTp.add(tg);
        southTp.add(bne);        
        
        this.add(north_Tp, BorderLayout.NORTH);
        this.add(center_Tp, BorderLayout.CENTER);
        this.add(southTp, BorderLayout.SOUTH);
        
        back.addActionListener(this);
        next.addActionListener(this);
        back2.addActionListener(this);
     
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand()== "<<:" && i==0){
            Frame Back = new Frame();
            Back.setVisible(true);
        }
        if(e.getActionCommand()== "<<:" && i>0){
            --i;
            tg = i;
            if(size_top==x1){
                Icon img_T = new ImageIcon(getClass().getResource("/icon/" + (tg) + ".jpg"));
                Topic_img.setIcon(img_T);
                Topic_Volu.setText(name[tg]);
            }
            if(size_top==x2){
                Icon img_T = new ImageIcon(getClass().getResource("/flower/" + (tg) + ".jpg"));
                Topic_img.setIcon(img_T);
                Topic_Volu.setText(Flower[tg]);
            }
            if(size_top==x3){
                Icon img_T = new ImageIcon(getClass().getResource("/Vegetable/" + (tg) + ".jpg"));
                Topic_img.setIcon(img_T);
                Topic_Volu.setText(Vegetable[tg]);
            }
        }
        if(e.getActionCommand()== ":>>" && i<size_top-1){
            ++i;
            tg = i;
            if(size_top==x1){
                Icon img_T = new ImageIcon(getClass().getResource("/icon/" + (tg) + ".jpg"));
                Topic_img.setIcon(img_T);
                Topic_Volu.setText(name[tg]);
            }
            if(size_top==x2){
                Icon img_T = new ImageIcon(getClass().getResource("/flower/" + (tg) + ".jpg"));
                Topic_img.setIcon(img_T);
                Topic_Volu.setText(Flower[tg]);
            }
            if(size_top==x3){
                Icon img_T = new ImageIcon(getClass().getResource("/Vegetable/" + (tg) + ".jpg"));
                Topic_img.setIcon(img_T);
                Topic_Volu.setText(Vegetable[tg]);
            }
        }
        if(e.getActionCommand() == "Back"){
            Frame newJF = new Frame();
            newJF.setVisible(true);
        }
        
    }
}
