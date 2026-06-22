package br.com.dio;

import java.util.Objects;

import static java.util.Objects.isNull;

public class User {
    private int ID;
    private String name;

    public User(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("{'id': %d, 'name': %s}", ID, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
            //Verificação de obj, se for igual já retorna true
        }
        if (isNull(obj) || (!(obj instanceof User))) {
            //Dupla verificação para não ter duplicadas
            return false;
        }
        return  ((User) obj).ID == this.ID && Objects.equals(((User) obj).name, this.name);
        //
    }
}
