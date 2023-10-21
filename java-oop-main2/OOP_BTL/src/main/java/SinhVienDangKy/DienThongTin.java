package SinhVienDangKy;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import Dao.ThongTinSVDao;
import TaoSQL.MySQL;

import static java.sql.DriverManager.registerDriver;

public class DienThongTin extends JFrame {
    private JTextField text_user;
    private JPasswordField text_pass;
    private JTextField text_HoTen;
    private JTextField text_Msv;
    private JComboBox<String> text_sex;
    private JTextField text_phone;
    private JTextField text_Address;
    private JTextField text_date;
    private JTextField text_CCCD;
    private JTextField text_email;
    private JTextField text_tinhtranghoc = new JTextField("Đang học");
    private JTextField text_MaNganh;
    private JTextField text_Lop;
    private JTextField text_ChucVu = new JTextField("Sinh Viên");
    private JComboBox<String> toa;
    private JComboBox<Integer> phong;
    private ThongTinDangKy TTDK;
    private static Connection conn = MySQL.getConnect();
    public DienThongTin() {
        this.TTDK = new ThongTinDangKy();
        this.setTitle("Điền Thông Tin");
        this.init();
        this.setVisible(true);
    }
    public void init(){
        this.setSize(730,700);
        this.setLocationRelativeTo(null);

        Font font = new Font("Cambria", Font.BOLD, 14);

        JLabel jl_user = new JLabel("Tên Đăng Nhập");
        jl_user.setBounds(150, 80, 200,30);
        jl_user.setFont(new Font("Cambria", Font.BOLD, 14));

        text_user = new JTextField();
        text_user.setBounds(150, 110, 200,30);
        text_user.setFont(font);

        JLabel jl_pass = new JLabel("Mật Khẩu");
        jl_pass.setBounds(150, 140, 200,30);
        jl_pass.setFont(new Font("Cambria", Font.BOLD, 14));

        text_pass = new JPasswordField();
        text_pass.setEchoChar('*');
        text_pass.setBounds(150, 170, 200,30);
        text_pass.setFont(font);

        JLabel jl_MSV = new JLabel("Mã Sinh Viên");
        jl_MSV.setBounds(150, 200, 200,30);
        jl_MSV.setFont(new Font("Cambria", Font.BOLD, 14));

        text_Msv = new JTextField();
        text_Msv.setBounds(150, 230, 200,30);
        text_Msv.setFont(font);

        JLabel jl_name = new JLabel("Họ và Tên");
        jl_name.setBounds(150, 260, 200,30);
        jl_name.setFont(new Font("Cambria", Font.BOLD, 14));

        text_HoTen = new JTextField();
        text_HoTen.setBounds(150, 290, 200,30);
        text_HoTen.setFont(font);

        JLabel jl_sex = new JLabel("Giới Tính");
        jl_sex.setBounds(150, 320, 200,30);
        jl_sex.setFont(new Font("Cambria", Font.BOLD, 14));

        String[] s1 = {"Nam", "Nữ"};
        text_sex = new JComboBox(s1);
        text_sex.setBounds(150, 350, 200,30);
        text_sex.setFont(font);

        JLabel jl_phone = new JLabel("Số Điện Thoại");
        jl_phone.setBounds(150, 380, 150,30);
        jl_phone.setFont(new Font("Cambria", Font.BOLD, 14));

        text_phone = new JTextField();
        text_phone.setBounds(150, 410, 200,30);
        text_phone.setFont(font);

        JLabel jl_Address = new JLabel("Địa Chỉ");
        jl_Address.setBounds(150, 440, 200,30);
        jl_Address.setFont(new Font("Cambria", Font.BOLD, 14));

        text_Address = new JTextField();
        text_Address.setBounds(150, 470, 200,30);
        text_Address.setFont(font);

        JLabel jl_date = new JLabel("Ngày Sinh");
        jl_date.setBounds(150, 500, 200,30);
        jl_date.setFont(new Font("Cambria", Font.BOLD, 14));

        text_date = new JTextField();
        text_date.setBounds(150, 530, 200,30);
        text_date.setFont(font);

        JLabel jl_CCCD = new JLabel("Số CCCD");
        jl_CCCD.setBounds(400, 80, 200,30);
        jl_CCCD.setFont(new Font("Cambria", Font.BOLD, 14));

        text_CCCD = new JTextField();
        text_CCCD.setBounds(400, 110, 200,30);
        text_CCCD.setFont(font);

        JLabel jl_email = new JLabel("Email");
        jl_email.setBounds(400, 140, 200,30);
        jl_email.setFont(new Font("Cambria", Font.BOLD, 14));

        text_email = new JTextField();
        text_email.setBounds(400, 170, 200,30);
        text_email.setFont(font);

        JLabel jl_tinhtranghoc = new JLabel("Tình Trạng Học");
        jl_tinhtranghoc.setBounds(400, 200, 200,30);
        jl_tinhtranghoc.setFont(new Font("Cambria", Font.BOLD, 14));

        text_tinhtranghoc.setBounds(400, 230, 200,30);
        text_tinhtranghoc.setFont(font);
        text_tinhtranghoc.setEditable(false);

        JLabel jl_Nganh = new JLabel("Ngành");
        jl_Nganh.setBounds(400, 260, 200,30);
        jl_Nganh.setFont(new Font("Cambria", Font.BOLD, 14));

        text_MaNganh = new JTextField();
        text_MaNganh.setBounds(400, 290, 200,30);
        text_MaNganh.setFont(font);

        JLabel jl_lop = new JLabel("Lớp");
        jl_lop.setBounds(400, 320, 200,30);
        jl_lop.setFont(new Font("Cambria", Font.BOLD, 14));

        text_Lop = new JTextField();
        text_Lop.setBounds(400, 350, 200,30);
        text_Lop.setFont(font);

        JLabel jl_chucvu = new JLabel("Chức Vụ");
        jl_chucvu.setBounds(400, 380, 200,30);
        jl_chucvu.setFont(new Font("Cambria", Font.BOLD, 14));

        text_ChucVu.setBounds(400, 410, 200,30);
        text_ChucVu.setFont(font);
        text_ChucVu.setEditable(false);

        String[] s2 = {"C1","C2","B1","B2"};
        JLabel jl_toa = new JLabel("Tòa");
        jl_toa.setBounds(400, 440, 200,30);
        jl_toa.setFont(new Font("Cambria", Font.BOLD, 14));

        toa = new JComboBox(s2);
        toa.setBounds(400, 470, 200,30);
        toa.setFont(font);

        JLabel jl_Phong = new JLabel("Phòng");
        jl_Phong.setBounds(400, 500, 200,30);
        jl_Phong.setFont(new Font("Cambria", Font.BOLD, 14));

        Integer[] rooms = {101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,301,302,303,304,305,306,307,308,309,310,311,312,313,314,315,316,317,318,319,320,321,401,402,403,404,405,406,407,408,409,410,411,412,413,414,415,416,417,418,419,420,421};
        phong = new JComboBox(rooms);
        phong.setBounds(400,530,200,30);
        phong.setFont(font);

        JLabel jl_Background = new JLabel();
        //jl_Background.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(new URL("file:///C:/Users/ASUS/OneDrive/Pictures/b2a7d3db28201609b24da20e93340f72.jpg"))));
        jl_Background.setBackground(Color.GRAY);
        jl_Background.setOpaque(true);
        jl_Background.setBounds(0,0,730, 700);

        this.add(jl_user);
        this.add(jl_pass);
        this.add(jl_MSV);
        this.add(jl_name);
        this.add(jl_sex);
        this.add(jl_phone);
        this.add(jl_Address);
        this.add(jl_date);
        this.add(jl_CCCD);
        this.add(jl_email);
        this.add(jl_tinhtranghoc);
        this.add(jl_Nganh);
        this.add(jl_lop);
        this.add(jl_chucvu);
        this.add(jl_toa);
        this.add(jl_Phong);

        this.add(text_user);
        this.add(text_pass);
        this.add(text_Msv);
        this.add(text_HoTen);
        this.add(text_sex);
        this.add(text_phone);
        this.add(text_Address);
        this.add(text_date);
        this.add(text_CCCD);
        this.add(text_email);
        this.add(text_tinhtranghoc);
        this.add(text_MaNganh);
        this.add(text_Lop);
        this.add(text_ChucVu);
        this.add(toa);
        this.add(phong);

        JLabel jl_tieude = new JLabel("Điền Thông Tin Sinh Viên", SwingConstants.CENTER);
        jl_tieude.setFont(new Font("Arial", Font.BOLD, 24));
        jl_tieude.setBounds(180,30,400,50);

        ActionListener ac = new DienThongTinListener(this);

        JButton jbutton_save = new JButton("Lưu Thông Tin");
        jbutton_save.addActionListener(ac);
        jbutton_save.setBorder(new LineBorder(Color.RED));
        jbutton_save.setBounds(450,600,150,30);

        this.setLayout(null);
        this.add(jl_tieude);
        this.add(jbutton_save);
        this.add(jl_Background);
    }

    public boolean update() throws SQLException {
        try {
            if (text_user.getText().substring(8).equals("@st.phenikaa-uni.edu.vn")) {
                this.TTDK.setUser(text_user.getText());
            } else {
                JOptionPane.showMessageDialog(rootPane, "Mời nhập Email Nội Bộ");
            }
            if (text_pass.getText() != null) {
                this.TTDK.setPassWord(text_pass.getText());
            } else {
                JOptionPane.showMessageDialog(rootPane, "Mời Nhập Mật Khẩu");
            }
            if (text_Msv.getText() != null) {
                this.TTDK.setMSV(text_Msv.getText());
            } else {
                JOptionPane.showMessageDialog(rootPane, "Mời Nhập Mã Sinh Viên");
            }
            if (text_HoTen.getText() != null) {
                this.TTDK.setName(text_HoTen.getText());
            } else {
                JOptionPane.showMessageDialog(rootPane, "Mời Nhập Họ Tên");
            }

            this.TTDK.setSex(text_sex.getItemAt(text_sex.getSelectedIndex()));

            if (text_phone.getText() != null ) {
                this.TTDK.setPhone(text_phone.getText());
            } else {
                JOptionPane.showMessageDialog(rootPane, "Số Điện Thoại phải có 10 số và bắt đầu từ 0");
            }
            if (text_Address.getText() != null) {
                this.TTDK.setAddress(text_Address.getText());
            } else {
                JOptionPane.showMessageDialog(rootPane, "Mời Nhập Tên Tỉnh");
            }
            if (text_date.getText() != null) {
                this.TTDK.setDate(text_date.getText());
            } else {
                JOptionPane.showMessageDialog(rootPane, "Mời Nhập Ngày Sinh");
            }

            if (text_CCCD.getText() != null) {
                this.TTDK.setCCCD(text_CCCD.getText());
            } else {
                JOptionPane.showMessageDialog(rootPane, "Mời Nhập Số Căn Cước Công Dân");
            }

            if (text_email.getText() != null) {
                this.TTDK.setEmail(text_email.getText());
            } else {
                JOptionPane.showMessageDialog(rootPane, "Mời Nhập Email");
            }
            this.TTDK.setTinhTrang(text_tinhtranghoc.getText());

            if (text_MaNganh.getText() != null) {
                this.TTDK.setMaNganh(text_MaNganh.getText());
            } else {
                JOptionPane.showMessageDialog(rootPane, "Mời Nhập Mã Ngành");
            }
            if (text_Lop.getText() != null) {
                this.TTDK.setLop(text_Lop.getText());
            } else {
                JOptionPane.showMessageDialog(rootPane, "Mời Nhập Lớp");
            }
            this.TTDK.setChucvu(text_ChucVu.getText());
            this.TTDK.setToa(toa.getItemAt(toa.getSelectedIndex()));
            this.TTDK.setSoPhong(phong.getItemAt(phong.getSelectedIndex()));
            ThongTinDangKy tt = new ThongTinDangKy(this.TTDK.getUser(),this.TTDK.getPassword(),this.TTDK.getMSV(),this.TTDK.getName(),this.TTDK.getSex(),this.TTDK.getPhone(),this.TTDK.getAddress(),this.TTDK.getDate(),this.TTDK.getCCCD(),this.TTDK.getEmail(),this.TTDK.getTinhTrang(),this.TTDK.getMaNganh(),this.TTDK.getLop(),this.TTDK.getChucvu(),this.TTDK.getSoPhong(),this.TTDK.getToa());
            return ThongTinSVDao.addSV(tt);
        } catch (Exception ex) {
            Logger.getLogger(DienThongTin.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (text_Lop.getText().isEmpty() || text_MaNganh.getText().isEmpty() || text_email.getText().isEmpty() || text_CCCD.getText().isEmpty() ||  text_date.getText().isEmpty() || text_Address.getText().isEmpty() || text_phone.getText().isEmpty() || text_Msv.getText().isEmpty() || text_HoTen.getText().isEmpty() || text_pass.getText().isEmpty() || text_user.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Nhập Thiếu Thông Tin !!!");
        }
        return false;
    }
}
