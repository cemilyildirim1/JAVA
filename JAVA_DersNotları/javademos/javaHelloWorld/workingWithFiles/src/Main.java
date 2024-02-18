import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        readFile();
        writeFile();
        readFile();

    }
    public static void creatFile(){
        File file=new File("C:\\javademos\\javaHelloWorld\\files\\studentx.txt");
        try {
            if (file.createNewFile()){
                System.out.println("Dosya oluşturuldu");
            }else{
                System.out.println("Dosya zaten mevcut");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void getFileInfo(){
        File file=new File("C:\\javademos\\javaHelloWorld\\files\\studentx.txt");
        if (file.exists()){
            System.out.println("Dosya adı :"+ file.getName());
            System.out.println("Dosya yolu :"+ file.getAbsolutePath());
            System.out.println("Dosya yazılabilir mi : "+file.canRead());
            System.out.println("Dosya boyutu (byte) : "+file.length());
        }
    }
    public static void readFile(){
        File file=new File("C:\\javademos\\javaHelloWorld\\files\\studentx.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
    public static void writeFile(){
        try {
          BufferedWriter writer =new BufferedWriter(new FileWriter("C:\\javademos\\javaHelloWorld\\files\\studentx.txt",true));
          writer.newLine();
          writer.write("Ahmet");
          System.out.println("Dosyaya azıldı");
          writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}