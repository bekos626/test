package Football;

public class Employee {
    private Integer id;
    private String fio;
    private String position;
    private Integer clubId;

    public Employee(Integer id, String fio, String position, Integer clubId) {
        this.id = id;
        this.fio = fio;
        this.position = position;
        this.clubId = clubId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getClubId() {
        return clubId;
    }

    public void setClubId(Integer clubId) {
        this.clubId = clubId;
    }
}
