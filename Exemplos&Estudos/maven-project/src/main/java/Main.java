import br.com.dio.dto.UserDTO;
import br.com.dio.mapper.UserMapper;
import br.com.dio.model.UserModel;
import org.mapstruct.factory.Mappers;

import java.time.LocalDate;

public class Main {

    private static final UserMapper mapper = Mappers.getMapper(UserMapper.class);

    public static void main(String[] args) {

        var model = new UserModel();
        model.setCode(1);
        model.setUserName("James");
        model.setBirthdate(LocalDate.now().minusDays(20));
        System.out.println("===================\n");
        System.out.println(mapper.toModel(model));

        System.out.println("===================\n");


        var dto = new UserDTO();
        dto.setId(2);
        dto.setName("Daniel");
        dto.setBirthdate(LocalDate.now().minusYears(30));

        System.out.println(mapper.toModel(dto));

        }


}
