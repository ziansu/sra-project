@java.lang.Override
public void handle(javafx.event.ActionEvent event) {
    if (!(toevoegField.getText().isEmpty())) {
        model.addNieuwSelectieWoord(toevoegField.getText());
        toevoegField.setText("");
    }
}