@java.lang.Override
public void handle(javafx.event.ActionEvent event) {
    app.AppModel.startQuiz(app.scene.LevelSelectScene._isReview, level);
}