public class Main {
    public static void main(String[] args) {
        import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
        class Parent implements Serializable {
            int i = 33;
        }
        class Child extends Parent {
            int j = 21;
        }
        public class Example {
            public static void main(String[] args) throws IOException, ClassNotFoundException {
                Child writer = new Child();
                FileOutputStream fos = new FileOutputStream("file.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(writer);
                FileInputStream fis = new FileInputStream("file.txt");
                ObjectInputStream ois = new ObjectInputStream(fis);
                Child reader = (Child)ois.readObject();
                System.out.println(reader.i+","+reader.j);
            }
        }
    }
}