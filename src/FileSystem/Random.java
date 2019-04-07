package FileSystem;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import static java.lang.System.*;

/**
 * Created by UITS-Admin on 07.04.2019.
 */
public class Random {
    public static final String sourceFileName = "file.txt";
    public static void main(String[] args) throws IOException {

        RandomAccessFile raf = new RandomAccessFile(sourceFileName, "rw");

        out.println(raf.length());
        raf.seek(10);

        String s = raf.readLine();
        out.println(s);
        raf.seek(raf.length());
        raf.writeUTF("hello");
        out.close();

    }
}
