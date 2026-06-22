package br.com.dio;

public class PetMachine {
    private boolean clean;
    private int water;
    private int shampoo;
    private Pet pet;
    public void takeAShower(){
        if(this.pet == null){
            System.out.println("Coloque o pet na máquina para iniciar o banho");
            return;
        }
        pet.setClean(true);
    }

}
