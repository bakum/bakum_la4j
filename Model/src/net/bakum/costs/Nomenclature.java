package net.bakum.costs;

import java.util.UUID;

public class Nomenclature {
    public Nomenclature(String name) {
        super();
        this.name = name;
        this.uid = UUID.randomUUID().toString().replaceAll("-", "");
    }
    
    public Nomenclature(String name, String uid) {
        super();
        this.name = name;
        this.uid = uid;
    }
    
    protected String name;
    protected String uid;

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
}
