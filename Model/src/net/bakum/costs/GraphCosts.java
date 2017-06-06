package net.bakum.costs;

import java.util.ArrayList;
import java.util.List;

public class GraphCosts {
    
    private static List<AccountingLayer> layers = new ArrayList<AccountingLayer>();
    
    
    public GraphCosts() {
        super();
    }

    public static void setLayers(List<AccountingLayer> layers) {
        GraphCosts.layers = layers;
    }

    public static List<AccountingLayer> getLayers() {
        return layers;
    }
    
    public static void addLayer(AccountingLayer layer){
            layers.add(layer);
        }
    
    public static void clearsLayers(){
            layers.clear();
        }
}
