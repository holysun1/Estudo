package br.com.dio.persistence.entity;

import lombok.*;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;


@Data //Gera GETTERS, SETTERS, TOSTRING, EQUALS E HASHCODE
@NoArgsConstructor // FORÇA A CRIAÇÃO DO CONSTRUTOR VAZIO
@AllArgsConstructor // CRIA UM CONSTRUTOR COM TODOS OS CAMPOS
public class EmployeeEntity {

    private long id;
    private String name;
    private OffsetDateTime birthday;
    private BigDecimal salary;

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "id= " + id +
                ", name= " + name +
                ", birthday= " + formatOffsetDateTime(this.birthday) +
                ", salary= " + salary +
                '}';
    }

    public String formatOffsetDateTime(final OffsetDateTime dateTime) {
        var utcDatetime = dateTime.withOffsetSameInstant(ZoneOffset.UTC);
        return utcDatetime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

    }
}
