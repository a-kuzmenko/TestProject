package FileSystem;

import java.io.Serializable;

/**
 * Created by UITS-Admin on 20.04.2019.
 */
public class Student implements Serializable{
    protected  static  String faculty;
    private String name;
    private int id;
    private transient String password;
    //private static final long serialVersionUID = 1L;


    public  Student(String nameOfFaculty, String name, int id, String password ){
        faculty = nameOfFaculty;
        this.name = name;
        this.id = id;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                " \nfaculty" + faculty +
                "\nname='" + name + '\'' +
                ", \nid=" + id +
                ", \npassword='" + password + '\'' +
                '}';
    }




}
