package ThongTinPhong;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class RoomListener implements ActionListener {
    private ViewRoom VR;
    public RoomListener(ViewRoom VR){
        this.VR = VR;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if (src.equals("Hiện Thị Thông Tin")){
            try {
                this.VR.HienThi();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
