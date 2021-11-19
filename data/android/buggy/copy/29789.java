public javafx.scene.paint.ImagePattern getAgentAtGoalImage() {
    java.lang.String path = ("/resources/" + (theme)) + (agentAtGoal);
    return new javafx.scene.paint.ImagePattern(new javafx.scene.image.Image(path));
}