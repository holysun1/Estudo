package br.com.dio.persistence;
import br.com.dio.persistence.entity.ContactEntity;
import br.com.dio.persistence.entity.EmployeeEntity;
import com.mysql.cj.jdbc.StatementImpl;
import lombok.NonNull;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.Types;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ContactDAO {
        public void insertContact(final ContactEntity entity) {
                try (
                        var connection = ConnectionUtil.getConnection();
                        var statement = connection.prepareStatement(
                                "INSERT INTO contacts (description,employee_id) values (?,?);"
                )
                ){
                        statement.setString(1, entity.getDescription());
                        statement.setObject(2, entity.getEmployeeId());
                        statement.executeUpdate();
                        if (statement instanceof StatementImpl impl)
                                entity.setId(impl.getLastInsertID());
                } catch (SQLException | ClassNotFoundException ex) {
                        throw new RuntimeException(ex);
                }
        }

}
