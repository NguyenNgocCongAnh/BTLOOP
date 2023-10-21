package org.example;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.MalformedURLException;
import java.sql.SQLException;

import SinhVienDangKy.DienThongTin;
import GiaoDienCuaSV.GiaoDien;


public class JPanel_SinhVien_Listener implements ActionListener {
    private JPanel_SinhVien jp_sv;
    private GiaoDien GiaoDien;
    private DienThongTin dk;
    public JPanel_SinhVien_Listener(JPanel_SinhVien jp_sv){
        this.jp_sv = jp_sv;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if (src.equals("Đăng Nhập")){
            boolean is = false;
            try {
                if(this.jp_sv.SVDangNhap()){
                    GiaoDien = new GiaoDien();
                    if(GiaoDien.isVisible()){
                        GiaoDien.user = this.jp_sv.text_tk.getText();
                        this.jp_sv.jbutton_dangnhap.setEnabled(false);
                        this.jp_sv.jbutton_dangky.setEnabled(false);
                    }
                        GiaoDien.addWindowListener(new WindowAdapter() {
                            @Override
                            public void windowClosed(WindowEvent e) {
                                    GiaoDien.dispose();
                                    jp_sv.jbutton_dangnhap.setEnabled(true);
                                    jp_sv.jbutton_dangky.setEnabled(true);
                            }
                        });
                }
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            } catch (MalformedURLException ex) {
                throw new RuntimeException(ex);
            }
        }
        else if(src.equals("Đăng Ký")){
            dk = new DienThongTin();
        }
    }
}
