package factory_method.main;

import factory_method.factory.*;
import factory_method.simple_factory.SimpleFactory;
import factory_method.simple_factory.TipSupa;

public class FMMain {
    public static void main(String[] args) {
        System.out.println("Factory Method");
        System.out.println(new SupaLegumeFactory().createInstance("legume"));
        System.out.println(new SupaCiuperciFactory().createInstance("ciuperci"));
        System.out.println(new SupaVitaFactory().createInstance("vita"));
        System.out.println(new SupaPuiFactory().createInstance("pui"));

        System.out.println("Simple factory");
        SimpleFactory simpleFactory = new SimpleFactory();
        System.out.println(simpleFactory.createInstance(TipSupa.SUPA_CIUPERCI, "Ciuperci"));
        System.out.println(simpleFactory.createInstance(TipSupa.SUPA_VITA, "Vita"));
    }
}
