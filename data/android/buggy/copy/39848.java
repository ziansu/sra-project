@java.lang.Override
public void handleStateChangeNotification(javafx.application.Preloader.StateChangeNotification evt) {
    if ((evt.getType()) == (javafx.application.Preloader.StateChangeNotification.Type.BEFORE_START)) {
        stage.hide();
    }
}