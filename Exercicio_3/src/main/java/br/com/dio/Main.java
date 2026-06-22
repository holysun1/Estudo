package br.com.dio;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        List <User> users = List.of(new User("Maria", 21), new User("Joao", 22)
        , new User("Ana", 19), new User("Eduardo", 32));
        //printStringValue(User::name, users);
        printStringValue(Record::toString, users);
    }

    private static void printStringValue(Function<User,String> callback, List<User> users) {
        users.forEach(u -> System.out.println(callback.apply(u)));
    }

}
