package br.com.dio;

import br.com.dio.domain.Contact;
import br.com.dio.domain.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static br.com.dio.domain.ContactType.EMAIL;
import static br.com.dio.domain.ContactType.PHONE;
import static br.com.dio.domain.Sex.MALE;
import static br.com.dio.domain.Sex.FEMALE;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //criação de nova lista utilizando a função generateUsers
        List<User> users = new ArrayList<>(generateUsers());
        //utilizado para ordenar em ordem crescente ou decrescente
        users.sort(Comparator.comparing(User::age));
        //para cada usuario gerado, impressao na tela
        users.forEach(System.out::println);
    }
    private static List<User> generateUsers() {
        var contacts1 = List.of(
                new Contact("(12)99548-5748",PHONE),
                new Contact("joao@joao.com.br",EMAIL)
        );
        var contacts2 = List.of(
                new Contact("(15)99485-7584",PHONE),
                new Contact("gabriel@gabriel.com.br",EMAIL)
        );
        var contacts3 = List.of(
                new Contact("(11)99548-4875",PHONE),
                new Contact("vitor@vitor.com.br",EMAIL)
        );
        var user1 = new User("Joao" , 22,MALE, new ArrayList<>(contacts1));
        var user2 = new User("Gabriel" , 25,MALE, new ArrayList<>(contacts2));
        var user3 = new User("Vitor" , 36,MALE, new ArrayList<>(contacts3));
       return List.of(user1, user2, user3);
    }

}