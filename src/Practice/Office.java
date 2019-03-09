package Practice;

/**
 * Created by UITS-Admin on 09.03.2019.
 */
public class Office {
    public String ceo;
    public int count;
    public City city;

    public Office(String ceo, int count, City city) {
        this.ceo = ceo;
        this.count = count;
        this.city = city;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Office{" +
                "ceo='" + ceo + '\'' +
                ", count=" + count +
                ", city=" + city +
                '}';
    }
}
