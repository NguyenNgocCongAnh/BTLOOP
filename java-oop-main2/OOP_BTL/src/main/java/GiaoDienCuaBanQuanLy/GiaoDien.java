package GiaoDienCuaBanQuanLy;

import java.awt.*;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.border.LineBorder;

import ThongTinNguoiQuanLy.ThongTinBQL;
import ThongTinPhong.ViewRoom;
import org.example.JPanel_BanQL_Listener;

public class GiaoDien extends JFrame{
    private JPanel Jp_ground;
    private JLabel jp_Name;
    public ViewRoom viewroom;
    public String user ;
    public String pass;
    public ThongTinBQL ThongtinBQL;
    public GiaoDien() throws MalformedURLException, SQLException{
        this.ThongtinBQL = new ThongTinBQL();
        this.viewroom = new ViewRoom();
        this.init();
        this.setVisible(true);
    }
    public void init() throws MalformedURLException {
        this.setTitle("Ban Quản Lý");
        this.setSize(1280, 800);
        this.setLocationRelativeTo(null);
        Jp_ground = new JPanel();
        Jp_ground.setLayout(null);
        JPanel jp_west = new JPanel();
        jp_west.setBounds(0, 10, 270, 800);
        jp_west.setLayout(null);

        JLabel jl_logo = new JLabel();
        jl_logo.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(new URL("file:///C:/Users/ASUS/Downloads/logo_phenikaa.fbe85f61.png"))));
        jl_logo.setBounds(0, 0, 280, 800);

        ActionListener ac = new GiaoDienListener(this);

        JButton jb_thongtin = new JButton("Thông Tin Cá Nhân");
        jb_thongtin.addActionListener(ac);
        jb_thongtin.setBounds(0, 80, 280, 40);
        jb_thongtin.setBackground(Color.CYAN);
        jb_thongtin.setOpaque(true);
        jb_thongtin.setForeground(Color.BLACK);
        jb_thongtin.setBorder(new LineBorder(Color.RED));

        JButton jb_thongtinphong = new JButton("Thông Tin Phòng");
        jb_thongtinphong.addActionListener(ac);
        jb_thongtinphong.setBounds(0, 120, 280, 40);
        jb_thongtinphong.setBackground(Color.CYAN);
        jb_thongtinphong.setOpaque(true);
        jb_thongtinphong.setForeground(Color.BLACK);
        jb_thongtinphong.setBorder(new LineBorder(Color.RED));

        jp_west.add(jb_thongtinphong);
        jp_west.add(jb_thongtin);
        jp_west.add(jl_logo);

        // ------------------------- NORTH CENTER ----------------------

        JPanel jp_north = new JPanel();
        jp_north.setLayout(null);
        jp_north.setBounds(270, 30, 1000, 60);
        jp_north.setBorder(new LineBorder(Color.GRAY));

        JLabel jl_name = new JLabel(" [=] THÔNG TIN CÁ NHÂN");
        jl_name.setBounds(20, 13, 400, 40);
        jl_name.setForeground(Color.blue);
        jl_name.setFont(new Font("Cambria Math", Font.BOLD, 24));

        JLabel jl = new JLabel("Trần ĐÌNH BUG");
        jl.setBounds(500, 13, 250, 40);
        jl.setForeground(Color.blue);
        jl.setFont(new Font("Cambria Math", Font.BOLD, 20));

        JTextField text_cv = new JTextField(" Hủy Diệt CODER  ▼");
        text_cv.setBounds(750, 13, 180, 40);
        text_cv.setFont(new Font("Cambria Math", Font.BOLD, 20));
        text_cv.setBorder(new LineBorder(Color.GRAY));
        text_cv.setEnabled(false);
        text_cv.setEditable(false);

        jp_north.add(text_cv);
        jp_north.add(jl);
        jp_north.add(jl_name);

        Jp_ground.add(jp_north);
        Jp_ground.add(jp_west);

        setContentPane(Jp_ground);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void ThongTinBanQL() throws MalformedURLException, SQLException {
        this.ThongtinBQL.setBounds(270,90,1000,680);
        this.ThongtinBQL.user = this.user;
        this.ThongtinBQL.pass = this.pass;
        this.ThongtinBQL.ThongTin();
        Jp_ground.add(ThongtinBQL);
    }
    public void ThongTinRooms(){
        this.viewroom.setBounds(270,90,1000,680);
        Jp_ground.add(viewroom);
    }
    public void refresh() {
        this.pack();
        this.setSize(1280, 800);
    }
}
