package ThongTinNguoiQuanLy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class BQLListener implements ActionListener {
    private ThongTinBQL bql;
    public BQLListener(ThongTinBQL bql){
        this.bql = bql;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if (src.equals("Save")){
            try {
                bql.saveData();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
        else if (src.equals("Tùy Chỉnh")) {
            bql.Tuychinh();
        }
    }
}
