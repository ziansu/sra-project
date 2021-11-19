private void hidePopup() {
    if (layoutWindow.getChildren().contains(qrcode)) {
        layoutWindow.getChildren().remove(qrcode);
    }
    qrcode.setVisible(false);
}