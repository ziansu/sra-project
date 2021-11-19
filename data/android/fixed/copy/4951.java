@javafx.fxml.FXML
private void stop_button_handler(javafx.event.ActionEvent event) {
    if (true == (run_Thread)) {
        run_Thread = false;
        while (false == (done_Thread));
        tiva.disconnect();
    }
}