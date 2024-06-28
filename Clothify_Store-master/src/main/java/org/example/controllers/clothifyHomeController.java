package org.example.controllers;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import static javafx.fxml.FXMLLoader.load;

public class clothifyHomeController {
    private Stage stage;
    private Scene scene;
    private Parent parent;
    public void logoutbtnHomeform(ActionEvent actionEvent) throws IOException {
        parent= load(getClass().getResource("/view/login.fxml"));
        stage= (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(parent);

        stage.setScene(scene);
        stage.show();

    }

    public void EmployerbtnClothifyHome(ActionEvent actionEvent) throws IOException {
        parent= load(getClass().getResource("/view/employeeRegistration.fxml"));
        stage= (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(parent);

        stage.setScene(scene);
        stage.show();
    }


    public void OrderDebtnClothifyHome(ActionEvent actionEvent) throws IOException {
        parent= load(getClass().getResource("/view/Orderdetails.fxml"));
        stage= (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(parent);

        stage.setScene(scene);
        stage.show();
    }

    public void SalesReportbtnClothifyHome(ActionEvent actionEvent) throws IOException {
        parent= load(getClass().getResource("/view/SalesReport.fxml"));
        stage= (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(parent);

        stage.setScene(scene);
        stage.show();

    }

    public void SupplierbtnClothifyHomeForm(ActionEvent actionEvent) throws IOException {
        parent= load(getClass().getResource("/view/Supplier.fxml"));
        stage= (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(parent);

        stage.setScene(scene);
        stage.show();

    }

    public void SalesReturnbtnClothifyHome(ActionEvent actionEvent) throws IOException {
        parent= load(getClass().getResource("/view/SalesReturn.fxml"));
        stage= (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(parent);

        stage.setScene(scene);
        stage.show();

    }

    public void ItembtnClothifyHome(ActionEvent actionEvent) throws IOException {
        parent= load(getClass().getResource("/view/item.fxml"));
        stage= (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(parent);

        stage.setScene(scene);
        stage.show();

    }


    public void OrderbtnClothifyHome(ActionEvent actionEvent) throws IOException {
        parent= load(getClass().getResource("/view/Order.fxml"));
        stage= (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(parent);

        stage.setScene(scene);
        stage.show();
    }
}
