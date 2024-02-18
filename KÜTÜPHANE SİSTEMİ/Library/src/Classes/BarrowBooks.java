
import java.sql.Timestamp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cemil
 */
class BarrowBooks {

    private int b_id;
    private String b_book_name;
    private String b_writer_name;
    private int b_page_number;
    private String b_book_type;
    private String timestamp;
    private String taker;

    

    
    
    public BarrowBooks(int b_id, String b_book_name, String b_writer_name, int b_page_number, String b_book_type,String timestamp,String taker) {
        this.b_id = b_id;
        this.b_book_name = b_book_name;
        this.b_writer_name = b_writer_name;
        this.b_page_number = b_page_number;
        this.b_book_type = b_book_type;
        this.timestamp=timestamp;
        this.taker = taker;
    }

    public int getB_id() {
        return b_id;
    }

    public void setB_id(int b_id) {
        this.b_id = b_id;
    }

    public String getB_book_name() {
        return b_book_name;
    }

    public void setB_book_name(String b_book_name) {
        this.b_book_name = b_book_name;
    }

    public String getB_writer_name() {
        return b_writer_name;
    }

    public void setB_writer_name(String b_writer_name) {
        this.b_writer_name = b_writer_name;
    }

    public int getB_page_number() {
        return b_page_number;
    }

    public void setB_page_number(int b_page_number) {
        this.b_page_number = b_page_number;
    }

    public String getB_book_type() {
        return b_book_type;
    }

    public void setB_book_type(String b_book_type) {
        this.b_book_type = b_book_type;
    }
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
    
    public String getTaker() {
        return taker;
    }

    public void setTaker(String taker) {
        this.taker = taker;
    }

    
    
    
}
   
