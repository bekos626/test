package Study;

import Connect.Connection1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Subjects {
    private Integer id;
    private String name;
    private Integer passScore;

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

    public Integer getPassScore() {
        return passScore;
    }

    public void setPassScore(Integer passScore) {
        this.passScore = passScore;
    }

    public void insertSubjects(Subjects subjects) {
        String sqlStudent = "insert into \"Student\".predmet(nazvanie, passscore)" +
                "values(?, ?)";
        Connection1 connection1 = new Connection1();
        try (Connection connection = connection1.connect();){
            for (int i = 0; i <= 10; i++) {
                PreparedStatement preparedStatement = connection.prepareStatement(sqlStudent);
                preparedStatement.setString(1, subjects.getName());
                preparedStatement.setInt(2, subjects.getPassScore());
                preparedStatement.executeQuery();
                ResultSet resultSet = preparedStatement.getResultSet();
                resultSet.next();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
