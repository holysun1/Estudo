package br.com.dio.persistence;

import br.com.dio.persistence.entity.EmployeeEntity;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class EmployeeConsoleUI {
    private final EmployeeService employeeService = new EmployeeService();
    private final Scanner scanner = new Scanner(System.in);
    public void exibirMenuUpdate(){
        System.out.println("\n---Menu Update---\n");
        List<EmployeeEntity> funcionarios = employeeService.findAll();
        funcionarios.forEach(System.out::println);
        System.out.println("---Qual o ID do funcionario que deseja Atualizar?\n");
        long id = scanner.nextLong();
        scanner.nextLine(); //limpeza de buffer do teclado
        Optional<EmployeeEntity> employeeOptional = employeeService.findById(id);
        if (employeeOptional.isEmpty()) {
            System.out.println("\nFuncionario com ID: " + id + " não foi encontrado.");
            return;
        }
        EmployeeEntity employee = employeeOptional.get();
        System.out.printf("ID: %d, Nome:%s, Salario:%s, Data de Nascimento:%s%n",
                employee.getId(),employee.getName(),employee.getSalary(),employee.getBirthday());
        System.out.println("\n---Qual dado gostaria de atualizar?");
        System.out.println("\n 1. Nome\n 2. Salario\n 3. Aniversario");
        int opcao = scanner.nextInt();
        scanner.nextLine(); //limpeza de buffer do teclado
        switch(opcao){
            case 1:
                System.out.println("Digite o Novo Nome");
                String name = scanner.nextLine();
                employee.setName(name);
                break;
            case 2:
                System.out.println("Digite o Novo Salario");
                BigDecimal salary = scanner.nextBigDecimal();
                employee.setSalary(salary);
                break;
            case 3:
                System.out.println("Digite a nova data de Nascimento (ex:2002-07-14)");
                String birthday = scanner.nextLine();
                // FORMATAÇÃO DA DATA DE ANIVERSARIO
                OffsetDateTime dataNascimento = OffsetDateTime.parse(birthday + "T00:00:00Z");
                employee.setBirthday(dataNascimento);
                break;
            default:
                System.out.println("Digite um número do menu.");
        }try{
            employeeService.update(employee);
            System.out.println("Os dados do funcionário foram atualizados.\n");
            System.out.printf("ID: %d, Nome:%s, Salario:%s, Data de Nascimento:%s%n",
                    employee.getId(),employee.getName(),employee.getSalary(),employee.getBirthday());
        }catch(Exception e){
            System.out.println("\n Erro ao atualizar: " + e.getMessage());
        }
    }

    public void exibirMenuInsert(){
        EmployeeEntity newEmployee = new EmployeeEntity();
        System.out.println("\n---Menu Cadastro---\n");
        System.out.println("Digite o nome do Novo Usuario");
        String nome = scanner.nextLine();
        newEmployee.setName(nome);
        System.out.println("Digite o novo salario");
        BigDecimal salary =  scanner.nextBigDecimal();
        scanner.nextLine(); // Limpeza de Buffer após BIGDECIMAL
        newEmployee.setSalary(salary);
        System.out.println("Digite o novo data de Nascimento (ex:2002-07-14)");
        String birthdayInput = scanner.nextLine();
        OffsetDateTime dataNasc = OffsetDateTime.parse(birthdayInput + "T00:00:00Z");
        newEmployee.setBirthday(dataNasc);
        try{
            employeeService.insert(newEmployee);
            System.out.printf("Adicionando....%n Nome:%s, Salario:%s%n,  Data de Nascimento:%s%n",
                    newEmployee.getName(),newEmployee.getSalary(),newEmployee.getBirthday());
            try{
                Thread.sleep(1200);
            System.out.println("\n Novo Funcionario Cadastrado com sucesso!\n");;
            System.out.println("\n===================================================================================\n");
            List<EmployeeEntity> employees = employeeService.findAll();
            employees.forEach(System.out::println);
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
                System.out.println("O processo de inserção foi interrompido.");
            }
        }catch(Exception e){
            System.out.println("\nErro ao cadastrar." + e.getMessage());
            System.out.println("\n===================================================================================\n");

        }

    }

    public void exibirDeleteMenu(){
        System.out.println("\n---Menu Delete---\n");
        List<EmployeeEntity> funcionarios = employeeService.findAll();
        funcionarios.forEach(System.out::println);
        System.out.println("Digite o numero do ID que sera deletado.\n" );
        long id = scanner.nextLong();
        scanner.nextLine();
        Optional<EmployeeEntity> employeeOptional = employeeService.findById(id);
        if (employeeOptional.isEmpty() ) {
            System.out.println("ID não encontrado na tabela.\n");
        }else{
            EmployeeEntity employee = employeeOptional.get();
            System.out.printf("Deletar:%n ID: %d, Nome:%s, Salario:%s,%n Data de Nascimento:%s%n",
            id,employee.getName(),employee.getSalary(),employee.getBirthday());
            System.out.println("1. Sim\n2. Nao\n");
            int opcao = scanner.nextInt();
            switch(opcao) {
                case 1:
                    System.out.printf("Deletando....%nID: %d, Nome:%s, Salario:%s%n,  Data de Nascimento:%s%n",
                    employee.getId(),employee.getName(),employee.getSalary(),employee.getBirthday());
                    try {
                        Thread.sleep(1200); // Pequena pausa dramática para o usuário ver o que está acontecendo
                        System.out.println("\nFuncionario deletado com sucesso!\n");
                        // 6. Executa a deleção através do Service
                        employeeService.delete(id);
                        List<EmployeeEntity> funcionariosAtt = employeeService.findAll();
                        funcionariosAtt.forEach(System.out::println);
                        System.out.println("\nVoltando ao menu\n");
                        System.out.println("\n===================================================================================\n");

                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        System.out.println("🔴 O processo de deleção foi interrompido.");
                    }
                    break;
                case 2:
                    System.out.println("Voltando ao menu\n");
                    System.out.println("\n===================================================================================\n");

                    break;
                default:
                    System.out.println("Digite um numero valido.\n1. Sim\n2. Nao\n");

        }

        }


    }
}
