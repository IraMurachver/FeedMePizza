package com.example.alienware.projectpizza.Objects;

/**
 * Created by Alienware on 11/22/2015.
 */
public class Topping {
    String Name;
    double priceFull;
    double PriceHalf;
    double PriceQuarter;
    boolean vegetarian;

    public Topping(String name, double priceFull, double priceHalf, double priceQuarter, boolean vegetarian) {
        Name = name;
        this.priceFull = priceFull;
        PriceHalf = priceHalf;
        PriceQuarter = priceQuarter;
        this.vegetarian = vegetarian;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPriceFull() {
        return priceFull;
    }

    public void setPriceFull(double priceFull) {
        this.priceFull = priceFull;
    }

    public double getPriceHalf() {
        return PriceHalf;
    }

    public void setPriceHalf(double priceHalf) {
        PriceHalf = priceHalf;
    }

    public double getPriceQuarter() {
        return PriceQuarter;
    }

    public void setPriceQuarter(double priceQuarter) {
        PriceQuarter = priceQuarter;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }
}

