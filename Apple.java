package mainPackage;

import bsu.rfe.java.group8.lab1.Leonenko.varA11.Food;

public class Apple extends Food {

    private String size;

    public String getSize(){
        return size;
    }

    public Apple(String size){
        super ("Apple");
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + " size '" + size.toUpperCase() + "'";  
    }
}
