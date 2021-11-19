@javafx.fxml.FXML
public void initialize() {
    com.aremy.simplyREST.objects.PropertiesManager propertiesManager = com.aremy.simplyREST.objects.PropertiesManager.instance();
    proxyHost.setText(propertiesManager.proxyHost);
    proxyPort.setText(java.lang.String.valueOf(propertiesManager.proxyPort));
    proxyLogin.setText(propertiesManager.proxyLogin);
    proxyPassword.setText(propertiesManager.proxyPassword);
}