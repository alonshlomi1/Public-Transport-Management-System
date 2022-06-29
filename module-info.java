module ASDF {
	requires javafx.controls;
	requires java.sql;
	requires javafx.fxml;
	requires javafx.graphics;
	requires java.desktop;
	requires java.mail;
	
	opens application to javafx.graphics, javafx.fxml;
}
