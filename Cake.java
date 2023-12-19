package mainPackage;

import bsu.rfe.java.group8.lab1.Leonenko.varA11.Food;

public class Cake extends Food {

    private String icing;

    public String getSize(){
        return size;
    }

    public Cake(String icing){
        super ("Cake");
        this.icing = icing;
    }

    @Override
    public String toString() {
        return super.toString() + " icing '" + icing.toUpperCase() + "'";
    }
}
