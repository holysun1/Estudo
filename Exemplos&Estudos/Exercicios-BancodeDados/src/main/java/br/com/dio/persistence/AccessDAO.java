package br.com.dio.persistence;

import java.sql.SQLException;

public class AccessDAO {
    public void insert(final long employeeId, final long moduleId) {
        try (
                var connection = ConnectionUtil.getConnection();
                var statement = connection.prepareStatement(
                        "INSERT INTO accesses (module_id, employee_id) values (?,?)"
                )
        ) {
            statement.setLong(1,moduleId);
            statement.setLong(2,employeeId);
            statement.executeUpdate();
        } catch (SQLException | ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }

}
