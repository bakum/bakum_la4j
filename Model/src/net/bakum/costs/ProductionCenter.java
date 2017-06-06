package net.bakum.costs;

public class ProductionCenter extends CostCenter {
    public ProductionCenter(String name) {
        super(name);
        this.account = "23";
    }
    protected Division division;
    protected NomenclatureGroup nomenclatureGroup;
    protected ProdType productionType;

    public void setDivision(Division Division) {
        this.division = Division;
    }

    public Division getDivision() {
        return division;
    }

    public void setNomenclatureGroup(NomenclatureGroup NomenclatureGroup) {
        this.nomenclatureGroup = NomenclatureGroup;
    }

    public NomenclatureGroup getNomenclatureGroup() {
        return nomenclatureGroup;
    }

    public void setProductionType(ProdType ProductionType) {
        this.productionType = ProductionType;
    }

    public ProdType getProductionType() {
        return productionType;
    }
}
