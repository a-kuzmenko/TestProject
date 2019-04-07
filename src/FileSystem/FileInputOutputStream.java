package FileSystem;

import java.io.*;
import java.net.URL;

import static java.lang.System.*;

/**
 * Created by UITS-Admin on 07.04.2019.
 */
public class FileInputOutputStream {

    public static final String sourceFileName = "file.txt";
    public static final String destFileName = "dest.txt";

    public static void main(String[] args) throws IOException {
        /*FileInputStream st = new FileInputStream("file.txt");

        while(st.available()!=0){
            int b = st.read();
            char ch = (char) b;
            out.println(ch);

        }
        st.close();

        FileOutputStream so = new FileOutputStream("file.txt");
        String d = "Hello";
        byte[] bytes = d.getBytes();
        so.write(bytes);
        //out.println(so);
        so.close();

        BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
        String s = null;
        while((s = reader.readLine())!=null){
            out.println(s);
        }

        reader.close();

        PrintWriter write = new PrintWriter("out1.txt");
        write.printf("%s %d %c", "String", 100, 'e');
        write.close();*/

       /* BufferedReader reader = new BufferedReader(new FileReader(sourceFileName));
        PrintWriter write = new PrintWriter(destFileName);

        String s = null;
        int words = 0;
        int lines = 0;
        int chars = 0;

        while((s = reader.readLine()) != null){
            lines++;
            String[] ws = s.trim().split("\\s");
            words+=ws.length;
            for(String l:ws){
                chars+=l.length();


            }
            write.println(s.toUpperCase());
        }
        reader.close();
        write.close();

        out.printf("Copied chars - %d; words - %d;  lines - %d\n", chars, words, lines);
*/

       InputStream inFile = new FileInputStream("file.txt");
        readFullyByByte(inFile);
        System.out.println("\n\n\n");

        InputStream inUrl = new URL("http://google.com").openStream();
        readFullyByByte(inUrl);
        System.out.println("\n\n\n");


        InputStream inArray = new ByteArrayInputStream(new byte[]{65, 66, 67, 68, 69});
        readFullyByByte(inArray);
        System.out.println("\n\n\n");
    }


    private static void readFullyByByte(InputStream in) throws IOException {
        while(true){
            int oneByte = in.read();
            if(oneByte != -1){
                System.out.print((char) oneByte);
            }else{
                System.out.print("\n" + "end");
                break;
            }
        }
    }
}
