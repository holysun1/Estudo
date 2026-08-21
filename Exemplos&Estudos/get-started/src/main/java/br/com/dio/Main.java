package br.com.dio;

import br.com.dio.domain.User;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, User> users = new HashMap<>();
        users.put("joao@joao", new User("joao",22));
        users.put("maria@maria", new User("maria",23));
        users.put("claudio@claudio", new User("claudio",25));
        users.put("leo@leo", new User("leo",17));

        users.forEach((k,v)-> System.out.printf("key: %s | value %s \n",k,v));
        System.out.println("=============");
        System.out.println("Remover user: claudio@claudio, name: Claudio , age: 25");
        System.out.println(users.remove("claudio@claudio", new User("claudio",25)));
        users.keySet().forEach(System.out::println);
        System.out.println("=============");
        System.out.println(users);
        System.out.println("=============");
        System.out.println(users.get("claudio@claudio"));
    }
}