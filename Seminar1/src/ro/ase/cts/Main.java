package ro.ase.cts;

import models.Animal;
import models.Giraffe;
import models.Zebra;
import models.Zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Animal zebra1 = new Zebra("Gigica");
        Animal zebra2 = new Zebra("Monica");

        Animal giraffe1 = new Giraffe("Marian");
        Animal giraffe2 = new Giraffe("Maricica");

        zoo.addAnimal(giraffe1);
        zoo.addAnimal(giraffe2);

        zoo.addAnimal(zebra1);
        zoo.addAnimal(zebra2);

        zoo.feedAllAnimals();
        zoo.walkingAnimals();
    }
}
