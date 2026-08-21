package br.com.dio.persistence;

import br.com.dio.persistence.entity.ContactEntity;
import br.com.dio.persistence.entity.EmployeeAuditEntity;
import br.com.dio.persistence.entity.EmployeeEntity;

import java.util.List;
import java.util.Optional;


public class ContactService {
    private final ContactDAO contactDAO = new ContactDAO();

    public void insert(ContactEntity entity){
        if(entity.getDescription() == null || entity.getDescription().isBlank()){
            throw new IllegalArgumentException();
        };
        contactDAO.insertContact(entity);
    }
}
