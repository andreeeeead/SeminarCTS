package main;

import factory_method.AnestezistFactory;
import factory_method.AsistentFactory;
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

        System.out.println(new AsistentFactory().createInstance("Ionel"));
        System.out.println(new AnestezistFactory().createInstance("Ioana"));
    }
}
