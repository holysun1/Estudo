package br.com.dio.domain;

import java.util.List;

public record  User(String name, int age, Sex gender, List<Contact> contacts) {
    @Override
    public String toString() {
        //Criação de nova string temporária sb
        StringBuilder sb = new StringBuilder();
        //concatenção e formatação da nova string
        sb.append(String.format("Nome: %s | Idade: %d | Sexo: %s\n", name,age,gender));
        for (Contact c : contacts) {
            //nova concatenação a string existe para acrescentar mais dados
            sb.append(String.format(" -> %s (%s)\n",c.description(),c.type()));
        }
        //retorno da string temporária sb
        return sb.toString();
    }
}
