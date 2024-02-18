
public class Users {
    private int id;
    private String user_name;
    private String user_surname;
    private String password;
    private String mail;

    
    //Constructor
    
    public Users(int id, String user_name, String user_surname,String mail,String password ) {
        this.id = id;
        this.user_name = user_name;
        this.user_surname = user_surname;
        this.password = password;
        this.mail = mail;
    }

    //Getter setter
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_surname() {
        return user_surname;
    }

    public void setUser_surname(String user_surname) {
        this.user_surname = user_surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    
}
