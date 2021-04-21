package main;

import simple_factory.SimpleFactory;
import models.PersonalMedical;
import simple_factory.TipPersonalMedical;

public class Main {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        PersonalMedical medic = simpleFactory.createInstance(TipPersonalMedical.MEDIC, "Gigel");
        PersonalMedical asistent = simpleFactory.createInstance(TipPersonalMedical.ASISTENT, "Gigica");
        System.out.println(medic);
        System.out.println(asistent);
    }
}
