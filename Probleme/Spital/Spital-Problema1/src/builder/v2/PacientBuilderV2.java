package builder.v2;

import builder.models.AbstractBuilder;
import builder.models.Pacient;

public class PacientBuilderV2 implements AbstractBuilder {
    private String numePacient;
    private boolean arePatRabatabil;
    private boolean areMicDejun;
    private boolean arePapuci;
    private boolean areHalat;

    public PacientBuilderV2(String numePacient) {
        this.numePacient = numePacient;
    }

    public PacientBuilderV2 setNumePacient(String numePacient) {
        this.numePacient = numePacient;
        return this;
    }

    public PacientBuilderV2 setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
        return this;
    }

    public PacientBuilderV2 setAreMicDejun(boolean areMicDejun) {
        this.areMicDejun = areMicDejun;
        return this;
    }

    public PacientBuilderV2 setArePapuci(boolean arePapuci) {
        this.arePapuci = arePapuci;
        return this;
    }

    public PacientBuilderV2 setAreHalat(boolean areHalat) {
        this.areHalat = areHalat;
        return this;
    }

    @Override
    public Pacient build() {
        return new Pacient(numePacient, arePatRabatabil, areMicDejun, arePapuci, areHalat);
    }
}
