module com.example.home_git_fixes {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.home_git_fixes to javafx.fxml;
    exports com.example.home_git_fixes;
}
