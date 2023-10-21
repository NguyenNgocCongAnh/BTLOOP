package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import GiaoDienCuaSV.GiaoDien;

public class JPanel_SinhVien extends JPanel {
    public JTextField text_tk;
    public JPasswordField text_mk;
    public JButton jbutton_dangnhap;
    public JButton jbutton_dangky;
    public JPanel_SinhVien(){
        setSize(280,200);
        setLayout(null);

        ActionListener ac = new JPanel_SinhVien_Listener(this);

        JLabel jl_dangnhap = new JLabel("Tên đăng nhập");
        jl_dangnhap.setFont(new Font("Cambria", Font.BOLD,10 ));
        jl_dangnhap.setBounds(0, 19, 120, 11);
        text_tk = new JTextField("");
        text_tk.setFont(new Font("Cambria", Font.BOLD, 14));
        text_tk.setBounds(0, 30, 280, 30);

        JLabel jl_pass = new JLabel("Mật Khẩu");
        jl_pass.setFont(new Font("Cambria", Font.BOLD,10 ));
        jl_pass.setBounds(0, 89, 120, 11);
        text_mk = new JPasswordField(30);
        text_mk.setEchoChar('*');
        text_mk.setFont(new Font("Cambria", Font.BOLD, 14));
        text_mk.setBounds(0, 100, 280, 30);

        jbutton_dangnhap = new JButton("Đăng Nhập");
        jbutton_dangnhap.addActionListener(ac);
        jbutton_dangnhap.setForeground(Color.WHITE);
        jbutton_dangnhap.setBackground(Color.BLUE);
        jbutton_dangnhap.setOpaque(true);
        jbutton_dangnhap.setFont(new Font("Cambria", Font.BOLD, 14));
        jbutton_dangnhap.setBounds(0,140, 280, 30);

        jbutton_dangky = new JButton("Đăng Ký");
        jbutton_dangky.addActionListener(ac);
        jbutton_dangky.setForeground(Color.WHITE);
        jbutton_dangky.setBackground(Color.BLUE);
        jbutton_dangky.setOpaque(true);
        jbutton_dangky.setFont(new Font("Cambria", Font.BOLD, 14));
        jbutton_dangky.setBounds(0,175, 280, 30);

        setOpaque(false);
        add(jl_dangnhap);
        add(jl_pass);
        add(text_tk);
        add(text_mk);
        add(jbutton_dangnhap);
        add(jbutton_dangky);
    }
    public Boolean SVDangNhap() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Connection connection = DriverManager.getConnection("jdbc:mysql://Canh:3306/ktx", "canh", "2422004T@o");
        Statement Eu = connection.createStatement();
        boolean isLogin = false;
        if(text_tk.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Mời Nhập User !!!", "Error!!!!", JOptionPane.ERROR_MESSAGE);
        }
        else if (text_mk.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Mời Nhập PassWord !!!", "Error!!!!", JOptionPane.ERROR_MESSAGE);
        }
        String user = text_tk.getText();
        if (text_tk.getText().length() < 9){
            JOptionPane.showMessageDialog(null, "Error User, User.length() > 10 !!!", "Error!!!!", JOptionPane.ERROR_MESSAGE);
        }
        String pass = text_mk.getText();
        String msv = user.substring(0,8);
        String s ="Select * from DsSV where MSV like '" + msv +"%';" ;
        ResultSet resultSet = Eu.executeQuery(s);
        while (resultSet.next()) {
            String tk = resultSet.getString("User").trim();
            if (user.equals(tk) && pass.equals(resultSet.getString("Password").trim())){
                isLogin = true;
            }
        }
        if (isLogin == false){
            JOptionPane.showMessageDialog(null, "Sai User hoặc Sai PassWord", "Error!!!!", JOptionPane.ERROR_MESSAGE);
        }
        connection.close();
        return isLogin;
    }
}
