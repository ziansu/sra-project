private void setButtonStyle(final java.lang.String style, final boolean setStyle) {
    if (null != style) {
        if (setStyle) {
            button.setStyleName(style);
        }else {
            button.addStyleName(style);
        }
    }
}