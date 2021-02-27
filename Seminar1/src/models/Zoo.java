package models;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private ZooKeeper zooKeeper;
    private List<Animal> animals;

    public Zoo() {
        this.zooKeeper = new ZooKeeper("Gigel");
        this.animals = new ArrayList<>();
    }

    public Zoo(ZooKeeper zooKeeper, List<Animal> animals) {
        this.zooKeeper = zooKeeper;
        this.animals = animals;
    }

    public ZooKeeper getZooKeeper() {
        return zooKeeper;
    }

    public void setZooKeeper(ZooKeeper zooKeeper) {
        this.zooKeeper = zooKeeper;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public void feedAllAnimals() {
        for (Animal animal: this.animals) {
            this.zooKeeper.feed(animal);
        }
    }

    public void walkingAnimals() {
        for (Animal animal:animals) {
            animal.walking();
        }
    }
}
