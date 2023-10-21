package org.example;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPasswordField;
public class TrangChu extends JFrame{
    public JPanel_SinhVien sv;
    public  JPanel_BanQL bql;
    public JComboBox vai_tro;
    public TrangChu() throws SQLException, MalformedURLException{
        this.sv = new JPanel_SinhVien();
        this.bql = new JPanel_BanQL();
        this.init();
        this.setVisible(true);
    }
    public void init() throws MalformedURLException,SQLException {
        this.setTitle("PHENIKAA UNIVERSITY - Hiện Thực Hóa Tiềm Năng");
        this.setSize(1280,800);
        this.setLocationRelativeTo(null);
        JPanel jp_ground = new JPanel();
        jp_ground.setLayout(null);

        JLabel jl_text = new JLabel("Hệ Thống Quản Lý Kí Túc Xá");
        jl_text.setFont(new Font("Cambria", Font.BOLD,20 ));
        jl_text.setForeground(Color.BLUE);
        jl_text.setBounds(100, 130, 280, 30);

        JLabel jl_chon = new JLabel("Chọn vai trò");
        jl_chon.setFont(new Font("Cambria", Font.BOLD,10 ));
        jl_chon.setBounds(100, 160, 120, 11);

        JLabel jl_nen = new JLabel();
        jl_nen.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(new URL("file:///C:/Users/ASUS/OneDrive/Pictures/5eb67f4650782bf2ebac4f99458fa9d4.jpg"))));
        jl_nen.setBounds(0,0,480,620);

        JPanel jpanel_luachon = new JPanel();
        jpanel_luachon.setBounds(765, 150, 480,620);

        ActionListener ac = new TrangChuListener(this);

        //jpanel_luachon.setSize(480,620);
        jpanel_luachon.setLayout(null);
        String[] lua_chon =new String[]{"Tôi là Sinh Viên", "Tôi là Quản Lí KTX"};
        vai_tro  = new JComboBox(lua_chon);
        vai_tro.addActionListener(ac);
        vai_tro.setFont(new Font("Arial", Font.BOLD, 16));
        vai_tro.setBounds(100, 170, 280,30);

        sv.setBounds(100,200, 280, 200);

        bql.setBounds(100,200, 280, 215);
        bql.setVisible(false);

        JLabel PDT = new JLabel("",SwingConstants.CENTER);
        PDT.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(new URL("file:///C:/Users/ASUS/Downloads/Screenshot%202023-10-13%20143951.png"))));
        PDT.setBounds(190,440,100,50);
        PDT.setBackground(null);

        JTextArea text_1 = new JTextArea("Copyright © 2023. Developed by PDT Digital Transformation JSC");
        text_1.setFont(new Font("Cambria", Font.BOLD,12));
        text_1.setLineWrap(true);
        text_1.setEditable(false);
        text_1.setFocusable(false);
        text_1.setForeground(Color.WHITE);
        text_1.setBackground((Color.BLACK));
        text_1.setBounds(60, 500, 360, 30);

        JTextArea text_2 = new JTextArea("Phòng Công tác sinh viên - Địa chỉ: Tầng 1, Toà nhà A10, Trường Đại học Phenikaa, Nguyễn Trác, Hà Đông, Hà Nội");
        text_2.setFont(new Font("Cambria", Font.BOLD,12));
        text_2.setLineWrap(true);
        text_2.setEditable(false);
        text_2.setFocusable(false);
        text_2.setForeground(Color.WHITE);
        text_2.setBackground((Color.BLACK));
        text_2.setBounds(60, 530, 360, 30);

        JLabel j = new JLabel();
        j.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(new URL("file:///C:/Users/ASUS/Downloads/logo_phenikaa.fbe85f61%20(1).png"))));
        j.setBounds(90,30,300,120);

        jpanel_luachon.add(j);
        jpanel_luachon.add(text_1);
        jpanel_luachon.add(text_2);
        jpanel_luachon.add(PDT);
        jpanel_luachon.add(sv);
        jpanel_luachon.add(bql);
        jpanel_luachon.add(jl_chon);
        jpanel_luachon.add(jl_text);
        jpanel_luachon.add(vai_tro);
        jpanel_luachon.add(jl_nen);

        // ------------------- RIGHT GROUND ------------------

        JPanel rightground = new JPanel();
        rightground.setLayout(null);
        rightground.setBounds(10,10,940, 910);
        //jpanel_luachon.setBounds(750, 80, 480,620);

        JLabel jl_right = new JLabel();
        jl_right.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(new URL("file:///C:/Users/ASUS/Downloads/Screenshot%202023-10-13%20172759.png"))));
        jl_right.setBounds(0,0,740,800 );

        JLabel jl_right1 = new JLabel("HỆ THỐNG QUẢN LÝ KÝ TÚC XÁ");
        jl_right1.setForeground(Color.WHITE);
        jl_right1.setFont(new Font("Cambria", Font.BOLD, 36));
        jl_right1.setBounds(180,130,680,60);

        JLabel jl_right2 = new JLabel("TRƯỜNG ĐẠI HỌC PHENIKAA");
        jl_right2.setForeground(Color.WHITE);
        jl_right2.setFont(new Font("Cambria", Font.BOLD, 30));
        jl_right2.setBounds(280,190,680,60);

        JLabel jK= new JLabel();
        jK.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(new URL("file:///C:/Users/ASUS/Downloads/logo_phenikaa.fbe85f61%20(1).png"))));
        jK.setBounds(400,10,300,120);

        rightground.add(jK);
        rightground.add(jl_right2);
        rightground.add(jl_right1);
        rightground.add(jl_right);


        // -------------------- NORTH ----------------------
        JPanel jp_north = new JPanel();
        jp_north.setLayout(null);
        jp_north.setBounds(750,10,530,150);

        JLabel jl_QL = new JLabel();
        jl_QL.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(new URL("file:///C:/Users/ASUS/Downloads/Untitled.jpg"))));
        jl_QL.setBounds(0,0,530,150);

        JLabel jl_kt = new JLabel("KÝ TÚC XÁ");
        jl_kt.setFont(new Font("Cambria Math", Font.BOLD, 39));
        jl_kt.setForeground(Color.BLUE);
        jl_kt.setBounds(290,45, 200,70);

        jp_north.add(jl_kt);
        jp_north.add(jl_QL);

        jp_ground.add(jp_north);
        jp_ground.add(jpanel_luachon);
        jp_ground.add(rightground);

        setContentPane(jp_ground);
//        this.setLayout(new BorderLayout());
//        this.add(jp_ground,BorderLayout.CENTER);

        Image img =Toolkit.getDefaultToolkit().createImage(new URL("file:///C:/Users/ASUS/OneDrive/Pictures/456c2f0820a11b62b6e94f158b740853.jpg"));
        this.setIconImage(img);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void refresh() {
        this.pack();
        this.setSize(1280, 800);
    }
}
