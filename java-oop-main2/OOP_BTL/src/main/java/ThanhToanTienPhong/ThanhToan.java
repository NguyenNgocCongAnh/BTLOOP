package ThanhToanTienPhong;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class ThanhToan extends JPanel{
    public int phong;
    public String toa;
    public JTextField sodien ;
    public JTextField tiendien ;
    public JTextField sonuoc ;
    public JTextField tiennuoc ;
    public JTextField tongtien ;
    public ThanhToan(){
        setSize(500,500);
        setBorder(new LineBorder(Color.CYAN));
        setLayout(null);

        JLabel jl = new JLabel("Quyết Toán Cuối Tháng");
        jl.setFont(new Font("Arial", Font.BOLD, 30));
        jl.setBounds(50,80,400,60);
        jl.setForeground(Color.RED);
        add(jl);

        JLabel jl_sodien = new JLabel("Số Điện Dùng ");
        jl_sodien.setFont(new Font("Arial", Font.BOLD, 16));
        jl_sodien.setBounds(20,150,200,40);
        add(jl_sodien);

        sodien = new JTextField();
        sodien.setBounds(300,150,100,30);
        sodien.setEditable(false);
        sodien.setFont(new Font("Arial", Font.BOLD, 16));
        add(sodien);

        JLabel jl_tiendien = new JLabel("Tiền Điên (1 số) <Ví dụ: 3.5>");
        jl_tiendien.setFont(new Font("Arial", Font.BOLD, 13));
        jl_tiendien.setBounds(20,200,200,40);
        add(jl_tiendien);

        tiendien = new JTextField();
        tiendien.setBounds(300,200,100,30);
        tiendien.setEditable(false);
        tiendien.setFont(new Font("Arial", Font.BOLD, 16));
        add(tiendien);

        JLabel jl_sonuoc = new JLabel("Số Khối Nước Dùng ");
        jl_sonuoc.setFont(new Font("Arial", Font.BOLD, 16));
        jl_sonuoc.setBounds(20,250,200,40);
        add(jl_sonuoc);

        sonuoc = new JTextField();
        sonuoc.setBounds(300,250,100,30);
        sonuoc.setEditable(false);
        sonuoc.setFont(new Font("Arial", Font.BOLD, 16));
        add(sonuoc);

        JLabel jl_tiennuoc = new JLabel("Tiền Nước (1 khối)  <ví dụ: 2.4>");
        jl_tiennuoc.setFont(new Font("Arial", Font.BOLD, 13));
        jl_tiennuoc.setBounds(20,300,200,40);
        add(jl_tiennuoc);

        tiennuoc = new JTextField();
        tiennuoc.setBounds(300,300,100,30);
        tiennuoc.setEditable(false);
        tiennuoc.setFont(new Font("Arial", Font.BOLD, 16));
        add(tiennuoc);

        JLabel jl_tongtien = new JLabel("Tổng Tiền");
        jl_tongtien.setFont(new Font("Arial", Font.BOLD, 16));
        jl_tongtien.setBounds(20,350,200,40);
        add(jl_tongtien);

        tongtien = new JTextField();
        tongtien.setFont(new Font("Arial", Font.BOLD, 16));
        tongtien.setEditable(false);
        tongtien.setBounds(300,350,150,30);
        add(tongtien);

//        ActionListener ac = new ListenerThanhToan(this);

        JButton jb_thanhtoan = new JButton("Thanh Toán");
        jb_thanhtoan.setBounds(325,400,150,40);
        //jb_thanhtoan.addActionListener(ac);
        add(jb_thanhtoan);

    }
    public void ThanhToan(){
        Double so_nuoc = Double.parseDouble(sodien.getText());
        Double tien_nuoc = Double.parseDouble(tiennuoc.getText());
        Double so_dien = Double.parseDouble(sodien.getText());
        Double tien_dien = Double.parseDouble(tiendien.getText());
        Double tong = so_nuoc * tien_nuoc + so_dien * tien_dien;
        String tong_tien = String.valueOf(tong);
        tongtien.setText(tong_tien);
    }
}
