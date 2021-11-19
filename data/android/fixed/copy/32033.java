public void setParent(javafx.scene.layout.Pane newParent) {
    if ((parent) == newParent) {
        return ;
    }
    parent = newParent;
    newParent.getChildren().add(getRoot());
}