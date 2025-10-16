import java.io.*;

// Step 1: Make class Serializable
class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class MixedFileHandling {
    public static void main(String[] args) {
        String filename = "student.ser";

        // ---------- Serialization ----------
        try {
            Student s1 = new Student(101, "Alice");

            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s1); // writing object
            oos.close();
            fos.close();

            System.out.println("✅ Object serialized and saved in " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // ---------- Deserialization ----------
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student s2 = (Student) ois.readObject(); // reading object
            ois.close();
            fis.close();

            System.out.println("✅ Object deserialized");
            System.out.println("ID: " + s2.id);
            System.out.println("Name: " + s2.name);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
