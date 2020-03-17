# javafx-planets-dbdemo
This is a very simple demo of how to work with a SQLite database in a JavaFX setting.

## Significant files
1. `App.java` - JavaFX main class.
1. `DatabaseManager.java` - helper class to manage the SQLite JDBC connection so that no other class has to.
1. `Planet.java` - MVC "model" class.
1. `primary.fxml` - MVC "view" file.
1. `PrimaryController.java` - MVC "controller" class.

## Significant parts of `DatabaseManager.java`
1. `openConnection()` and `closeConnection()` are just convenient wrappers around the JDBC open/close connection cycle.
1. `createTheOnlyTableWeNeed()` and `setupDummyData()` perform the two steps required for initial setup. The first one uses a `Statement` and the second one uses multiple instances of `PreparedStatement`, so they are a great demonstration of the difference between the two. They are only used if required, by...
1. `setupDatabaseOnFirstRun()`, which first checks if the database is already there.
1. `fetchPlanetByName(...)`, the method invoked by the GUI when the user clicks the **Retrieve Size** button.

## What does the program actually do?
1. On first launch, we set up a database of planets and their sizes (see `DatabaseManager.setupDatabaseOnFirstRun()`).
1. Users can type some text and attempt to retrieve the size for the planet of the same name.
1. If the planet exists, they get the size (radius of planet in km).
1. If the planet does not exist, the user is told that no data is available.

![Good run](docs/goodrun.png)

![Bad run](docs/badrun.png)


## See also

- [infs2605fxstarterkit](https://github.com/blairw/infs2605fxstarterkit), the template from which this project was built up.