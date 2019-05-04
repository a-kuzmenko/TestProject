package DataBase;

/**
 * Created by UITS-Admin on 04.05.2019.
 */
public class Employee {
    private int id;
    private String name;
    private String city;
    private int age;
    private double comm;

    public Employee(int id, String name, String city, int age, double comm) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.age = age;
        this.comm = comm;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }

    public double getComm() {
        return comm;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (id != employee.id) return false;
        if (age != employee.age) return false;
        if (Double.compare(employee.comm, comm) != 0) return false;
        if (!name.equals(employee.name)) return false;
        return city.equals(employee.city);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + city.hashCode();
        result = 31 * result + age;
        temp = Double.doubleToLongBits(comm);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                ", comm=" + comm +
                '}';
    }
}
