module org.example.school_manager {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.school_manager to javafx.fxml;
    exports org.example.school_manager;
}