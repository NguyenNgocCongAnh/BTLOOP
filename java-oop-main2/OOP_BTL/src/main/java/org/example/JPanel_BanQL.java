package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.*;

public class JPanel_BanQL extends JPanel {
    public JTextField text_tk;
    public JPasswordField text_mk;
    public JButton jbutton_dangnhap;
    public JPanel_BanQL(){
        setSize(280,215);
        setLayout(null);

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

        ActionListener ac = new JPanel_BanQL_Listener(this);

        jbutton_dangnhap = new JButton("Đăng Nhập");
        jbutton_dangnhap.addActionListener(ac);
        jbutton_dangnhap.setForeground(Color.WHITE);
        jbutton_dangnhap.setBackground(Color.BLUE);
        jbutton_dangnhap.setOpaque(true);
        jbutton_dangnhap.setFont(new Font("Cambria", Font.BOLD, 14));
        jbutton_dangnhap.setBounds(0,150, 280, 30);

        setOpaque(false);
        add(jl_dangnhap);
        add(jl_pass);
        add(text_tk);
        add(text_mk);
        add(jbutton_dangnhap);
    }
    public Boolean BanQLDangNhap() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Connection connection = DriverManager.getConnection("jdbc:mysql://Canh:3306/ktx", "canh", "2422004T@o");
        Statement Eu = connection.createStatement();
        Eu.execute("use ktx");
        boolean is = false;
        String user = text_tk.getText();
        String pass = text_mk.getText();
        String s ="Select * from DsQL where user like '" + user +"%'  AND pass like '"+ pass +"%';";
        ResultSet resultSet = Eu.executeQuery(s);
        while(resultSet.next()){
            String tk = resultSet.getString("user").trim();
            if(user.equals(tk) && pass.equals(resultSet.getString("pass").trim())){
                is = true;
            }
        }
        if(text_tk.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Mời Nhập User !!!", "Error!!!!", JOptionPane.ERROR_MESSAGE);
        }
        else if (text_mk.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Mời Nhập PassWord !!!", "Error!!!!", JOptionPane.ERROR_MESSAGE);
        }
        else if (is == false) {
            JOptionPane.showMessageDialog(null, "Sai User hoặc Sai PassWord", "Error!!!!", JOptionPane.ERROR_MESSAGE);
        }
        return is;
    }
}
