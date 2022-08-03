package Connect;

import SQL.City;
import SQL.Country;
import java.sql.*;

public class Connection1 {
    private final String url = "jdbc:postgresql://localhost:5432/";
    private final String user = "postgres";
    private final String password = "0000";

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgresSQL server successfully");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void insertCountry(Country country) {
        String SQL = "INSERT INTO \"it-academy\".countries (country_name,country_code,country_population,country_president)" +
                "VALUES (?,?,?,?)";
        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(SQL)) {
            stmt.setString(1, country.getName());
            stmt.setInt(2, country.getCode());
            stmt.setInt(3, country.getPopulation());
            stmt.setString(4, country.getPresident());
            stmt.executeQuery();
            ResultSet rs = stmt.getResultSet();
            rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertCountry(City city) {
        String SQL = "INSERT INTO \"it-academy\".cities (city_name,city_country_id,city_mayor,city_population)" +
                "VALUES (?,?,?,?)";
        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(SQL)) {
            stmt.setString(1, city.getName());
            stmt.setInt(2, city.getCountry_id());
            stmt.setString(3, city.getFioMayor());
            stmt.setInt(4, city.getPopulation());
            stmt.executeQuery();
            ResultSet rs = stmt.getResultSet();
            rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
