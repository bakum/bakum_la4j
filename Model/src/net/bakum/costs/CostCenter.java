package net.bakum.costs;

import java.util.UUID;

public class CostCenter {
    public CostCenter(String name) {
        super();
        this.name = name;
        this.wbeg = 0.0;
        this.wend = 0.0;
        this.q_wbeg = 0.0;
        this.q_wend = 0.0;
        //this.uid = UUID.randomUUID().toString().replaceAll("-", "");
        this.sdc = SDC.QUANTITY;
    }
    protected String name; //Имя центра затрвт
    protected SDC sdc; //Схема распределения затрат
    protected AL al; //Слой (вид) учета
    protected Uc uc; //Единица калькуляции
    protected String account; //Счет учета
    protected double wbeg;
    protected double wend;
    protected double q_wbeg;
    protected double q_wend;
    protected String uid;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSDC(SDC SDC) {
        this.sdc = SDC;
    }

    public SDC getSDC() {
        return sdc;
    }

    public void setAL(AL AL) {
        this.al = AL;
    }

    public AL getAL() {
        return al;
    }

    public void setUC(Uc UC) {
        this.uc = UC;
    }

    public Uc getUC() {
        return uc;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccount() {
        return account;
    }

    public void setWbeg(double wbeg) {
        this.wbeg = wbeg;
    }

    public double getWbeg() {
        return wbeg;
    }

    public void setWend(double wend) {
        this.wend = wend;
    }

    public double getWend() {
        return wend;
    }

    public void setQ_wbeg(double q_wbeg) {
        this.q_wbeg = q_wbeg;
    }

    public double getQ_wbeg() {
        return q_wbeg;
    }

    public void setQ_wend(double q_wend) {
        this.q_wend = q_wend;
    }

    public double getQ_wend() {
        return q_wend;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUid() {
        return uid;
    }
}
