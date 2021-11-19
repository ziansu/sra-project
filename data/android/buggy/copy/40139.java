@java.lang.Override
public void handle(javafx.event.ActionEvent event) {
    model.addNieuwSelectieWoord(toevoegField.getText());
    toevoegField.setText("");
}