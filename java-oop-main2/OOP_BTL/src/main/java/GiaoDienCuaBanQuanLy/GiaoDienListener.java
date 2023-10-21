package GiaoDienCuaBanQuanLy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.sql.SQLException;

public class GiaoDienListener implements ActionListener {
    private GiaoDien GiaoDien;
    public GiaoDienListener(GiaoDienCuaBanQuanLy.GiaoDien GiaoDien){
        this.GiaoDien = GiaoDien;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if (src.equals("Thông Tin Cá Nhân")){
            if(this.GiaoDien.viewroom.isVisible()){
                this.GiaoDien.viewroom.setVisible(false);
                this.GiaoDien.ThongtinBQL.setVisible(true);
            }
            try {
                this.GiaoDien.ThongTinBanQL();
                this.GiaoDien.ThongTinBanQL();
                this.GiaoDien.refresh();
            } catch (MalformedURLException ex) {
                throw new RuntimeException(ex);
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
        else if(src.equals("Thông Tin Phòng")){
            if(this.GiaoDien.ThongtinBQL.isVisible()){
                this.GiaoDien.ThongtinBQL.setVisible(false);
                this.GiaoDien.viewroom.setVisible(true);
            }
            else{
                this.GiaoDien.viewroom.setVisible(true);
                this.GiaoDien.ThongTinRooms();
            }
            this.GiaoDien.ThongTinRooms();
            this.GiaoDien.refresh();
        }
    }
}
