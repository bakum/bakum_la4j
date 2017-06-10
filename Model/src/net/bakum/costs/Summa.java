package net.bakum.costs;

public class Summa {
    public Summa() {
        super();
        this.sum = 0.0;
        this.sumBase = 0.0;
        /*         this.currency = Currency.UAH;
        this.baseCurrency = Currency.UAH;
        this.rate = 1.0; */
    }
    
    public Summa(double summa, Currency val) {
        super();
        this.sum = summa;
        this.currency = val;
    }
    
    protected double sum;
    protected double sumBase;
    protected double rate;
    protected Currency currency;
    protected Currency baseCurrency;

    public void setSum(double sum) {
        this.sum = sum;
        this.sumBase = sum * this.rate;
    }

    public double getSum() {
        return sum;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setBaseCurrency(Currency baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public Currency getBaseCurrency() {
        return baseCurrency;
    }

    public void setSumBase(double sumBase) {
        this.sumBase = sumBase;
    }

    public double getSumBase() {
        return sumBase;
    }
}
