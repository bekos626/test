package Study;

import Connect.Connection1;

import java.sql.*;

public class Students {
    private Integer id;
    private String fio;
    private String predmet;
    private Integer score;

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

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public void insertStudent(Students students) {
        String sqlStudent = "insert into \"Student\".students(fio, predmet, score)" +
                "values(?, ?, ?)";
        Connection1 connection1 = new Connection1();
        try (Connection connection = connection1.connect();){
            for (int i = 0; i <= 10; i++) {
                PreparedStatement preparedStatement = connection.prepareStatement(sqlStudent);
                preparedStatement.setString(1, students.getFio());
                preparedStatement.setString(2, students.getPredmet());
                preparedStatement.setInt(3, students.getScore());
                preparedStatement.executeQuery();
                ResultSet resultSet = preparedStatement.getResultSet();
                resultSet.next();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
