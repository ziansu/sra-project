@com.google.appinventor.components.annotations.DesignerProperty(editorType = com.google.appinventor.components.common.PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN, defaultValue = "True")
@com.google.appinventor.components.annotations.SimpleProperty(description = "Sets whether or not to display the slider thumb.", userVisible = true)
public void ThumbEnabled(boolean enabled) {
    thumbEnabled = enabled;
    int alpha = (thumbEnabled) ? 255 : 0;
    seekbar.getThumb().mutate().setAlpha(alpha);
    seekbar.setEnabled(thumbEnabled);
}