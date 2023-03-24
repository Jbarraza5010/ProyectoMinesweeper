module com.example.proyectominesweeper {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.proyectominesweeper to javafx.fxml;
    exports com.example.proyectominesweeper;
}