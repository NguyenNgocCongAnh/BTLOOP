package Dao;

import SinhVienDangKy.ThongTinDangKy;
import TaoSQL.MySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ThongTinSVDao {
    private static Connection conn = MySQL.getConnect();
    public static ArrayList<ThongTinDangKy> getListSV(){
        ArrayList<ThongTinDangKy> listSV = new ArrayList<>();
        String sql = "SELECT * FROM player";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                ThongTinDangKy SV = new ThongTinDangKy();
                SV.setUser(rs.getString("User"));
                SV.setPassWord(rs.getString("Password"));
                SV.setMSV(rs.getString("MSV"));
                SV.setName(rs.getString("Name"));
                SV.setSex(rs.getString("SEX"));
                SV.setPhone(rs.getString("Phone"));
                SV.setAddress(rs.getString("Address"));
                SV.setDate(rs.getString("date"));
                SV.setCCCD(rs.getString("CCCD"));
                SV.setEmail(rs.getString("Email"));
                SV.setTinhTrang(rs.getString("TinhTrang"));
                SV.setMaNganh(rs.getString("MaNganh"));
                SV.setLop(rs.getString("Lop"));
                SV.setChucvu(rs.getString("Chucvu"));
                SV.setSoPhong(rs.getInt("sophong"));
                SV.setToa(rs.getString("Toa"));
                listSV.add(SV);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return listSV;
    }
    public static boolean addSV(ThongTinDangKy TTdk){

        String sql = "Insert into DsSV(User,Password,MSV,Name,SEX,Phone,Address,date,CCCD,Email,TinhTrang,MaNganh,Lop,Chucvu,sophong,matoa) " +
                "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        try{
            PreparedStatement ps =conn.prepareStatement(sql);
            ps.setString(1,TTdk.getUser());
            ps.setString(2,TTdk.getPassword());
            ps.setString(3,TTdk.getMSV());
            ps.setString(4,TTdk.getName());
            ps.setString(5,TTdk.getSex());
            ps.setString(6,TTdk.getPhone());
            ps.setString(7,TTdk.getAddress());
            ps.setString(8,TTdk.getDate());
            ps.setString(9,TTdk.getCCCD());
            ps.setString(10,TTdk.getEmail());
            ps.setString(11,TTdk.getTinhTrang());
            ps.setString(12,TTdk.getMaNganh());
            ps.setString(13,TTdk.getLop());
            ps.setString(14,TTdk.getChucvu());
            ps.setInt(15,TTdk.getSoPhong());
            ps.setString(16,TTdk.getToa());
            return ps.executeUpdate() > 0 ;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }


}
