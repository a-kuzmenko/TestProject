package Class15_OOP_InnerClasses;

/**
 * Created by UITS-Admin on 09.03.2019.
 */
public class Girl implements Comparable<Girl>{
    private String name;
    private int age;

    public Girl(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Girl girl = (Girl) o;

        if (age != girl.age) return false;
        return name != null ? name.equals(girl.name) : girl.name == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public int compareTo(Girl o) {
        return age - o.age;
    }



}
