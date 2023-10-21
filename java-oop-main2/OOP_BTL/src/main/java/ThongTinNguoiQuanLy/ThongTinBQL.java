package ThongTinNguoiQuanLy;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.net.*;
import java.awt.*;
import java.sql.*;

public class ThongTinBQL extends JPanel{
    private JLabel name;
    private JLabel date;
    private JLabel sex;
    private JLabel chuc_vu;
    private JLabel Tinh;
    private JLabel Quan;
    private JLabel xa;
    private JLabel email;
    private JLabel sdt;
    private JLabel CCCD;
    public JTextField jt_name;
    public JTextField jt_date;
    public JTextField jt_sex;
    public JTextField jt_chuc_vu;
    public JTextField jt_Tinh;
    public JTextField jt_Quan;
    public JTextField jt_xa;
    public JTextField jt_email;
    public JTextField jt_sdt;
    public JTextField jt_CCCD;
    public String user;
    public String pass;

    public ThongTinBQL() throws MalformedURLException, SQLException{
        setSize(1000,680);
        setLayout(null);
        this.init();
    }
    public void init() throws MalformedURLException, SQLException {
        ActionListener ac = new BQLListener(this);
        JButton jb_luu = new JButton("Save");
        jb_luu.setBounds(800, 400, 150, 40);
        jb_luu.setForeground(Color.CYAN);
        jb_luu.setBackground(Color.red);
        jb_luu.setOpaque(true);
        jb_luu.setBorder(new LineBorder(Color.BLUE));
        jb_luu.addActionListener(ac);
        add(jb_luu);

        JButton jb_tuychinh = new JButton("Tùy Chỉnh");
        jb_tuychinh.setBounds(800, 40, 100, 40);
        jb_tuychinh.setForeground(Color.CYAN);
        jb_tuychinh.setBackground(Color.GRAY);
        jb_tuychinh.setOpaque(true);
        jb_tuychinh.setBorder(new LineBorder(Color.BLUE));
        jb_tuychinh.addActionListener(ac);
        add(jb_tuychinh);
        // ------- Image ------
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

        // ------- Thông Tin Cơ Bản -----------

        JPanel basic = new JPanel();
        basic.setLayout(null);
        basic.setBounds(250, 30, 750, 550);

        JLabel thtin = new JLabel("THÔNG TIN CƠ BẢN");
        thtin.setBounds(0, 0, 270, 40);
        thtin.setFont(new Font("Cambria", Font.BOLD, 24));
        thtin.setForeground(Color.ORANGE);

        basic.add(thtin);

        JPanel intro = new JPanel();
        intro.setLayout(null);
        intro.setBounds(250, 70, 720, 480);
        Font font = new Font("Arial", Font.CENTER_BASELINE, 13);

        name = new JLabel("Họ và Tên");
        name.setFont(font);
        name.setBounds(0, 0, 200, 30);
        intro.add(name);

        jt_name = new JTextField("");
        // jl_name.setBorder()
        jt_name.setFont(font);
        jt_name.setEditable(false);
        jt_name.setBounds(0, 30, 200, 30);
        intro.add(jt_name);

        date = new JLabel("Ngày Sinh");
        date.setFont(font);
        date.setBounds(0, 60, 200, 30);
        intro.add(date);

        jt_date = new JTextField("");
        // jl_name.setBorder()
        jt_date.setFont(font);
        jt_date.setEditable(false);
        jt_date.setBounds(0, 90, 200, 30);
        intro.add(jt_date);

        sex = new JLabel("Giới Tính");
        sex.setFont(font);
        sex.setBounds(0, 120, 200, 30);
        intro.add(sex);

        jt_sex = new JTextField("");
        // jl_name.setBorder()
        jt_sex.setFont(font);
        jt_sex.setEditable(false);
        jt_sex.setBounds(0, 150, 200, 30);
        intro.add(jt_sex);

        chuc_vu = new JLabel("Chức Vụ");
        chuc_vu.setFont(font);
        chuc_vu.setBounds(0, 180, 200, 30);
        intro.add(chuc_vu);

        jt_chuc_vu = new JTextField("");
        // jl_name.setBorder()
        jt_chuc_vu.setEditable(false);
        jt_chuc_vu.setFont(font);
        jt_chuc_vu.setBounds(0, 210, 200, 30);
        intro.add(jt_chuc_vu);

        email = new JLabel("Email");
        email.setFont(font);
        email.setBounds(0, 240, 200, 30);
        intro.add(email);

        jt_email = new JTextField("");
        // jl_name.setBorder()
        jt_email.setFont(font);
        jt_email.setEditable(false);
        jt_email.setBounds(0, 270, 200, 30);
        intro.add(jt_email);

        Tinh = new JLabel("Tỉnh / Thành Phố");
        Tinh.setFont(font);

        Tinh.setBounds(400, 0, 200, 30);
        intro.add(Tinh);

        jt_Tinh = new JTextField("");
        // jl_name.setBorder()
        jt_Tinh.setFont(font);
        jt_Tinh.setEditable(false);
        jt_Tinh.setBounds(400, 30, 200, 30);
        intro.add(jt_Tinh);

        Quan = new JLabel("Quận/ Huyện");
        Quan.setFont(font);
        Quan.setBounds(400, 60, 200, 30);
        intro.add(Quan);

        jt_Quan = new JTextField("");
        // jl_name.setBorder()
        jt_Quan.setEditable(false);
        jt_Quan.setFont(font);
        jt_Quan.setBounds(400, 90, 200, 30);
        intro.add(jt_Quan);

        xa = new JLabel("Xã/ Phường");
        xa.setFont(font);
        xa.setBounds(400, 120, 200, 30);
        intro.add(xa);

        jt_xa = new JTextField("");
        // jl_name.setBorder()
        jt_xa.setFont(font);
        jt_xa.setEditable(false);
        jt_xa.setBounds(400, 150, 200, 30);
        intro.add(jt_xa);

        sdt = new JLabel("Số Điện Thoại");
        sdt.setFont(font);
        sdt.setBounds(400, 180, 200, 30);
        intro.add(sdt);

        jt_sdt = new JTextField("");
        // jl_name.setBorder()
        jt_sdt.setFont(font);
        jt_sdt.setEditable(false);
        jt_sdt.setBounds(400, 210, 200, 30);
        intro.add(jt_sdt);

        CCCD = new JLabel("Số Căn Cước Công Dân:");
        CCCD.setFont(font);
        CCCD.setBounds(400, 240, 200, 30);
        intro.add(CCCD);

        jt_CCCD = new JTextField("");
        // jl_name.setBorder()
        jt_CCCD.setFont(font);
        jt_CCCD.setEditable(false);
        jt_CCCD.setBounds(400, 270, 200, 30);
        intro.add(jt_CCCD);

        this.ThongTin();

        add(intro);
        add(jp_picture);
        add(basic);
    }
    public void saveData() throws SQLException {

//        String s ="Select * from DsQL where user like '" + user +"%'  AND pass like '"+ pass +"%';";
        this.jt_name.setEditable(false);
        this.jt_date.setEditable(false);
        this.jt_sex.setEditable(false);
        this.jt_chuc_vu.setEditable(false);
        this.jt_Tinh.setEditable(false);
        this.jt_Quan.setEditable(false);
        this.jt_xa.setEditable(false);
        this.jt_email.setEditable(false);
        this.jt_sdt.setEditable(false);
        this.jt_CCCD.setEditable(false);
//        Eu.execute("Update DsQL SET Name = '" + jt_name.getText() + "', SEX = '" +jt_sex.getText()+"', Phone = '" +jt_sdt.getText()+"', Tinh = '"+jt_Tinh.getText()+"' , Quan = '"+ jt_Quan.getText()+"' , Xa ='"+jt_xa.getText()+"' , date = '"+ jt_date.getText()+"' , chucvu = '"+jt_chuc_vu.getText()+"', CCCD = '"+jt_CCCD.getText()+"', Email = '"+jt_email.getText()+"'\n" +
//                "where user = '"+this.user+"' and pass = '"+this.pass+"'; ");
    }

    public void Tuychinh() {
        this.jt_name.setEditable(true);
        this.jt_date.setEditable(true);
        this.jt_sex.setEditable(true);
        this.jt_chuc_vu.setEditable(true);
        this.jt_Tinh.setEditable(true);
        this.jt_Quan.setEditable(true);
        this.jt_xa.setEditable(true);
        this.jt_email.setEditable(true);
        this.jt_sdt.setEditable(true);
        this.jt_CCCD.setEditable(true);
    }
    public void ThongTin() throws SQLException{
        Connection connection = DriverManager.getConnection("jdbc:mysql://Canh:3306/ktx", "canh", "2422004T@o");
        Statement Eu = connection.createStatement();
        Eu.execute("use ktx");
        String s ="Select * from DsQL where user like '" + user +"%'  AND pass like '"+ pass +"%';";
        ResultSet resultSet = Eu.executeQuery(s);
        while (resultSet.next()){
            this.jt_name.setText(resultSet.getString("Name"));
            this.jt_date.setText(resultSet.getString("date"));
            this.jt_sex.setText(resultSet.getString("SEX"));
            this.jt_chuc_vu.setText(resultSet.getString("chucvu"));
            this.jt_Tinh.setText(resultSet.getString("Tinh"));
            this.jt_Quan.setText(resultSet.getString("Quan"));
            this.jt_xa.setText(resultSet.getString("Xa"));
            this.jt_email.setText(resultSet.getString("Email"));
            this.jt_sdt.setText(resultSet.getString("Phone"));
            this.jt_CCCD.setText(resultSet.getString("CCCD"));
        }

    }
}
