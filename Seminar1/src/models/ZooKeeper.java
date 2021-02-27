package models;

public class ZooKeeper {
    private String name;

    public ZooKeeper(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void feed(Animal animal) {
        System.out.println("The zoo keeper " + this.name + " feeds the animal " + animal.getName());

    }
}
