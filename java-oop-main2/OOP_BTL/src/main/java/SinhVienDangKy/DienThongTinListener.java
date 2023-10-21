package SinhVienDangKy;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class DienThongTinListener implements ActionListener {
    private DienThongTin dk;
    public DienThongTinListener(DienThongTin dk){
        this.dk = dk;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if ( src.equals("Lưu Thông Tin")){
            try {
                if(!dk.update()){
                    JOptionPane.showMessageDialog(null, "Đăng Ký Khong Thành Công !!!", "Error!!!!", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    dk.dispose();
                }
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
