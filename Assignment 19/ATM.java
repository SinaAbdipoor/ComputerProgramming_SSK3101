package ssk3101_assignment19;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * THE EXACT OPPOSITE OF CLEAN AND EFFICIENT EVEN FOR THIS SMALL PROJECT. HOW TO
 * DO IT CLEANER?
 *
 * @author sinaa
 */
public class ATM extends Application {

    static ArrayList<BankAccount> accounts;

    /**
     * @param args: go to Properties -> Run and add these VM options:
     * --module-path "\path\to\javafx-sdk-15.0.1\lib" --add-modules
     * javafx.controls,javafx.fxml
     */
    public static void main(String[] args) {
        accounts = new ArrayList<>();
        accounts.add(new BankAccount("Sina", 672012504));
        accounts.add(new BankAccount("Razali", 720306875));
        accounts.add(new BankAccount("Johnny", 541401596));
        accounts.add(new BankAccount("Jack", 272047127));
        accounts.add(new BankAccount("Bil", 196630857));
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //Display at the top
        TextArea taDisplay = new TextArea("Step 1: Please select your account "
                + "number");
        taDisplay.setEditable(false);
        //Output display
        TextField tfInput = new TextField();
        tfInput.setEditable(false);
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        Button b5 = new Button("5");
        Button b6 = new Button("6");
        Button b7 = new Button("7");
        Button b8 = new Button("8");
        Button b9 = new Button("9");
        Button b0 = new Button("0");
        Button bBalance = new Button("Balance");
        Button bDeposit = new Button("Deposit");
        Button bWithdraw = new Button("Withdraw");
        Button bClear = new Button("Clear");
        ComboBox<Long> cbAccounts = new ComboBox<>();

        VBox vBox = new VBox();
        vBox.setPadding(new Insets(10, 10, 10, 10));
        vBox.setSpacing(20);
        //10 buttons
        GridPane gPane = new GridPane();
        gPane.setHgap(5);
        gPane.setVgap(5);
        gPane.add(b1, 0, 0);
        gPane.add(b2, 1, 0);
        gPane.add(b3, 2, 0);
        gPane.add(b4, 0, 1);
        gPane.add(b5, 1, 1);
        gPane.add(b6, 2, 1);
        gPane.add(b7, 0, 2);
        gPane.add(b8, 1, 2);
        gPane.add(b9, 2, 2);
        gPane.add(b0, 1, 3);
        b1.setOnAction((event) -> {
            tfInput.setText(tfInput.getText() + "1");
        });
        b2.setOnAction((event) -> {
            tfInput.setText(tfInput.getText() + "2");
        });
        b3.setOnAction((event) -> {
            tfInput.setText(tfInput.getText() + "3");
        });
        b4.setOnAction((event) -> {
            tfInput.setText(tfInput.getText() + "4");
        });
        b5.setOnAction((event) -> {
            tfInput.setText(tfInput.getText() + "5");
        });
        b6.setOnAction((event) -> {
            tfInput.setText(tfInput.getText() + "6");
        });
        b7.setOnAction((event) -> {
            tfInput.setText(tfInput.getText() + "7");
        });
        b8.setOnAction((event) -> {
            tfInput.setText(tfInput.getText() + "8");
        });
        b9.setOnAction((event) -> {
            tfInput.setText(tfInput.getText() + "1");
        });
        b0.setOnAction((event) -> {
            tfInput.setText(tfInput.getText() + "0");
        });
        //Buttons
        GridPane gPane1 = new GridPane();
        gPane1.setVgap(5);
        gPane1.add(bBalance, 0, 0);
        gPane1.add(bDeposit, 0, 1);
        gPane1.add(bWithdraw, 0, 2);
        gPane1.add(bClear, 0, 3);
        bBalance.setOnAction((event) -> {
            int selectedIndex = cbAccounts.getSelectionModel().getSelectedIndex();
            if (selectedIndex == -1) {
                taDisplay.appendText("\nERROR: You need to select your account first");
            } else {
                taDisplay.appendText("\n" + accounts.get(selectedIndex).getName()
                        + ", your current balance is: RM"
                        + accounts.get(selectedIndex).getBalance());
            }
        });
        bDeposit.setOnAction((event) -> {
            int selectedIndex = cbAccounts.getSelectionModel().getSelectedIndex();
            if (selectedIndex == -1 || tfInput.getText().isEmpty()) {
                taDisplay.appendText("\nERROR: Make sure you have selected your"
                        + " account and inserted the amount");
            } else {
                try {
                    accounts.get(selectedIndex).deposit(Double.parseDouble(tfInput.getText()));
                    taDisplay.appendText("\nYou have deposited successfully");
                } catch (IllegalArgumentException iae) {
                    taDisplay.appendText("\nERROR: " + iae.getMessage());
                }
            }
        });
        bWithdraw.setOnAction((event) -> {
            int selectedIndex = cbAccounts.getSelectionModel().getSelectedIndex();
            if (selectedIndex == -1 || tfInput.getText().isEmpty()) {
                taDisplay.appendText("\nERROR: Make sure you have selected your"
                        + " account and inserted the amount");
            } else {
                try {
                    accounts.get(selectedIndex).withdraw(Double.parseDouble(tfInput.getText()));
                    taDisplay.appendText("\nYou have withdrawn successfully");
                } catch (IllegalArgumentException iae) {
                    taDisplay.appendText("\nERROR: " + iae.getMessage());
                }
            }
        });
        bClear.setOnAction((event) -> {
            tfInput.clear();
        });
        //Putting all the bottons in an HBox
        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);
        hBox.setSpacing(50);
        hBox.getChildren().addAll(gPane, gPane1);
        //ComboBox for accounts        
        for (BankAccount ba : accounts) {
            cbAccounts.getItems().add(ba.getAccountNo());
        }
        cbAccounts.setOnAction(((event) -> {
            taDisplay.appendText("\nSelected account number: "
                    + cbAccounts.getValue() + "\nHi "
                    + accounts.get(cbAccounts.getSelectionModel().getSelectedIndex()).getName()
                    + "\nStep 2: Now you can check your balance, deposit, or withdraw");
        }));
        HBox hBox1 = new HBox();
        hBox1.setAlignment(Pos.CENTER);
        hBox1.setSpacing(10);
        hBox1.getChildren().addAll(new Label("Account Number:"), cbAccounts);
        vBox.getChildren().addAll(taDisplay, tfInput, hBox, hBox1);
        stage.setTitle("ATM Prototype");
        stage.setScene(new Scene(vBox, 500, 500));
        stage.show();
    }
}
