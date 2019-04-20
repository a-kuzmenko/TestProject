package FileSystem;

import java.io.*;

/**
 * Created by UITS-Admin on 20.04.2019.
 */
public class MainStuden {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student1 = new Student("MMF", "Goncharenko", 1, "GO17s9");
        System.out.println(student1);
        File fw = new File("demo.dat");

        ObjectOutputStream ostream = new ObjectOutputStream(new FileOutputStream(fw));
        ostream.writeObject(student1);
        ostream.close();

        Student.faculty = "GEO";

        File fr = new File("demo.dat");
        ObjectInputStream istream = new ObjectInputStream(new FileInputStream(fr));
        Student unknown = (Student) istream.readObject();
        System.out.println(unknown);
    }
}
