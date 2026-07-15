package br.com.dio.persistence;

import lombok.NoArgsConstructor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public class ConnectionUtil {
    //public static Connection getConnection() throws ClassNotFoundException, SQLException {
      //  return DriverManager.getConnection("jdbc:mysql://localhost:3306/estudos_fk", "root", "896095");
    //REFATORAR O METODO UTILIZADO
    public static final String URL = "jdbc:mysql://localhost:3306/estudos_fk";
    public static final String User = "root";
    public static final String Password = "896095";
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return  DriverManager.getConnection(URL, User, Password);
    }
}
