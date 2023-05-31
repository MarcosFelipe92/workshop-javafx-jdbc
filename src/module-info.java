module workshop_javafx_jdbc {
	exports application;
	
	requires javafx.controls;
    requires javafx.fxml;
	requires javafx.base;
	requires transitive javafx.graphics;
	requires java.sql;
	
	opens gui to javafx.fxml;
    exports gui;
    
    opens model.entities to javafx.fxml;
    exports model.entities;
    
    opens model.services to javafx.fxml;
    exports model.services;
    
    opens gui.listeners to javafx.fxml;
    exports gui.listeners;
}