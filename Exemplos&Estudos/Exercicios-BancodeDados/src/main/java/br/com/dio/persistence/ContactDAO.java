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

        public List<ContactEntity> findbyEmployeeId(final long employeeId) {
                List<ContactEntity> entities = new ArrayList<>();
                String sql = "SELECT *FROM contacts WHERE employee_id = ?";
                try (
                        var connection = ConnectionUtil.getConnection();
                        //var statement = connection.createStatement(); ##REFATORAR
                        var statement = connection.prepareStatement(sql)
                        //var resultSet = statement.executeQuery(sql);
                ) {
                        statement.setLong(1, employeeId);
                        try( var resultSet = statement.executeQuery() ) {
                        while (resultSet.next()){
                        var entity = new ContactEntity();
                                entity.setId(resultSet.getLong("id"));
                                entity.setDescription(resultSet.getString("description"));
                                entity.setType(resultSet.getString("type"));
                                entity.setEmployeeId(resultSet.getLong("employee_id"));
                                entities.add(entity);
                                }
                        }
                }catch(SQLException | ClassNotFoundException ex){
                                ex.printStackTrace();
                        }
                        return entities;
                }

}
