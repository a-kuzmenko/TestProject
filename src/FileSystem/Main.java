package FileSystem;

import java.io.File;

/**
 * Created by UITS-Admin on 07.04.2019.
 */
public class Main {
    public static void main(String[] args) {
        File file = new File("src\\String\\file");
        System.out.println(file.canRead());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println("Имя файла: " + file.getName());
        System.out.println("Путь: " + file.getPath());
        System.out.println("Абсолютный путь: " + file.getAbsolutePath());
        System.out.println("Родительский каталог: " + file.getParent());
        System.out.println(file.exists() ? "Файл/каталог существует." : "Файл/каталог не существует.");
        System.out.println(file.canWrite() ? "Файл/каталог доступен для редактирования."
                : "Файл/каталог не доступен для редактирования.");
        System.out.println(file.canRead() ? "Файл/каталог доступен для чтения." : "Файл/каталог не доступен для чтения.");
        System.out.println((file.isDirectory() ? "Каталог." : "Не каталог."));
        System.out.println(file.isFile() ? "Файл." : "Не файл.");
        System.out.println(file.isAbsolute() ? "Абсолютный путь." : "Не абсолютный путь.");
        System.out.println("Дата последнего редактирования: " + file.lastModified());
        System.out.println("Размер: " + file.length() + " байт.");

        File file1 = new File(".");
        System.out.println(file1.getAbsolutePath());
        for (File listFile : file1.listFiles()) {
            if(listFile.isDirectory()){
                System.out.println(listFile.getName().toUpperCase());
            }else
            System.out.println(listFile.getName().toLowerCase());
        }




    }
}
