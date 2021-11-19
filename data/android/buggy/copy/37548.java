public static java.lang.String getRoutingKey() {
    java.lang.System.out.println(app.MainController.routingKeyField.getText());
    return app.MainController.routingKeyField.getText().equals("") ? null : app.MainController.routingKeyField.getText();
}