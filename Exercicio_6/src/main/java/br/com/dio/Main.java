package br.com.dio;

import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Set<User> users= new HashSet<User>();
        users.add(new User(1,"João"));
        users.add(new User(2,"Maria"));
        users.add(new User(3,"Guilherme"));
    }
}
