@org.apache.felix.dm.annotation.api.Start
void start() {
    java.lang.System.out.println("Dashboard started");
    javafx.application.Platform.runLater(() -> createUI());
}