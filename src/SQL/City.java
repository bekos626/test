package SQL;

public class City {
    private Integer id;
    private String name;
    private Integer country_id;
    private String fioMayor;
    private Integer population;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCountry_id() {
        return country_id;
    }

    public void setCountry_id(Integer country_id) {
        this.country_id = country_id;
    }

    public String getFioMayor() {
        return fioMayor;
    }

    public void setFioMayor(String fioMayor) {
        this.fioMayor = fioMayor;
    }

    public Integer getPopulation() {
        return population;
    }

     public void setPopulation(Integer population) {
        this.population = population;
    }
}
