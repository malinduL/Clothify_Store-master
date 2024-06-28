package org.example.controllers;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.fxml.FXMLLoader.load;

public class EmployeeController {
    private Stage stage;
    private Parent parent;
    private Scene scene;


    public void backbtnEmployeeform(ActionEvent actionEvent) throws IOException {
        parent= load(getClass().getResource("/view/employeeDashboardForm.fxml"));
        stage= (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(parent);

        stage.setScene(scene);
        stage.show();

    }

    public void ClearbtnEmployeeform(ActionEvent actionEvent) throws IOException {
        parent= load(getClass().getResource("/view/employeeRegistration.fxml"));
        stage= (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(parent);

        stage.setScene(scene);
        stage.show();

    }

    public void SavebtnEmployeeform(ActionEvent actionEvent) throws IOException {
        parent= load(getClass().getResource("/view/employeeRegistration.fxml"));
        stage= (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(parent);

        stage.setScene(scene);
        stage.show();




    }
}
