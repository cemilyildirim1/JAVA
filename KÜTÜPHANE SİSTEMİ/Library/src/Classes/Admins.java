/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cemil
 */
public class Admins {
    private int id;
    private String admin_NickName;
    private String admin_mail;
    private String admin_password;

    
    
    
    
    public Admins(int id, String admin_NickName, String admin_mail, String admin_password) {
        this.id = id;
        this.admin_NickName = admin_NickName;
        this.admin_mail = admin_mail;
        this.admin_password = admin_password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdmin_NickName() {
        return admin_NickName;
    }

    public void setAdmin_NickName(String admin_NickName) {
        this.admin_NickName = admin_NickName;
    }

    public String getAdmin_mail() {
        return admin_mail;
    }

    public void setAdmin_mail(String admin_mail) {
        this.admin_mail = admin_mail;
    }
    
    public String getAdmin_password() {
        return admin_password;
    }

    public void setAdmin_password(String admin_password) {
        this.admin_password = admin_password;
    }

    

    
    
}
