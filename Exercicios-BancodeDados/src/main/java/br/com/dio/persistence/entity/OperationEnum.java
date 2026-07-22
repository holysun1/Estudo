package br.com.dio.persistence.entity;
import java.util.List;
import java.util.stream.Stream;
import br.com.dio.persistence.EmployeeService;

//CRIACAO DA CLASSE ENUM OPERATIONENUM
public enum OperationEnum {
    // OPERACOES VALIDAS DENTRO DA CLASSE
    INSERT,
    UPDATE,
    DELETE;
    //METODO ESTATICO - SEM NECESSIDADE DE CRIAR INSTANCIA
    //FINAL STRING - PARATEMTRO DE ENTRADA QUE NÃO TERA O VALOR SOBRESCRITO
    public static OperationEnum getByDbOperation(final String dbOperation){
        //RETORNARA
        return Stream.of(OperationEnum.values())
                .filter(o->o.name().startsWith(dbOperation.toUpperCase()))
                .findFirst()
                .orElseThrow();
    }


}
