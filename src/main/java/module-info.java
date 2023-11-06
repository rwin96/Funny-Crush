module com.example.candytesttesttest {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.datatransfer;

    opens com.example.candytesttesttest to javafx.fxml;
    exports com.example.candytesttesttest;
}