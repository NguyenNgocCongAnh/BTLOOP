package ThongTinNguoiQuanLy;

import java.awt.datatransfer.StringSelection;

public class BQLModel {
    private String user;
    private String pass;
    private String name;
    private String date;
    private String sex ;
    private String chucvu;
    private String Tinh;
    private String Quan;
    private String Xa;
    private String Email;
    private String Phone;
    private String CCCD;

    public BQLModel(){

    }
    public BQLModel(String user , String pass, String Name, String date, String SEX,String chucvu,String Tinh,String Quan,String Xa,String Email,String Phone,String CCCD){
        this.user = user;
        this.pass = pass;
        this.name = Name;
        this.date = date;
        this.sex = SEX;
        this.chucvu = chucvu;
        this.Tinh = Tinh;
        this.Quan = Quan;
        this.Xa = Xa;
        this.Phone = Phone;
        this.Email = Email;
        this.CCCD = CCCD;
    }

    public String getUser(){
        return user;
    }
    public void setUser(String user){
        this.user = user;
    }
    public String getPass(){
        return pass;
    }
    public void setPass(String pass){
        this.pass = pass;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDate(){
        return date;
    }
    public void setDate(String date){
        this.date = date;
    }
    public String getSex(){
        return sex;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public String getChucvu(){return chucvu;}
    public void setChucvu(String chucvu){this.chucvu = chucvu;}
    public String getTinh(){return Tinh;}
    public void setTinh(String Tinh){
        this.Tinh = Tinh;
    }
    public String getQuan(){
        return Quan;
    }
    public void setQuan(String Quan){
        this.Quan = Quan;
    }
    public String getXa(){
        return Xa;
    }
    public void setXa(String xa){
        this.Xa = xa;
    }
    public String getEmail(){return Email;}
    public void setEmail(String Email){
        this.Email = Email;
    }
    public String getPhone(){
        return Phone;
    }
    public void setPhone(String phone){
        this.Phone = phone;
    }
    public String getCCCD(){
        return CCCD;
    }
    public void setCCCD(String CCCD){
        this.CCCD = CCCD;
    }

}
