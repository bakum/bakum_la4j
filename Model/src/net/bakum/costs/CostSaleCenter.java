package net.bakum.costs;

public class CostSaleCenter extends CostCenter {
    public CostSaleCenter(String name) {
        super(name);
    }
    
    protected Nomenclature nomenclature;
    protected Manager manager;

    public void setNomenclature(Nomenclature nomenclature) {
        this.nomenclature = nomenclature;
    }

    public Nomenclature getNomenclature() {
        return nomenclature;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Manager getManager() {
        return manager;
    }
}
