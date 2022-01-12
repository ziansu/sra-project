public void setTasks(java.lang.String tasks) {
    lblTaskTitle.setText(((org.openstreetmap.josm.gui.SplashScreen.SplashScreenProgressRenderer.LABEL_HTML) + tasks));
    lblTaskTitle.setCaretPosition(lblTaskTitle.getDocument().getLength());
    repaint();
}