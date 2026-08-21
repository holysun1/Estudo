package br.com.dio.persistence;

import br.com.dio.persistence.entity.EmployeeAuditEntity;
import br.com.dio.persistence.entity.EmployeeEntity;

import java.util.List;
import java.util.Optional;


public class EmployeeService {
    private final EmployeeDAO employeeDAO = new EmployeeDAO();
    private final EmployeeAuditDAO employeeAuditDAO = new EmployeeAuditDAO();

    public List<EmployeeEntity>findAll(){
        return employeeDAO.findAll();
    }

    public List<EmployeeAuditEntity>findAllAudit(){
        return employeeAuditDAO.findAllAudit();
    }
    public Optional<EmployeeEntity> findById(long id){
        return employeeDAO.findById(id);
    }
    public void update(EmployeeEntity entity){
        employeeDAO.update(entity);
    }


    public void insert(EmployeeEntity entity){
        if(entity.getName() == null || entity.getName().isBlank()){
            throw new IllegalArgumentException();
        };
        employeeDAO.insert(entity);
    }
    public void delete(long entity){
        employeeDAO.delete(entity);
    }
}
