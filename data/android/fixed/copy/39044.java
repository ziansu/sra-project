public void messegeFieldAction(javafx.event.ActionEvent actionEvent) {
    java.lang.String message = messegeField.getText();
    engine.sendMsg(message);
    messegeField.setText("");
}