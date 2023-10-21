package GiaoDienCuaSV;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.sql.SQLException;

public class GiaoDienListener implements ActionListener{
    private GiaoDien GiaoDien;
    public GiaoDienListener(GiaoDienCuaSV.GiaoDien GiaoDien){
        this.GiaoDien = GiaoDien;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if (src.equals("Thông Tin Cá Nhân")){
            if(this.GiaoDien.thanhtoan.isVisible()){
                this.GiaoDien.thanhtoan.setVisible(false);
                this.GiaoDien.ThongTinSV.setVisible(true);
            }
            try {
                this.GiaoDien.ThongTinSV();
                this.GiaoDien.ThongTinSV();
                this.GiaoDien.refresh();
            } catch (MalformedURLException ex) {
                throw new RuntimeException(ex);
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
        else if(src.equals("Phản Hồi")){

        }
        else if(src.equals("Thanh Toán Tiền Phòng")){
            if(this.GiaoDien.ThongTinSV.isVisible()){
                this.GiaoDien.ThongTinSV.setVisible(false);
                this.GiaoDien.thanhtoan.setVisible(true);
            }
            this.GiaoDien.SVThanhToan();
            this.GiaoDien.refresh();
        }
    }
}
