package FileSystem;

import com.sun.xml.internal.bind.api.impl.NameConverter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by UITS-Admin on 20.04.2019.
 */
public class FindInLineExample {
    public static void main(String[] args) throws IOException {
        String instr = "Name: Joe Age: 28 ID: 77";
        Scanner conin = new Scanner(instr);
        conin.findInLine("Age:");
        if(conin.hasNext()){
            System.out.println(conin.next());
        }else
        {
            System.out.println("Error!");
        }

        Path path = Paths.get("file.txt");
        List<String> lines = Files.readAllLines(path);
        //System.out.println(lines);
        for(String s:lines){
            System.out.println(s);
        }

      //  Files.readAllLines(Paths.get("file.txt")).forEach(System.out::println);

     //   Files.copy(Paths.get("file.txt"), Paths.get("out2.txt"));

        Files.move(Paths.get("file.txt"), Paths.get("D:/move.txt"), StandardCopyOption.REPLACE_EXISTING);
    }
}
