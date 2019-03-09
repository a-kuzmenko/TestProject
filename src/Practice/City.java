package Practice;

/**
 * Created by UITS-Admin on 09.03.2019.
 */
public enum City {
    Kharkov(1000, 35), Liviv(2000, 65), Kiev(2500, 56);

    private int population;
    private int area;

    City(int population, int area) {
        this.population = population;
        this.area = area;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "City{" +
                "population=" + population +
                ", area=" + area +
                "} " + super.toString();
    }
}
