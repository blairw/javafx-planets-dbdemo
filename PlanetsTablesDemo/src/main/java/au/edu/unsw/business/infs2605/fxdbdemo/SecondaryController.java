package au.edu.unsw.business.infs2605.fxdbdemo;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class SecondaryController {

    @FXML
    private TableView<Planet> tblPlanets;
    
    @FXML
    private TableColumn<Planet, String> colPlanetName;
    
    @FXML
    private TableColumn<Planet, String> colPlanetSize;
    
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    
    @FXML
    private void initialize() {
        tblPlanets.setItems(DatabaseManager.getCurrentPlanetData());
        
        // Initialize the person table with the two columns.
        colPlanetName.setCellValueFactory(cellData -> cellData.getValue().planetNameProperty());
        colPlanetSize.setCellValueFactory(cellData -> cellData.getValue().planetRadiusInKmProperty());
    }
}