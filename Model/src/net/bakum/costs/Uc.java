package net.bakum.costs;

public class Uc {
    protected String unit;
    protected Nomenclature nomenclatire;

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }

    public void setNomenclatire(Nomenclature nomenclatire) {
        this.nomenclatire = nomenclatire;
    }

    public Nomenclature getNomenclatire() {
        return nomenclatire;
    }
}
