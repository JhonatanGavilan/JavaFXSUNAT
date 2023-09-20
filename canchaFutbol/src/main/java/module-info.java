module sunat.gob.pe.canchafutbol {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens sunat.gob.pe.canchafutbol to javafx.fxml;
    exports sunat.gob.pe.canchafutbol;
}
