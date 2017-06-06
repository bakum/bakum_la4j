package net.bakum.costs;

public class ProduceCenter extends CostCenter {
    public ProduceCenter(String name) {
        super(name);
    }
    public ProduceCenter(String name, String acc) {
        super(name);
        this.account = acc;
    }
    protected Nomenclature nomenclature;
    protected String warehouse;

    public void setNomenclature(Nomenclature nomenclature) {
        this.nomenclature = nomenclature;
    }

    public Nomenclature getNomenclature() {
        return nomenclature;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public String getWarehouse() {
        return warehouse;
    }
}
