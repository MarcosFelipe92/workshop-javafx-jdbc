module workshop_javafx_jdbc {
	exports application;
	
	requires javafx.controls;
    requires javafx.fxml;
	requires javafx.base;
	requires transitive javafx.graphics;
	opens gui to javafx.fxml;
    exports gui;
}