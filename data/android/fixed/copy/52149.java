private void setCenterPanel() {
    scrollPane.setPrefSize(800, 800);
    scrollPane.setMaxSize(java.lang.Double.MAX_VALUE, java.lang.Double.MAX_VALUE);
    scrollPane.autosize();
    scrollPane.setVbarPolicy(javafx.scene.control.ScrollPane.ScrollBarPolicy.AS_NEEDED);
    scrollPane.setHbarPolicy(javafx.scene.control.ScrollPane.ScrollBarPolicy.AS_NEEDED);
}