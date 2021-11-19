void changeSecondViewPosition() {
    com.nineoldandroids.view.ViewHelper.setY(secondView, dragView.getBottom());
    com.nineoldandroids.view.ViewHelper.setX(secondView, dragView.getLeft());
}