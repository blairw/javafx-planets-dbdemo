package au.edu.unsw.business.infs2605.fxdbdemo;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML
    TextField txtPlanetName;
    
    @FXML
    Label lblPlanetInfo;
    
    @FXML
    Label lblPlanetRadius;
    
    @FXML
    Label lblKm;
    
    @FXML
    protected void initialize() {
        lblPlanetInfo.setText("");
        lblPlanetRadius.setText("");
        lblKm.setText("");
    }
    
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
    @FXML
    private void btnRetrieveSizeWasClicked() {
        String planetName = txtPlanetName.getText();
        Planet myPlanet = DatabaseManager.fetchPlanetByName(planetName);
        if (myPlanet == null) {
            lblPlanetInfo.setText("Sorry, no data available.");
            lblPlanetRadius.setText("");
            lblKm.setText("");
        } else {
            lblPlanetInfo.setText("The radius of " + myPlanet.getPlanetName() + " is");
            lblPlanetRadius.setText(myPlanet.getPlanetRadiusInKm() + "");
            lblKm.setText("km");
        }
    }
}
