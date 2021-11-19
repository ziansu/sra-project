public java.lang.String getFoundSentence() {
    java.lang.String label = zildo.fwk.ui.UIText.getGameText(("automatic." + (name())));
    if (label.startsWith("automatic.")) {
        return null;
    }
    return label;
}