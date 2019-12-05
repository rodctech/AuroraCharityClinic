package finalProject;

import java.sql.Connection;
import java.sql.ResultSet;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Callback;

public class ShowEmployees extends Application {

    static String SQL = "SELECT * from EMPLOYEE ";  //CUSTOMER
    static Connection c;

    //TABLE VIEW AND DATA
    static ObservableList<ObservableList> data;

    static TableView tableview;

    //MAIN EXECUTOR
    public static void main(String[] args) {
        launch(args);
    }

    //CONNECTION DATABASE
    public static void buildData() {
        // Connection c;
        data = FXCollections.observableArrayList();
        try {
            c = ConnectionEstablishment.gettingConnected();


            ResultSet result = c.createStatement().executeQuery(SQL);


            //Columns dynamically added
            for (int i = 0; i < result.getMetaData().getColumnCount(); i++) {

                final int j = i;
                TableColumn columnCall = new TableColumn(result.getMetaData().getColumnName(i + 1));
                columnCall.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ObservableList, String>, ObservableValue<String>>() {
                    public ObservableValue<String> call(TableColumn.CellDataFeatures<ObservableList, String> param) {
                        return new SimpleStringProperty(param.getValue().get(j).toString());
                    }
                });

                tableview.getColumns().addAll(columnCall);
                System.out.println("Column [" + i + "] ");
            }

            /**
             * ******************************
             * Data added to ObservableList *
             *******************************
             */
            while (result.next()) {
                //Iterate Row
                ObservableList<String> row = FXCollections.observableArrayList();
                for (int i = 1; i <= result.getMetaData().getColumnCount(); i++) {
                    //Iterate Column
                    row.add(result.getString(i));

                }


                System.out.println("Row added " + row);
                data.add(row);

            }

            //Add items to TableView
            tableview.setItems(data);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("TableView Scene generated an Error");
        }
    }

    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("Low Stock Inventory Report");


        //TableView
        tableview = new TableView();
        tableview.setMinWidth(1150);

        AnchorPane anchor = new AnchorPane();
        HBox hbox = new HBox(tableview);
        anchor.getChildren().add(hbox);
        hbox.setPadding(new Insets(55, 10, 10, 10));
        anchor.setRightAnchor(hbox, 55.0);
        // VBox vbox = new VBox();
        // BorderPane border = new BorderPane(vbox);
        //vbox.setMinHeight(400);
        //vbox.setMinWidth(200);
        // border.setStyle("-fx-background-color: blue;");
        // border.setCenter(vbox);
        // anchor.getChildren().add(border);
        // anchor.setLeftAnchor(vbox, 95.0);
        //anchor.setTopAnchor(vbox, 55.0);  //35.0
        // vbox.setPadding(new Insets(35, 10, 10, 10));
        //vbox.setStyle("-fx-background-color: red;");
        // Button btn = new Button("Submit");
        //vbox.getChildren().add(btn);

        buildData();
        //Main Scene
        Scene scene = new Scene(anchor, 1300, 600);  //1200, 800

        stage.setScene(scene);
        stage.show();

    }
}