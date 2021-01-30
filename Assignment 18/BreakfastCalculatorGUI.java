package ssk3101_assignment18;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author sinaa
 */
public class BreakfastCalculatorGUI extends Application {

    /**
     * @param args: go to Properties -> Run and add these VM options:
     * --module-path "\path\to\javafx-sdk-15.0.1\lib" --add-modules
     * javafx.controls,javafx.fxml
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane bPane = new BorderPane();
        //The top VBox part
        VBox vBox1 = new VBox();
        vBox1.getChildren().addAll(new Label("GS12345"), new Label("Sina"));
        vBox1.setSpacing(10);
        vBox1.setPadding(new Insets(5, 5, 5, 5));
        vBox1.setStyle("-fx-border-color: green");
        bPane.setTop(vBox1);
        //The center GridPane part
        GridPane gPane = new GridPane();
        TextField tfNasiLemak = new TextField();
        TextField tfCoffee = new TextField();
        TextField tfMuffin = new TextField();
        gPane.add(new Label("Price (RM)"), 1, 0);
        gPane.add(new Label("Nasi Lemak"), 0, 1);
        gPane.add(tfNasiLemak, 1, 1);
        gPane.add(new Label("Coffee"), 0, 2);
        gPane.add(tfCoffee, 1, 2);
        gPane.add(new Label("Muffin"), 0, 3);
        gPane.add(tfMuffin, 1, 3);
        gPane.setPadding(new Insets(5, 5, 5, 5));
        gPane.setStyle("-fx-border-color: green");
        gPane.setHgap(50);
        gPane.setVgap(20);
        bPane.setCenter(gPane);
        //The bottom VBox
        VBox vBox2 = new VBox();
        CheckBox cbGst = new CheckBox("GST (6%)");
        Button bTotal = new Button("Total");
        TextField tfOutput = new TextField("Please fill in ALL the prices, then"
                + " click on 'Total' to see the total price.");
        tfOutput.setEditable(false);
        vBox2.getChildren().addAll(cbGst, bTotal, tfOutput);
        vBox2.setSpacing(20);
        vBox2.setPadding(new Insets(5, 5, 5, 5));
        vBox2.setStyle("-fx-border-color: green");
        bPane.setBottom(vBox2);
        //Clicking button
        bTotal.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                double nl, c, m, total;
                try {
                    nl = Double.parseDouble(tfNasiLemak.getText());
                    c = Double.parseDouble(tfCoffee.getText());
                    m = Double.parseDouble(tfMuffin.getText());
                    total = cbGst.isSelected() ? 1.06 * (nl + c + m) : nl + c + m;
                    tfOutput.setText(String.format("Total Price: RM%.2f", total));
                } catch (NumberFormatException nfe) {
                    tfOutput.setText("Seriously? How difficult is it to enter "
                            + "some NUMBERS? Try again.");
                }
            }
        });
        stage.setTitle("Breakfast Menu Calculator");
        stage.setScene(new Scene(bPane, 400, 400));
        stage.show();
    }

}
