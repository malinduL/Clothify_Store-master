package org.example.controller;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.fxml.FXMLLoader.load;

public class registrationController {
    private Parent parent;
    private Stage stage;
    private Scene scene;

    public void BackbtnRegistrationForm(ActionEvent actionEvent) throws IOException {
        parent= load(getClass().getResource("/view/login.fxml"));
        stage= (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(parent);

        stage.setScene(scene);
        stage.show();

    }

    public void ConfirmbtnRegistrationForm(ActionEvent actionEvent) throws IOException {
        parent= load(getClass().getResource("/view/login.fxml"));
        stage= (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(parent);

        stage.setScene(scene);
        stage.show();

    }
}
