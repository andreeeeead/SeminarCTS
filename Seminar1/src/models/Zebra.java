package models;

public class Zebra extends Animal{

    public Zebra(String name) {
        super(name);
    }

    @Override
    public void walking() {
        System.out.println("The zebra is walking...");
    }
}
