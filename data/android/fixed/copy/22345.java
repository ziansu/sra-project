private void setButtonStyle(final java.lang.String style, final boolean setStyle) {
    if (style == null) {
        return ;
    }
    if (setStyle) {
        button.setStyleName(style);
    }else {
        button.addStyleName(style);
    }
}