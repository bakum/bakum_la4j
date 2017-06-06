package net.bakum.costs;

public class OperationCenter extends CostCenter {
    public OperationCenter(String name) {
        super(name);
    }
    protected Nomenclature nomeclature;
    protected CostCenter destination;

    public void setNomeclature(Nomenclature nomeclature) {
        this.nomeclature = nomeclature;
    }

    public Nomenclature getNomeclature() {
        return nomeclature;
    }

    public void setDestination(CostCenter destination) {
        this.destination = destination;
    }

    public CostCenter getDestination() {
        return destination;
    }
}
