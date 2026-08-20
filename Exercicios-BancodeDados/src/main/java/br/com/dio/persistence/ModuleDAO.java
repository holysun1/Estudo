package br.com.dio.persistence;

import br.com.dio.persistence.entity.EmployeeEntity;
import br.com.dio.persistence.entity.ModuleEntity;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

public class ModuleDAO {
    public List<ModuleEntity> findAll() {
        List<ModuleEntity>  entities = new ArrayList<>();
        var sql = """
                select m.id module_id,
                m.name module_name,
                e.id employeeid,
                e.name employee_name,
                e.salary employee_salary,
                e.birthday employee_birthday
                from modules m
                inner join accesses a
                on a.module_id = m.id
                 inner join employees e
                on e.id = a.employee_id
                ORDER BY m.id""";
        try (
                var connection = ConnectionUtil.getConnection();
                var statement = connection.prepareStatement(sql);
        ) {
            statement.executeQuery();
            var resultSet = statement.getResultSet();
            var hasNext = true;
            while (resultSet.next()) {
                ModuleEntity module = new ModuleEntity();
                module.setId(resultSet.getLong("module_id"));
                module.setName(resultSet.getString("module_name"));
                module.setEmployees(new ArrayList<>());
                do {
                    var employee = new EmployeeEntity();
                    employee.setId(resultSet.getLong("employeeid"));
                    employee.setName(resultSet.getString("employee_name"));
                    employee.setSalary(resultSet.getBigDecimal("employee_salary"));
                    var timestamp = resultSet.getTimestamp("employee_birthday");
                    if (timestamp != null) {
                        var birthday = timestamp.toInstant().atOffset(ZoneOffset.UTC);
                        employee.setBirthday(birthday);
                    }
                    module.getEmployees().add(employee);
                    hasNext = resultSet.next();
                }while ((hasNext) && (module.getId() == resultSet.getLong("module_id")));
                entities.add(module);
            }

        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return entities;
    }
}
