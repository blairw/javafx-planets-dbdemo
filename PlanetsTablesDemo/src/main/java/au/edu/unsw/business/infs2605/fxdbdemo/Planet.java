/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package au.edu.unsw.business.infs2605.fxdbdemo;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Blair
 */
public class Planet {
    private final StringProperty planetName;
    private final StringProperty planetRadiusInKm;

    public Planet(String planetName, int planetRadiusInKm) {
        this.planetName = new SimpleStringProperty(planetName);
        this.planetRadiusInKm = new SimpleStringProperty(planetRadiusInKm + "");
    }
    
    public StringProperty planetNameProperty() {
        return planetName;
    }
    
    public StringProperty planetRadiusInKmProperty() {
        return planetRadiusInKm;
    }

    public String getPlanetName() {
        return planetName.get();
    }

    public String getPlanetRadiusInKm() {
        return planetRadiusInKm.get();
    }
    

    public void setPlanetName(String planetName) {
        this.planetName.set(planetName);
    }

    public void setPlanetRadiusInKm(int planetRadiusInKm) {
        this.planetRadiusInKm.set(planetRadiusInKm + "");
    }

    @Override
    public String toString() {
        return "Planet{" + "planetName=" + planetName + ", planetRadiusInKm=" + planetRadiusInKm + '}';
    }
}
