public class Books {

    private int id;
    private String book_name;
    private String writer_name;
    private int page_number;
    private String book_type;
    
    //Constructor
    
        public Books(int id, String book_name, String writer_name, int page_number, String book_type) {
        this.id = id;
        this.book_name = book_name;
        this.writer_name = writer_name;
        this.page_number = page_number;
        this.book_type = book_type;
    }
     //Getter Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getWriter_name() {
        return writer_name;
    }

    public void setWriter_name(String writer_name) {
        this.writer_name = writer_name;
    }

    public int getPage_number() {
        return page_number;
    }

    public void setPage_number(int page_number) {
        this.page_number = page_number;
    }

    public String getBook_type() {
        return book_type;
    }

    public void setBook_type(String book_type) {
        this.book_type = book_type;
    }

}