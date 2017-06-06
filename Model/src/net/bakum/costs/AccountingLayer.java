package net.bakum.costs;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.la4j.Matrix;
import org.la4j.Vector;
import org.la4j.matrix.DenseMatrix;
import org.la4j.vector.DenseVector;


public class AccountingLayer {
    public AccountingLayer() {
        super();
        InitializeLayer();
    }

    public AccountingLayer(Date date, String name) {
        super();
        InitializeLayer();
        this.date = date;
        this.name = name;
    }

    protected OperationCenter pc1;
    protected OperationCenter pc2;
    protected OperationCenter pc3;
    protected ProductionCenter cc23;
    protected OperationCenter cc20;
    protected OperationCenter cc91;
    protected ProduceCenter cc26;
    protected ProduceCenter cc25;
    protected ProduceCenter fail24;

    protected CostFlow pc1_20;
    protected CostFlow pc2_23;
    protected CostFlow pc3_91;
    protected CostFlow cc20_23;
    protected CostFlow cc23_20;
    protected CostFlow cc23_25;
    protected CostFlow cc25_23;
    protected CostFlow cc23_26;
    protected CostFlow cc26_23;
    protected CostFlow cc23_24;
    protected CostFlow cc91_23;
    private Date date;
    private String name;
    private String uid;
    private List<CostFlow> listFlow = new ArrayList<CostFlow>();
    private List<CostCenter> listCenters = new ArrayList<CostCenter>();

    private double t_prod; //Тариф производства продукции
    private double t12; //Тариф материалов в производстве
    private double t42; //Тариф готовой продукции в производстве
    private double t52; //Тариф полуфабрикатов в производстве

    protected void InitializeLayer() {

        uid = UUID.randomUUID()
                  .toString()
                  .replaceAll("-", "");
        pc1 = new OperationCenter("pc1");
        pc2 = new OperationCenter("pc2");
        pc3 = new OperationCenter("pc3");
        cc23 = new ProductionCenter("23");
        listCenters.add(cc23);
        cc20 = new OperationCenter("20");
        listCenters.add(cc20);
        cc91 = new OperationCenter("91");
        listCenters.add(cc91);
        cc26 = new ProduceCenter("26");
        listCenters.add(cc26);
        cc25 = new ProduceCenter("25");
        listCenters.add(cc25);
        fail24 = new ProduceCenter("24");

        pc1_20 = new CostFlow("PC1");
        pc1_20.setSource(pc1);
        pc1_20.setRecipient(cc20);
        listFlow.add(pc1_20);

        pc2_23 = new CostFlow("PC2");
        pc2_23.setSource(pc2);
        pc2_23.setRecipient(cc23);
        listFlow.add(pc2_23);

        pc3_91 = new CostFlow("PC3");
        pc3_91.setSource(pc3);
        pc3_91.setRecipient(cc91);
        listFlow.add(pc3_91);

        cc20_23 = new CostFlow("E20_23");
        cc20_23.setSource(cc20);
        cc20_23.setRecipient(cc23);
        listFlow.add(cc20_23);

        cc23_20 = new CostFlow("E23_20");
        cc23_20.setSource(cc23);
        cc23_20.setRecipient(cc20);
        listFlow.add(cc23_20);

        cc23_25 = new CostFlow("E23_25");
        cc23_25.setSource(cc23);
        cc23_25.setRecipient(cc25);
        listFlow.add(cc23_25);

        cc25_23 = new CostFlow("E25_23");
        cc25_23.setSource(cc25);
        cc25_23.setRecipient(cc23);
        listFlow.add(cc25_23);

        cc23_26 = new CostFlow("E23_26");
        cc23_26.setSource(cc23);
        cc23_26.setRecipient(cc26);
        listFlow.add(cc23_26);

        cc26_23 = new CostFlow("E26_23");
        cc26_23.setSource(cc26);
        cc26_23.setRecipient(cc23);
        listFlow.add(cc26_23);

        cc23_24 = new CostFlow("E23_24");
        cc23_24.setSource(cc23);
        cc23_24.setRecipient(fail24);
        listFlow.add(cc23_24);

        cc91_23 = new CostFlow("E91_23");
        cc91_23.setSource(cc91);
        cc91_23.setRecipient(cc23);
        listFlow.add(cc91_23);
    }

    public Matrix retrieveCoefficients() {
        double array[][] = new double[][] { { 1.0, 0.0, 0.0 }, { 0.0, 5.0, 0.0 }, { 0.0, 0.0, 9.0 } };
        
        return DenseMatrix.from2DArray(array);
    }
    
    public Vector retrieveVector() {
        double array[]= new double[] { 1.0, 0.0, 0.0 };
        
        return DenseVector.fromArray(array);
    }

    public List<CostFlow> retrieveRecipientsList(CostCenter cc) {
        List<CostFlow> list = new ArrayList<CostFlow>();
        Iterator<CostFlow> i = listFlow.iterator();

        while (i.hasNext()) {
            CostFlow o = i.next();
            if (o.getRecipient()
                 .getUid()
                 .matches(cc.getUid())) {
                list.add(o);
            }
        }
        return list;
    }

    public List<CostFlow> retrieveSourcesList(CostCenter cc) {
        List<CostFlow> list = new ArrayList<CostFlow>();
        Iterator<CostFlow> i = listFlow.iterator();

        while (i.hasNext()) {
            CostFlow o = i.next();
            if (o.getSource()
                 .getUid()
                 .matches(cc.getUid())) {
                list.add(o);
            }
        }
        return list;
    }

    public void setPc1(OperationCenter pc1) {
        this.pc1 = pc1;
    }

    public OperationCenter getPc1() {
        return pc1;
    }

    public void setPc2(OperationCenter pc2) {
        this.pc2 = pc2;
    }

    public OperationCenter getPc2() {
        return pc2;
    }

    public void setPc3(OperationCenter pc3) {
        this.pc3 = pc3;
    }

    public OperationCenter getPc3() {
        return pc3;
    }

    public void setCc23(ProductionCenter cc23) {
        this.cc23 = cc23;
    }

    public ProductionCenter getCc23() {
        return cc23;
    }

    public void setCc20(OperationCenter cc20) {
        this.cc20 = cc20;
    }

    public OperationCenter getCc20() {
        return cc20;
    }

    public void setCc91(OperationCenter cc91) {
        this.cc91 = cc91;
    }

    public OperationCenter getCc91() {
        return cc91;
    }

    public void setCc26(ProduceCenter cc26) {
        this.cc26 = cc26;
    }

    public ProduceCenter getCc26() {
        return cc26;
    }

    public void setCc25(ProduceCenter cc25) {
        this.cc25 = cc25;
    }

    public ProduceCenter getCc25() {
        return cc25;
    }

    public void setFail24(ProduceCenter fail24) {
        this.fail24 = fail24;
    }

    public ProduceCenter getFail24() {
        return fail24;
    }

    public void setPc1_20(CostFlow pc1_20) {
        this.pc1_20 = pc1_20;
    }

    public CostFlow getPc1_20() {
        return pc1_20;
    }

    public void setPc2_23(CostFlow pc2_23) {
        this.pc2_23 = pc2_23;
    }

    public CostFlow getPc2_23() {
        return pc2_23;
    }

    public void setPc3_91(CostFlow pc3_91) {
        this.pc3_91 = pc3_91;
    }

    public CostFlow getPc3_91() {
        return pc3_91;
    }

    public void setCc20_23(CostFlow cc20_23) {
        this.cc20_23 = cc20_23;
    }

    public CostFlow getCc20_23() {
        return cc20_23;
    }

    public void setCc23_20(CostFlow cc23_20) {
        this.cc23_20 = cc23_20;
    }

    public CostFlow getCc23_20() {
        return cc23_20;
    }

    public void setCc23_25(CostFlow cc23_25) {
        this.cc23_25 = cc23_25;
    }

    public CostFlow getCc23_25() {
        return cc23_25;
    }

    public void setCc25_23(CostFlow cc25_23) {
        this.cc25_23 = cc25_23;
    }

    public CostFlow getCc25_23() {
        return cc25_23;
    }

    public void setCc23_26(CostFlow cc23_26) {
        this.cc23_26 = cc23_26;
    }

    public CostFlow getCc23_26() {
        return cc23_26;
    }

    public void setCc26_23(CostFlow cc26_23) {
        this.cc26_23 = cc26_23;
    }

    public CostFlow getCc26_23() {
        return cc26_23;
    }

    public void setCc23_24(CostFlow cc23_24) {
        this.cc23_24 = cc23_24;
    }

    public CostFlow getCc23_24() {
        return cc23_24;
    }

    public void setCc91_23(CostFlow cc91_23) {
        this.cc91_23 = cc91_23;
    }

    public CostFlow getCc91_23() {
        return cc91_23;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUid() {
        return uid;
    }

    public double getT_prod() {
        return t_prod;
    }

    public double getT12() {
        return t12;
    }

    public double getT42() {
        return t42;
    }

    public double getT52() {
        return t52;
    }
}
