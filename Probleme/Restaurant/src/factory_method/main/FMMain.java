package factory_method.main;

import factory_method.factory.*;

public class FMMain {
    public static void main(String[] args) {
        System.out.println(new SupaLegumeFactory().createInstance("legume"));
        System.out.println(new SupaCiuperciFactory().createInstance("ciuperci"));
        System.out.println(new SupaVitaFactory().createInstance("vita"));
        System.out.println(new SupaPuiFactory().createInstance("pui"));
    }
}
