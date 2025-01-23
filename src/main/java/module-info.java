module org.calma.test_git {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.calma.test_git to javafx.fxml;
    exports org.calma.test_git;
}