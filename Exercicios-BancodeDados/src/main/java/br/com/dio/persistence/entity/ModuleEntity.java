package br.com.dio.persistence.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ModuleEntity {
    private long id;
    private String name;
    private List<EmployeeEntity> employees;
}
