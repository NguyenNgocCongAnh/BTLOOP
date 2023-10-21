package org.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.MalformedURLException;
import java.sql.SQLException;
import GiaoDienCuaBanQuanLy.GiaoDien;
public class JPanel_BanQL_Listener implements ActionListener {
    private JPanel_BanQL jp_banQL;
    public GiaoDien GiaoDien;
    public JPanel_BanQL_Listener(JPanel_BanQL jp_banQL){
        this.jp_banQL = jp_banQL;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if(src.equals("Đăng Nhập")){
            try {
                if(this.jp_banQL.BanQLDangNhap()){
                    this.GiaoDien = new GiaoDien();
                    if(this.GiaoDien.isVisible()){
                        this.GiaoDien.user = this.jp_banQL.text_tk.getText();
                        this.GiaoDien.pass = this.jp_banQL.text_mk.getText();
                        this.jp_banQL.jbutton_dangnhap.setEnabled(false);
                    }
                    this.GiaoDien.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosed(WindowEvent e) {
                            GiaoDien.dispose();
                            jp_banQL.jbutton_dangnhap.setEnabled(true);
                        }
                    });
                }
                else{
                    System.out.println("No");
                }
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            } catch (MalformedURLException ex) {
                throw new RuntimeException(ex);
            }

        }
    }
}
