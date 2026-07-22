package br.com.dio.persistence;
import br.com.dio.persistence.entity.EmployeeAuditEntity;
import br.com.dio.persistence.entity.OperationEnum;
import java.sql.SQLException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import static java.time.ZoneOffset.UTC;
import static java.util.Objects.isNull;

public class EmployeeAuditDAO {
    // CRIAR METODO PUBLICO DE BUSCA DE HISTORICO DA VIEW DA AUDITORIA
    public List<EmployeeAuditEntity> findAllAudit() {
    List<EmployeeAuditEntity> entities = new ArrayList<>();
    // CRIA LISTA DO EMPLOYEEAUDITYENTITY COM AS VARIÁVEIS DEFINIDAS PELA CLASSE
        //ATRIBUI O NOME DA LISTA DE ENTITIES E FAZ A CRIAÇÃO DA NOVA LISTA
    String sql = "SELECT * FROM view_employee_audit";
    //COMANDO DO SQL QUE SERÁ EXECUTADO
                try (
    //VARIÁVEL DE CONEXÃO PARA A CONECTAR AO BANCO DE DADOS - SQL
    var connection = ConnectionUtil.getConnection();
    //CRIA O OBJETO JDBC QUE EXECUTA A QUEY ESTÁTICA NO BANCO
    var statement = connection.createStatement();
    // COMANDO CRIADO , EXECUTAR A QUERY NO SQL - STRING SQL
    var resultSet = statement.executeQuery(sql);
                ) {
            //ENQUANTO O RESULTSET.NEXT() FOR VERDADEIRO, O LOOP É VERDADEIRO
        while (resultSet.next()) {
            //TRATAMENTO PARA TRATAMENTO DE NULLPOINTER - CONVERTE O TIMESTAMP SQL PARA OFFSETDATETIME 
            var birthday = isNull(resultSet.getTimestamp("birthday")) ? null :
                    OffsetDateTime.ofInstant(resultSet.getTimestamp("birthday").toInstant(),UTC);
            var oldBirthday = isNull(resultSet.getTimestamp("old_birthday")) ? null :
                    OffsetDateTime.ofInstant(resultSet.getTimestamp("old_birthday").toInstant(),UTC);
            //ADICIONAR DADOS A NOVA LISTA
            entities.add(new EmployeeAuditEntity(
                    // PARA CADA RESULTSET - DADO DA CLASSE EMPLOYEEAUDITENTITY
                    resultSet.getLong("employee_id"),
                    resultSet.getString("name"),
                    resultSet.getString("old_name"),
                    resultSet.getBigDecimal("salary"),
                    resultSet.getBigDecimal("old_salary"),
                    birthday,
                    oldBirthday,
            OperationEnum.getByDbOperation(resultSet.getString("operation"))
            ));
        }
        //TRATAMENTO DE EXCEÇÃO - TRY/CATCH
    } catch (SQLException | ClassNotFoundException ex) {
        ex.printStackTrace();
    }//RETURNAR A LISTA CRIADA COM A AUDIT
                return entities;
}
}
