public void handle(javafx.stage.WindowEvent we) {
    misc.log.Logger.log(LogLevel.INFO, gui.controller.MainviewController.class, "Window closed by user, stopping application");
    javafx.application.Platform.exit();
    st.close();
}