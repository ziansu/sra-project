public void handle(javafx.event.ActionEvent event) {
    if ((project6.MastermindFX.cursorColor) != "Gray") {
        button.pegInput = project6.PegCreator.pegConstructor(project6.MastermindFX.cursorColor);
        button.redraw();
        project6.MastermindFX.cursorColor = "Gray";
        project6.MastermindFX.aiDecoderScene.setCursor(javafx.scene.Cursor.DEFAULT);
    }
}