package br.com.dio.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
@Data //Gera GETTERS, SETTERS, TOSTRING, EQUALS E HASHCODE
@NoArgsConstructor // FORÇA A CRIAÇÃO DO CONSTRUTOR VAZIO
@AllArgsConstructor // CRIA UM CONSTRUTOR COM TODOS OS CAMPOS
public class ContactEntity {
    private long id;
    private String description;
    private String type;
    private OffsetDateTime birthday;
    private Long employeeId;
}
