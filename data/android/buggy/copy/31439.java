public void setOverdueTab(javafx.scene.Node value) {
    javafx.scene.image.Image icon = new javafx.scene.image.Image("/main/resources/images/upcomingIcon.fw.png");
    javafx.scene.image.ImageView iconView = new javafx.scene.image.ImageView(icon);
    overdueNotify.setText("11");
    overdueTab.setContent(value);
}