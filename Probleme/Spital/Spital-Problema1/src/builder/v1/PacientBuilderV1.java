package builder.v1;

import builder.models.AbstractBuilder;
import builder.models.Pacient;

public class PacientBuilderV1 implements AbstractBuilder {
    private Pacient pacient;

    public PacientBuilderV1(String numePacient) {
        this.pacient = new Pacient(numePacient);
    }

    public PacientBuilderV1 setNumePacient(String numePacient) {
        this.pacient.setNumePacient(numePacient);
        return this;
    }

    public PacientBuilderV1 setArePatRabatabil(boolean arePatRabatabil) {
        this.pacient.setArePatRabatabil(arePatRabatabil);
        return this;
    }

    public PacientBuilderV1 setAreMicDejun(boolean areMicDejun) {
        this.pacient.setAreMicDejun(areMicDejun);
        return this;
    }

    public PacientBuilderV1 setArePapuci(boolean arePapuci) {
        this.pacient.setArePapuci(arePapuci);
        return this;
    }

    public PacientBuilderV1 setAreHalat(boolean areHalat) {
        this.pacient.setAreHalat(areHalat);
        return this;
    }

    @Override
    public Pacient build() {
        return this.pacient;
    }
}
