package br.com.dio;
import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main{
    public static void main(String[] args) {
        // Apontando direto para o seu banco da imagem: estudos_fk
        String url = "jdbc:mysql://localhost:3306/estudos_fk";
        String usuario = "root";

        // Coloque aqui a senha que você configurou quando instalou o MySQL Workbench
        String senha = "896095";

        try (Connection conn = DriverManager.getConnection(url, usuario, senha)) {
            if (conn != null) {
                System.out.println("Conectado ao banco 'estudos_fk' com sucesso!");
                Statement stmt = conn.createStatement();

                                System.out.println("\n--- LISTA DE CLIENTES NO BANCO ---");

                // 2. Vamos fazer o mesmo 'SELECT * FROM cliente' que esta na linha 15 da sua imagem
                String sqlSelecionar = "SELECT id, nome, idade, rg FROM cliente";
                ResultSet rs = stmt.executeQuery(sqlSelecionar);

                // O ResultSet é como uma tabela virtual. Avançamos linha por linha com o .next()
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String nome = rs.getString("nome");
                    int idade = rs.getInt("idade");
                    String rg = rs.getString("rg");

                    System.out.printf("ID: %d | Nome: %-10s | Idade: %d | RG: %s%n", id, nome, idade, rg);
                }

                String sqlInserir = "INSERT INTO cliente (nome, idade, rg) VALUES ('Vitor', 36, '98765')";
                stmt.execute(sqlInserir);
                System.out.println("Cliente Vitor cadastrado via Java!");
                String sqlSelecionar2 = "SELECT id, nome, idade, rg FROM cliente";
                ResultSet rs2 = stmt.executeQuery(sqlSelecionar2);
                while (rs2.next()) {
                    int id = rs2.getInt("id");
                    String nome = rs2.getString("nome");
                    int idade = rs2.getInt("idade");
                    String rg = rs2.getString("rg");
                    System.out.printf("ID: %d | Nome: %-10s | Idade: %d | RG: %s%n", id, nome, idade, rg);

                }
                String sqlProcurar = "SELECT id, nome, idade, rg FROM cliente  WHERE nome = 'Vitor'";
                ResultSet rsProcurar = stmt.executeQuery(sqlProcurar);
                while(rsProcurar.next()) {
                    System.out.println("Achei o Vitor de ID: " + rsProcurar.getInt("id"));
                }

                String sqlAtualizar = "UPDATE cliente SET nome ='VITOR SILVA' WHERE id = 6";
                stmt.execute(sqlAtualizar);
                System.out.println("Cliente atualizado com sucesso!");
                String sqlBuscarAtualizado = "SELECT id, nome, idade, rg FROM cliente WHERE id = 6";
                ResultSet rs3 = stmt.executeQuery(sqlBuscarAtualizado);
                if(rs3.next()){
                System.out.printf("Cliente: %-15s | ID: %d%n", rs3.getString("nome"), rs2.getInt("id"));
                }

                String sqlDeletar = "DELETE FROM cliente WHERE id between 8 and 15";
                stmt.execute(sqlDeletar);
                System.out.println("Cliente deletado com sucesso!\n");
                System.out.println("==============================\n");
                String sqlSelecionar3 = "SELECT id, nome, idade, rg FROM cliente";
                stmt.executeQuery(sqlSelecionar3);
                ResultSet rs4 = stmt.executeQuery(sqlSelecionar3);
                while (rs4.next()) {
                    int id = rs4.getInt("id");
                    String nome = rs4.getString("nome");
                    int idade = rs4.getInt("idade");
                    String rg = rs4.getString("rg");

                    System.out.printf("ID: %d | Nome: %-10s | Idade: %d | RG: %s%n", id, nome, idade, rg);
                }
            }
        } catch (Exception e) {
            System.out.println("Erro de conexão ou SQL: " + e.getMessage());
        }
    }
}