package FileSystem;

import java.io.*;

/**
 * Created by UITS-Admin on 20.04.2019.
 */
public class DataIODemo {
    public static void main(String[] args)throws IOExeption {

        try(DataOutputStream dout = new DataOutputStream(new FileOutputStream("Test.dat"))){
            dout.writeDouble(98.6);
            dout.writeInt(1000);
            dout.writeBoolean(true);
        }catch(FileNotFoundException e){
            System.out.println("Cannot Open Output File");
            return;
        }catch(IOException e){
            System.out.println("I/O Error: " + e);
        }

        try(DataInputStream din = new DataInputStream(new FileInputSteam("Test.dat"))){
            double d = din.readDouble();
            int i = din.readInt();
            boolean b = din.readBoolean();

            System.out.println("Here are the values: " + d + " " + i + " " + b);
        } catch(FileNotFoundException e){
            System.out.println("Cannot Open Output File");
            return;
        }catch(IOException e){
            System.out.println("I/O Error: " + e);
        }
    }


}
