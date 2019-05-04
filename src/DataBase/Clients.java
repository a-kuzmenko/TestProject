package DataBase;

/**
 * Created by UITS-Admin on 04.05.2019.
 */
public class Clients {
    private int id;
    private String name;
    private String city;
    private int rating;
    private double snum;

    public Clients(int id, String name, String city, int rating, double snum) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.rating = rating;
        this.snum = snum;
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

    public int getRating() {
        return rating;
    }

    public double getSnum() {
        return snum;
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

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setSnum(double snum) {
        this.snum = snum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Clients clients = (Clients) o;

        if (id != clients.id) return false;
        if (rating != clients.rating) return false;
        if (Double.compare(clients.snum, snum) != 0) return false;
        if (!name.equals(clients.name)) return false;
        return city.equals(clients.city);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + city.hashCode();
        result = 31 * result + rating;
        temp = Double.doubleToLongBits(snum);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Clients{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", rating=" + rating +
                ", snum=" + snum +
                '}';
    }
}
