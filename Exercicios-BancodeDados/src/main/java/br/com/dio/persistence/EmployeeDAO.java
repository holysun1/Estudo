package br.com.dio.persistence;
import br.com.dio.persistence.entity.EmployeeEntity;
import com.mysql.cj.jdbc.StatementImpl;
import lombok.NonNull;

import java.sql.SQLException;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeDAO {
        public void insert(final EmployeeEntity entity) {
                String sql = "INSERT INTO employees(name , salary , birthday ) values ( ? , ? , ?)";
                try (
                        var connection = ConnectionUtil.getConnection();
                        var statement = connection.prepareStatement(sql);
                ) {
                        statement.setString(1, entity.getName());
                        statement.setBigDecimal(2,entity.getSalary());
                        var birthday = entity.getBirthday();
                        statement.setTimestamp(3, birthday != null ?
                                java.sql.Timestamp.from(birthday.toInstant()) : null);
                        statement.executeUpdate();
                } catch (SQLException | ClassNotFoundException ex) {
                        throw new RuntimeException(ex);
                }
        }

        public void update(final @NonNull EmployeeEntity entity) {
                String sql = "UPDATE employees SET name = ? , salary = ? , birthday = ? WHERE id = ?";
                try (
                        var connection = ConnectionUtil.getConnection();
                        var statement = connection.prepareStatement(sql);
                ) {
                        statement.setString(1, entity.getName());
                        statement.setBigDecimal(2, entity.getSalary());
                        var birthday = entity.getBirthday();
                        statement.setTimestamp(3, birthday != null ?
                                java.sql.Timestamp.from(birthday.toInstant()) : null);
                        statement.setLong(4, entity.getId());
                        statement.executeUpdate();

                } catch (SQLException | ClassNotFoundException e) {
                        throw new RuntimeException(e);
                }
        }

        public void delete(final long id) {
                        String sql = "DELETE FROM employees WHERE id = ?";
                try (
                        var connection = ConnectionUtil.getConnection();
                        var statement = connection.prepareStatement(sql);
                ) { statement.setLong(1, id);
                        statement.execute();
                } catch (SQLException | ClassNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
        };

        public List<EmployeeEntity> findAll() {
                List<EmployeeEntity> entities = new ArrayList<>();
                String sql = "SELECT * FROM employees";
                try (
                        var connection = ConnectionUtil.getConnection();
                        var statement = connection.createStatement();
                        var resultSet = statement.executeQuery(sql);
                ) {
                        while (resultSet.next()) {
                                var entity = new EmployeeEntity();
                                entity.setId(resultSet.getLong("id"));
                                entity.setName(resultSet.getString("name"));
                                entity.setSalary(resultSet.getBigDecimal("salary"));
                                var timestamp = resultSet.getTimestamp("birthday");
                                if (timestamp != null) {
                                        var birthday = timestamp.toInstant().atOffset(ZoneOffset.UTC);
                                        entity.setBirthday(birthday);
                                }
                                entities.add(entity);
                        }
                } catch (SQLException | ClassNotFoundException ex) {
                        ex.printStackTrace();
                }
                return entities;
        }

        public Optional<EmployeeEntity> findById(final long id) {
                String sql = "SELECT * FROM employees WHERE id = ? ";
                try (
                        var connection = ConnectionUtil.getConnection();
                        //var statement = connection.createStatement(); ##REFATORAR
                        var statement = connection.prepareStatement(sql);
                        //var resultSet = statement.executeQuery(sql);
                ) { statement.setLong(1,id);
                        try (var resultSet = statement.executeQuery()) {
                                if (resultSet.next()) {
                                        var entity = new EmployeeEntity();
                                        entity.setId(resultSet.getLong("id"));
                                        entity.setName(resultSet.getString("name"));
                                        entity.setSalary(resultSet.getBigDecimal("salary"));
                                        var timestamp = resultSet.getTimestamp("birthday");
                                        if (timestamp != null) {
                                                var birthday = timestamp.toInstant().atOffset(ZoneOffset.UTC);
                                                entity.setBirthday(birthday);
                                        }
                                        return Optional.of(entity);
                                }
                        }
                } catch (SQLException | ClassNotFoundException ex) {
                        ex.printStackTrace();
                }

                return Optional.empty();
        }

}
