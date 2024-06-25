package org.example.controller;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.fxml.FXMLLoader.load;

public class LoginFormController {

    private Parent parent;
    private Stage stage;
    private Scene scene;
    public void forgotpassLoginform(ActionEvent actionEvent) throws IOException {
        parent= load(getClass().getResource("/view/fogotPassword.fxml"));
        stage= (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(parent);

        stage.setScene(scene);
        stage.show();

    }

    public void signupbtnLoginform(ActionEvent actionEvent) throws IOException {
        parent= load(getClass().getResource("/view/registration.fxml"));
        stage= (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(parent);

        stage.setScene(scene);
        stage.show();

    }

    public void loginbtnLoginform(ActionEvent actionEvent) throws IOException {
        parent= load(getClass().getResource("/view/clothifyHome.fxml"));
        stage= (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(parent);

        stage.setScene(scene);
        stage.show();

    }
}
