package net.bakum.costs;

public class CostFlow {
    public CostFlow() {
        super();
        this.sum = new Summa();
        this.quantity = 0.0;
    }
    
    public CostFlow(String name) {
        super();
        this.sum = new Summa();
        this.quantity = 0.0;
        this.name = name;
    }
    
    protected String name;
    protected Element element; //Элемент затрат
    protected Item item;    //Статья затрат
    protected CostCenter source;
    protected CostCenter recipient;
    protected Uc uc;
    
    protected double quantity;
    protected Summa sum;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setElement(Element element) {
        this.element = element;
    }

    public Element getElement() {
        return element;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return item;
    }

    public void setSource(CostCenter source) {
        this.source = source;
    }

    public CostCenter getSource() {
        return source;
    }

    public void setRecipient(CostCenter recipient) {
        this.recipient = recipient;
    }

    public CostCenter getRecipient() {
        return recipient;
    }

    public void setUc(Uc uc) {
        this.uc = uc;
    }

    public Uc getUc() {
        return uc;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setSum(Summa sum) {
        this.sum = sum;
    }

    public Summa getSum() {
        return sum;
    }
}
