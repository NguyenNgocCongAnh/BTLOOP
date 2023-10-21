package GiaoDienCuaSV;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import ThongTinSV.ThongTinSV;
import ThanhToanTienPhong.ThanhToan;


public class GiaoDien extends JFrame{
    private JPanel jp_Background;
    public ThongTinSV ThongTinSV;
    public ThanhToan thanhtoan;
    public String user;
    private JComboBox<String> text_cv;
    private JLabel jl_Name;
    public GiaoDien() throws  MalformedURLException,SQLException{
        this.init();
        this.setVisible(true);
    }
    public void init() throws MalformedURLException, SQLException {
        this.setTitle("Ban Quản Lý");
        ThongTinSV = new ThongTinSV();
        thanhtoan = new ThanhToan();
        this.setSize(1280, 800);
        this.setLocationRelativeTo(null);

        ActionListener ac = new GiaoDienListener(this);

        jp_Background = new JPanel();
        jp_Background.setLayout(null);

        // ----------------- WEST -----------------------

        JPanel jp_west = new JPanel();
        jp_west.setBounds(0, 10, 270, 800);
        jp_west.setLayout(null);

        JLabel jl_logo = new JLabel();
        jl_logo.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(new URL("file:///C:/Users/ASUS/Downloads/logo_phenikaa.fbe85f61.png"))));
        jl_logo.setBounds(0, 0, 280, 800);


        JButton jb_thongtin = new JButton("Thông Tin Cá Nhân");
        jb_thongtin.addActionListener(ac);
        jb_thongtin.setBounds(0, 80, 280, 40);
        jb_thongtin.setBackground(Color.CYAN);
        jb_thongtin.setOpaque(true);
        jb_thongtin.setForeground(Color.BLACK);
        jb_thongtin.setBorder(new LineBorder(Color.RED));

        JButton jb_tienphong = new JButton("Thanh Toán Tiền Phòng");
        jb_tienphong.addActionListener(ac);
        jb_tienphong.setBounds(0,120,280,40);
        jb_tienphong.setBackground(Color.CYAN);
        jb_tienphong.setOpaque(true);
        jb_tienphong.setForeground(Color.BLACK);
        jb_tienphong.setBorder(new LineBorder(Color.RED));

        JButton jb_thanhtoan = new JButton("Phản Hồi");
        jb_thanhtoan.addActionListener(ac);
        jb_thanhtoan.setBounds(0, 160, 280, 40);
        jb_thanhtoan.setBackground(Color.CYAN);
        jb_thanhtoan.setOpaque(true);
        jb_thanhtoan.setForeground(Color.BLACK);
        jb_thanhtoan.setBorder(new LineBorder(Color.RED));

        jp_west.add(jb_thanhtoan);
        jp_west.add(jb_tienphong);
        jp_west.add(jb_thongtin);
        jp_west.add(jl_logo);

        // ------------------------- NORTH CENTER ----------------------

        JPanel jp_north = new JPanel();
        jp_north.setLayout(null);
        jp_north.setBounds(270, 30, 1000, 60);
        jp_north.setBorder(new LineBorder(Color.GRAY));

        JLabel jl_thongtin = new JLabel(" [=] THÔNG TIN CÁ NHÂN");
        jl_thongtin.setBounds(20, 13, 400, 40);
        jl_thongtin.setForeground(Color.blue);
        jl_thongtin.setFont(new Font("Cambria Math", Font.BOLD, 24));

        jl_Name = new JLabel();
        jl_Name.setBounds(500, 13, 250, 40);
        jl_Name.setForeground(Color.blue);
        jl_Name.setFont(new Font("Cambria Math", Font.BOLD, 20));

        String[] s = {"Sinh Viên"};
        text_cv = new JComboBox(s);
        text_cv.setBounds(750, 13, 180, 40);
        text_cv.setFont(new Font("Cambria Math", Font.BOLD, 20));
        text_cv.setBorder(new LineBorder(Color.GRAY));
        text_cv.setEnabled(false);
        text_cv.setEditable(false);

        jp_north.add(text_cv);
        jp_north.add(jl_Name);
        jp_north.add(jl_thongtin);

        // --------------------------- Thoong tin --------------------------------

        jp_Background.add(jp_north);
        jp_Background.add(jp_west);

        setContentPane(jp_Background);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void ThongTinSV() throws MalformedURLException, SQLException{
        this.ThongTinSV.setBounds(270,90,1000,680);
        this.ThongTinSV.ViewThongTinSV();
        this.ThongTinSV.user = this.user;
        jp_Background.add(ThongTinSV);
    }
    public void SVThanhToan(){
        thanhtoan.setBounds(520,180, 500,500);
        jp_Background.add(thanhtoan);
    }
    public void refresh() {
        this.pack();
        this.setSize(1280, 800);
    }
}
