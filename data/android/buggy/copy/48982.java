public synchronized void setLabelText() {
    java.lang.String text = textSources.get(0).getMessage();
    com.klazen.StreamMarquee.LOG.info("Setting new label text to: {}", text);
    lbl.setText(text);
}