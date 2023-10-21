package ThongTinPhong;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.*;

public class ViewRoom extends JPanel {
    private JTextArea text_room;
    public ViewRoom() throws SQLException{
        setSize(1000,680);
        setLayout(null);
        this.viewR();
    }
    public void viewR() {
        text_room = new JTextArea(100,100);
        text_room.setFont(new Font("Cambria",Font.BOLD, 16));
        text_room.setEditable(false);
        JScrollPane JsText = new JScrollPane(text_room);
        JsText.setBounds(30,30,880,440);

        ActionListener ac = new RoomListener(this);
        JButton view = new JButton("Hiện Thị Thông Tin");
        view.setBounds(800, 480, 150, 40);
        view.addActionListener(ac);

        JLabel jl_hoadon = new JLabel("Hóa Đơn");
        jl_hoadon.

        add(view);
        add(JsText);
    }
    public void HienThi() throws SQLException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Connection connection = DriverManager.getConnection("jdbc:mysql://Canh:3306/ktx", "canh", "2422004T@o");
        Statement Eu = connection.createStatement();
        Eu.execute("use ktx");
        String s = "SELECT * FROM  DsSV";
        ResultSet resultSet = Eu.executeQuery(s);
        String str = "";
        while (resultSet.next()) {
            str += resultSet.getString("MSV") + "| "
                    + resultSet.getString("Name") + "|  "
                    + resultSet.getString("SEX") + "|  "
                    + resultSet.getString("Phone") + "|  "
                    + resultSet.getString("Address") + "|  "
                    + resultSet.getString("date") + "|  "
                    + resultSet.getString("CCCD") + "|  "
                    + resultSet.getString("Email") + "|  "
                    + resultSet.getString("TinhTrang") + "|  "
                    + resultSet.getString("MaNganh") + "|  "
                    + resultSet.getInt("sophong") + "|  "
                    + resultSet.getString("matoa") + "|\n";
        }
        this.text_room.setText(str);
    }
}
