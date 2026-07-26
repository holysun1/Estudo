package br.com.dio;
import br.com.dio.persistence.ConnectionUtil;
import br.com.dio.persistence.EmployeeAuditDAO;
import br.com.dio.persistence.EmployeeConsoleUI;
import br.com.dio.persistence.EmployeeDAO;
import br.com.dio.persistence.entity.EmployeeEntity;
import org.flywaydb.core.Flyway;
import net.datafaker.Faker;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Stream;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private final static EmployeeDAO employeeDAO = new EmployeeDAO();
    private final static EmployeeAuditDAO employeeAuditDAO = new EmployeeAuditDAO();
    private final static Faker faker = new Faker(Locale.of("pt","BR"));
    public static void main(String[] args) {
// 🟢 Silencia logs informativos do Flyway (só mostra se for WARNING ou SEVERE)
//    java.util.logging.Logger.getLogger("org.flywaydb").setLevel(java.util.logging.Level.WARNING);

        Flyway flyway = Flyway
                .configure()
                //.dataSource("jdbc:mysql://localhost:3306/estudos_fk", "root", "896095")
                //REFATORAR
                .dataSource(ConnectionUtil.URL,ConnectionUtil.User,ConnectionUtil.Password)
                .baselineOnMigrate(true)
                .load();
        flyway.migrate();

// ========================= LOGS DO FLYWAY APARECEM ANTES ====================
        // 2. 🟢 Força a entrega de todos os logs e espera 200 milissegundos
        System.out.flush();
        System.err.flush();
        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
       var entities = Stream.generate(() -> {
            var employee = new EmployeeEntity();
            employee.setName(faker.name().fullName());
            employee.setSalary(new BigDecimal(faker.number().digits(4)));
            employee.setBirthday(OffsetDateTime.of(faker.date().birthdayLocalDate(18,50), LocalTime.MIN, ZoneOffset.UTC));
            return employee;
        }).limit(2500).toList();
        employeeDAO.insertBatch(entities);

        // 3. Só agora abre a interface
// ========================= LOGS DO FLYWAY APARECEM ANTES ====================
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- Banco de dados inicializado ---");
        System.out.println("\n===================================================================================\n");

// AULA BUSCANDO DADOS COM SELECT - MÓDULO 2 - MINUTO 8:38
        employeeDAO.findAll().forEach(System.out::println);
        System.out.println("\n===================================================================================\n");
        //employeeDAO.findById(1).ifPresent(System.out::println);
        //System.out.println("\n===================================================================================\n");
        //employeeDAO.delete(2);
        //employeeDAO.findAll().forEach(System.out::println);
        int a = 12;
        for (int i = 0 ; i <= a ; i++){

        }

        EmployeeConsoleUI ui = new EmployeeConsoleUI();
        int opcao = 0;
        while(opcao != 5) {
        System.out.println("\n Digite o numero da opcao desejada: ");
        System.out.println("\n1. Menu Insert\n2. Menu Update\n3. Menu Delete\n4. Menu Audit \n5. Sair\n");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    ui.exibirMenuInsert();
                    break;
                case 2:
                    ui.exibirMenuUpdate();
                    break;
                case 3:
                    ui.exibirDeleteMenu();
                    break;
                case 4:
                    ui.exibirMenuAudit();
                case 5:
                    break;
                default:
                    System.out.println("Escolha uma opçcao valida.\n1. Menu Insert\n2. Menu Update");
            }
        }

        System.out.println("\n===================================================================================\n");


    }

}
