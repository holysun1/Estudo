package br.com.dio;

import br.com.dio.mapper.UserMapper;
import br.com.dio.model.UserModel;
import br.com.dio.dto.UserDTO;
import org.mapstruct.factory.Mappers;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final UserMapper mapper = Mappers.getMapper(UserMapper.class);

    public static void main(String[] args) {
        var model = new UserModel();
        model.setUsername("Mario");
        model.setCode(1);
        model.setBirthday(LocalDate.now().minusYears(30));
        System.out.println(mapper.toDTO(model));

        var dto = new UserDTO();
        dto.setName("Joao");
        dto.setId(2);
        model.setBirthday(LocalDate.now().minusYears(25));
        System.out.println(mapper.toModel(dto));
    }
}