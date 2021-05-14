package builder.main;

import builder.models.RezervareBuilder;

public class BuilderMain {
    public static void main(String[] args) {
        System.out.println(new RezervareBuilder("Gigel")
                .setAsezareLaGeam(true)
                .setAreMuzicaPersonalizata(true)
                .setGenMuzica("jazz")
                .build());
        System.out.println(new RezervareBuilder("Gigica").build());
        System.out.println(new RezervareBuilder("Ionel")
                .setAreScauneErgonomice(true)
                .setEsteDecorataMasa(true)
                .build());
    }
}
