package ThongTinSV;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.*;

public class ThongTinSV extends JPanel {
    public String user;
    private JTextField text_HoTen;
    private JTextField text_Msv;
    private JTextField text_sex;
    private JTextField text_phone;
    private JTextField text_Address;
    private JTextField text_date;
    private JTextField text_CCCD;
    private JTextField text_email;
    private JTextField text_tinhtranghoc = new JTextField("Đang học");
    private JTextField text_MaNganh;
    private JTextField text_Lop;
    private JTextField text_ChucVu = new JTextField("Sinh Viên");
    private JTextField toa;
    private JTextField phong;
    public ThongTinSV() throws MalformedURLException, SQLException {
        setSize(1000, 680);
        setLayout(null);
        JPanel jp_picture = new JPanel();
        jp_picture.setLayout(null);
        jp_picture.setBounds(50, 30, 184, 241);
        jp_picture.setBorder(new LineBorder(Color.BLACK));

        JLabel jl_picture = new JLabel();
        jl_picture.setBounds(3, 3, 181, 238);
        //        ImageIcon img = new ImageIcon(Toolkit.getDefaultToolkit().createImage())));
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage(new URL("file:///C:/Users/ASUS/OneDrive/Pictures/519151909781c232129e6441a2d96904.jpg"));
        Image scaledImage = image.getScaledInstance(178, 178, Image.SCALE_SMOOTH);
        ImageIcon img = new ImageIcon(scaledImage);
        jl_picture.setIcon(img);
        jp_picture.add(jl_picture);

        add(jp_picture);

        // ActionListener ac = new SinhVienListener(this);

        // --------------------------------------------------------

        JLabel jl_MSV = new JLabel("Mã Sinh Viên");
        jl_MSV.setBounds(300, 80, 200, 30);
        jl_MSV.setFont(new Font("Cambria", Font.BOLD, 14));

        Font font = new Font("Cambria", Font.BOLD, 14);

        text_Msv = new JTextField();
        text_Msv.setEditable(false);
        text_Msv.setEnabled(false);
        text_Msv.setBounds(300, 110, 200, 30);
        text_Msv.setFont(font);

        JLabel jl_name = new JLabel("Họ và Tên");
        jl_name.setBounds(300, 140, 200, 30);
        jl_name.setFont(new Font("Cambria", Font.BOLD, 14));

        text_HoTen = new JTextField();
        text_HoTen.setEditable(false);
        text_HoTen.setEnabled(false);
        text_HoTen.setBounds(300, 170, 200, 30);
        text_HoTen.setFont(font);

        JLabel jl_sex = new JLabel("Giới Tính");
        jl_sex.setBounds(300, 200, 200, 30);
        jl_sex.setFont(new Font("Cambria", Font.BOLD, 14));

        text_sex = new JTextField();
        text_sex.setEditable(false);
        text_sex.setEnabled(false);
        text_sex.setBounds(300, 230, 200, 30);
        text_sex.setFont(font);

        JLabel jl_phone = new JLabel("Số Điện Thoại");
        jl_phone.setBounds(300, 260, 150, 30);
        jl_phone.setFont(new Font("Cambria", Font.BOLD, 14));

        text_phone = new JTextField();
        text_phone.setEditable(false);
        text_phone.setEnabled(false);
        text_phone.setBounds(300, 290, 200, 30);
        text_phone.setFont(font);

        JLabel jl_Address = new JLabel("Địa Chỉ");
        jl_Address.setBounds(300, 320, 200, 30);
        jl_Address.setFont(new Font("Cambria", Font.BOLD, 14));

        text_Address = new JTextField();
        text_Address.setEditable(false);
        text_Address.setEnabled(false);
        text_Address.setBounds(300, 350, 200, 30);
        text_Address.setFont(font);

        JLabel jl_date = new JLabel("Ngày Sinh");
        jl_date.setBounds(300, 380, 200, 30);
        jl_date.setFont(new Font("Cambria", Font.BOLD, 14));

        text_date = new JTextField();
        text_date.setEditable(false);
        text_date.setEnabled(false);
        text_date.setBounds(300, 410, 200, 30);
        text_date.setFont(font);

        JLabel jl_CCCD = new JLabel("Số CCCD");
        jl_CCCD.setBounds(300, 440, 200, 30);
        jl_CCCD.setFont(new Font("Cambria", Font.BOLD, 14));

        text_CCCD = new JTextField();
        text_CCCD.setEditable(false);
        text_CCCD.setEnabled(false);
        text_CCCD.setBounds(300, 470, 200, 30);
        text_CCCD.setFont(font);

        JLabel jl_email = new JLabel("Email");
        jl_email.setBounds(700, 80, 200, 30);
        jl_email.setFont(new Font("Cambria", Font.BOLD, 14));

        text_email = new JTextField();
        text_email.setEditable(false);
        text_email.setEnabled(false);
        text_email.setBounds(680, 110, 250, 30);
        text_email.setFont(font);

        JLabel jl_tinhtranghoc = new JLabel("Tình Trạng Học");
        jl_tinhtranghoc.setBounds(680, 140, 250, 30);
        jl_tinhtranghoc.setFont(new Font("Cambria", Font.BOLD, 14));

        text_tinhtranghoc.setBounds(680, 170, 250, 30);
        text_tinhtranghoc.setEditable(false);
        text_tinhtranghoc.setEnabled(false);
        text_tinhtranghoc.setFont(font);
        text_tinhtranghoc.setEditable(false);

        JLabel jl_Nganh = new JLabel("Ngành");
        jl_Nganh.setBounds(680, 200, 250, 30);
        jl_Nganh.setFont(new Font("Cambria", Font.BOLD, 14));

        text_MaNganh = new JTextField();
        text_MaNganh.setEditable(false);
        text_MaNganh.setEnabled(false);
        text_MaNganh.setBounds(680, 230, 250, 30);
        text_MaNganh.setFont(font);

        JLabel jl_lop = new JLabel("Lớp");
        jl_lop.setBounds(680, 260, 250, 30);
        jl_lop.setFont(new Font("Cambria", Font.BOLD, 14));

        text_Lop = new JTextField();
        text_Lop.setEditable(false);
        text_Lop.setEnabled(false);
        text_Lop.setBounds(680, 290, 250, 30);
        text_Lop.setFont(font);

        JLabel jl_chucvu = new JLabel("Chức Vụ");
        jl_chucvu.setBounds(680, 320, 250, 30);
        jl_chucvu.setFont(new Font("Cambria", Font.BOLD, 14));

        text_ChucVu.setBounds(680, 350, 250, 30);
        text_ChucVu.setEditable(false);
        text_ChucVu.setEnabled(false);
        text_ChucVu.setFont(font);
        text_ChucVu.setEditable(false);

        String[] s2 = {"C1", "C2", "B1", "B2"};
        JLabel jl_toa = new JLabel("Tòa");
        jl_toa.setBounds(680, 380, 250, 30);
        jl_toa.setFont(new Font("Cambria", Font.BOLD, 14));

        toa = new JTextField();
        toa.setEditable(false);
        toa.setEnabled(false);
        toa.setBounds(680, 410, 250, 30);
        toa.setFont(font);

        JLabel jl_Phong = new JLabel("Phòng");
        jl_Phong.setBounds(680, 440, 250, 30);
        jl_Phong.setFont(new Font("Cambria", Font.BOLD, 14));

        phong = new JTextField();
        phong.setEditable(false);
        phong.setEnabled(false);
        phong.setBounds(680, 470, 250, 30);
        phong.setFont(font);

        JLabel jl_Background = new JLabel();
        //jl_Background.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(new URL("file:///C:/Users/ASUS/OneDrive/Pictures/b2a7d3db28201609b24da20e93340f72.jpg"))));
        jl_Background.setBackground(Color.GRAY);
        jl_Background.setOpaque(true);
        jl_Background.setBounds(0, 0, 1000, 800);

        add(jl_MSV);
        add(jl_name);
        add(jl_sex);
        add(jl_phone);
        add(jl_Address);
        add(jl_date);
        add(jl_CCCD);
        add(jl_email);
        add(jl_tinhtranghoc);
        add(jl_Nganh);
        add(jl_lop);
        add(jl_chucvu);
        add(jl_toa);
        add(jl_Phong);

        this.ViewThongTinSV();

        add(text_Msv);
        add(text_HoTen);
        add(text_sex);
        add(text_phone);
        add(text_Address);
        add(text_date);
        add(text_CCCD);
        add(text_email);
        add(text_tinhtranghoc);
        add(text_MaNganh);
        add(text_Lop);
        add(text_ChucVu);
        add(toa);
        add(phong);

        JLabel jl_tieude = new JLabel("Điền Thông Tin Sinh Viên", SwingConstants.CENTER);
        jl_tieude.setFont(new Font("Arial", Font.BOLD, 24));
        jl_tieude.setBounds(240, 30, 400, 50);

        JButton jbutton_save = new JButton("Lưu Thông Tin");
        //jbutton_save.addActionListener(ac);
        jbutton_save.setBorder(new LineBorder(Color.RED));
        jbutton_save.setBounds(750, 550, 150, 30);

        add(jl_tieude);
        add(jbutton_save);
        add(jl_Background);
    }
    public void ViewThongTinSV() throws SQLException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Connection connection = DriverManager.getConnection("jdbc:mysql://Canh:3306/ktx", "canh", "2422004T@o");
        Statement Eu = connection.createStatement();
        Eu.execute("use ktx");
        String s = "SELECT * FROM  DsSV Where User like '"+user+"%'";
        ResultSet resultSet = Eu.executeQuery(s);
        while(resultSet.next()){
            String msv = resultSet.getString("MSV");
            this.text_Msv.setText(msv);
            this.text_HoTen.setText(resultSet.getString("Name"));
            this.text_sex.setText(resultSet.getString("SEX"));
            this.text_phone.setText(resultSet.getString("Phone"));
            this.text_Address.setText(resultSet.getString("Address"));
            this.text_date.setText(resultSet.getString("date"));
            this.text_CCCD.setText(resultSet.getString("CCCD"));
            this.text_email.setText(resultSet.getString("Email"));
            this.text_tinhtranghoc.setText(resultSet.getString("TinhTrang"));
            this.text_MaNganh.setText(resultSet.getString("MaNganh"));
            this.text_Lop.setText(resultSet.getString("Lop"));
            this.phong.setText(String.valueOf(resultSet.getInt("sophong")));
            this.toa.setText(resultSet.getString("matoa"));
        }
    }
}
