module com.wesley.r.gitdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.wesley.r.gitdemo to javafx.fxml;
    exports com.wesley.r.gitdemo;
}