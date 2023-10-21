package TaoSQL;
import SinhVienDangKy.DienThongTin;
import SinhVienDangKy.ThongTinDangKy;
import ThongTinNguoiQuanLy.BQLModel;
import ThongTinNguoiQuanLy.ThongTinBQL;
import ThongTinSV.ThongTinSV;

import java.sql.*;
import java.util.ArrayList;
import static java.sql.DriverManager.getConnection;

public class MySQL {
    private static Connection conn  = null;
    private static String DB_URL = "jdbc:mysql://Canh:3306/ktx";
    private static String USER_NAME ="canh";
        private static String PASSWORD = "2422004T@o";
    public MySQL(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = getConnection(DB_URL,USER_NAME,PASSWORD);
            System.out.println("Connect!!!");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    static{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = getConnection(DB_URL,USER_NAME,PASSWORD);
            System.out.println("Connect!!!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static Connection getConnect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = getConnection(DB_URL,USER_NAME,PASSWORD);
            System.out.println("Connect!!!");
        }
        catch ( Exception e){
            e.printStackTrace();
        }
        return conn;
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
    public static ArrayList<ThongTinDangKy> getListThongTinDK(){
        ArrayList<ThongTinDangKy> listTT = new ArrayList<>();
        String sql = "Select * From DsSV ;";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            while(resultSet.next()){
                ThongTinDangKy ttdk = new ThongTinDangKy();
                ttdk.setUser(resultSet.getString("User"));
                ttdk.setPassWord(resultSet.getString("Password"));
                ttdk.setMSV(resultSet.getString("MSV"));
                ttdk.setName(resultSet.getString("Name"));
                ttdk.setSex(resultSet.getString("SEX"));
                ttdk.setPhone(resultSet.getString("Phone"));
                ttdk.setAddress(resultSet.getString("Address"));
                ttdk.setDate(resultSet.getString("date"));
                ttdk.setCCCD(resultSet.getString("CCCD"));
                ttdk.setEmail(resultSet.getString("Email"));
                ttdk.setTinhTrang(resultSet.getString("TinhTrang"));
                ttdk.setMaNganh(resultSet.getString("MaNganh"));
                ttdk.setLop(resultSet.getString("Lop"));
                ttdk.setChucvu(resultSet.getString("Chucvu"));
                ttdk.setSoPhong(resultSet.getInt("sophong"));
                ttdk.setToa(resultSet.getString("matoa"));
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return listTT;
    }

    public static boolean addComputer(ThongTinBQL BQL) {
        String sql = "INSERT INTO DsQL(user,pass,Name,date,SEX,chucvu,Tinh,Quan,Xa,Email,Phone,CCCD) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, BQL.getName());
            ps.setString(1, BQL.getName());
            ps.setString(1, BQL.getName());
            ps.setString(1, BQL.getName());
            ps.setString(1, BQL.getName());
            ps.setString(1, BQL.getName());
            ps.setString(1, BQL.getName());
            ps.setString(1, BQL.getName());
            ps.setString(1, BQL.getName());
            ps.setString(1, BQL.getName());
            ps.setString(1, BQL.getName());
            ps.setString(1, BQL.getName());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public static ArrayList<BQLModel> getListComputer() {
        ArrayList<BQLModel> listBQL = new ArrayList<>();
        String sql = "SELECT * computers";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BQLModel MdBQL = new BQLModel();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listBQL;
    }
    public static void main(String[] args) {
        System.out.println(MySQL.getConnect());
    }
}
