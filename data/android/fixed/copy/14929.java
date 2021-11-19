public void toggleServerMenuText() {
    if (serverItem.getText().equals("Start a Server")) {
        serverItem.setText("Stop the Server");
    }else {
        serverItem.setText("Start a Server");
    }
}