public void start(javafx.stage.Stage primaryStage) {
    this.stage = primaryStage;
    initMenus();
    initComponents();
    this.stage.show();
    this.controller.viewInitComplete();
    update();
}