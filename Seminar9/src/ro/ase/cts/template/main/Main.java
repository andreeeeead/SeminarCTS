package ro.ase.cts.template.main;

import ro.ase.cts.template.models.Masa;
import ro.ase.cts.template.models.MasaBar;
import ro.ase.cts.template.models.TemplateOcupareMasa;

public class Main {
    public static void main(String[] args) {
        TemplateOcupareMasa masa = new Masa(3);
        TemplateOcupareMasa masaBar = new MasaBar(5);
        masa.ocupaMasa();
        masaBar.ocupaMasa();
    }
}
