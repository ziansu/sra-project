public synchronized void setLabelText() {
    java.lang.String text = textSources.get().getMessage();
    com.klazen.StreamMarquee.LOG.info("Setting new label text to: {}", text);
    lbl.setText(text);
}