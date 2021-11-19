void hide() {
    identityEdit.setVisible(false);
    if (layoutWindow.getChildren().contains(identityEdit)) {
        layoutWindow.getChildren().remove(identityEdit);
    }
}