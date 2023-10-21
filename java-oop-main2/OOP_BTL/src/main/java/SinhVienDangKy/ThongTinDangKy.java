package SinhVienDangKy;

public class ThongTinDangKy {
    private String User;
    private String Password;
    private String MSV;
    private String Name;
    private String SEX;
    private String Phone;
    private String Address;
    private String date;
    private String CCCD;
    private String Email;
    private String TinhTrang;
    private String MaNganh;
    private String Lop;
    private String Chucvu;
    private int sophong;
    private String toa;
    public ThongTinDangKy(){

    }

    public ThongTinDangKy(String user, String pass, String MSV, String name, String gt , String phone, String Address, String date,String CCCD,String Email,String TinhTrang, String MaNganh,String Lop, String Chucvu, int sophong, String toa){
        this.User = user;
        this.Password = pass;
        this.MSV = MSV;
        this.Name = name;
        this.SEX = gt;
        this.Phone = phone;
        this.Address = Address;
        this.date = date;
        this.CCCD = CCCD;
        this.Email = Email;
        this.TinhTrang = TinhTrang;
        this.MaNganh = MaNganh;
        this.Lop = Lop;
        this.Chucvu = Chucvu;
        this.sophong = sophong;
        this.toa = toa;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        this.User = user;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassWord(String password) {
        this.Password = password;
    }

    public String getMSV() {
        return MSV;
    }
    public void setMSV(String MSV){
        this.MSV = MSV;
    }
    public String getName(){
        return Name;
    }
    public void setName(String name){
        this.Name = name;
    }
    public String getSex(){
        return SEX;
    }
    public void setSex(String sex){
        this.SEX = sex;
    }
    public String getPhone(){
        return Phone;
    }
    public void setPhone(String phone){
        this.Phone = phone;
    }
    public String getAddress(){
        return Address;
    }
    public void setAddress(String address){
        this.Address = address;
    }
    public String getDate(){
        return date;
    }
    public void setDate(String date){
        this.date = date;
    }
    public String getCCCD(){
        return CCCD;
    }
    public void setCCCD(String CCCD){
        this.CCCD = CCCD;
    }
    public String getEmail(){
        return Email;
    }
    public void setEmail(String email){
        this.Email = email;
    }
    public String getTinhTrang(){
        return TinhTrang;
    }
    public void setTinhTrang(String tinhTrang){
        this.TinhTrang = tinhTrang;
    }
    public String getMaNganh(){
        return MaNganh;
    }
    public void setMaNganh(String MaNganh){
        this.MaNganh = MaNganh;
    }
    public String getLop(){
        return Lop;
    }
    public void setLop(String Lop){
        this.Lop = Lop;
    }
    public String getChucvu(){
        return Chucvu;
    }
    public void setChucvu(String Chucvu){
        this.Chucvu = Chucvu;
    }
    public int getSoPhong(){
        return sophong;
    }
    public void setSoPhong(int sophong){
        this.sophong = sophong;
    }
    public String getToa(){
        return toa;
    }
    public void setToa(String toa){
        this.toa = toa;
    }

}
