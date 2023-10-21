package org.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrangChuListener implements ActionListener {
    private TrangChu TrangChu;
    private JPanel_SinhVien_Listener sinhVienListener;
    public TrangChuListener(TrangChu TrangChu){
        this.TrangChu = TrangChu;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        int index = this.TrangChu.vai_tro.getSelectedIndex();
        String s = (String) this.TrangChu.vai_tro.getItemAt(index);
        if (s.equals("Tôi là Sinh Viên")){
            if(this.TrangChu.bql.isVisible()){
                this.TrangChu.bql.setVisible(false);
                this.TrangChu.sv.setVisible(true);
            }
            this.TrangChu.refresh();
        }
        else if (s.equals("Tôi là Quản Lí KTX")){
            if(this.TrangChu.sv.isVisible()){
                this.TrangChu.sv.setVisible(false);
                this.TrangChu.bql.setVisible(true);
            }
            this.TrangChu.refresh();
        }
    }
}
