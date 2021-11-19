public void reAttachPanel() {
    if ((panel) != null) {
        activity.detachPanel(panel);
        activity.attachPanel(panel);
    }
}