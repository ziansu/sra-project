@java.lang.Override
public void setEnabled(boolean b) {
    if (isCurrentLocation) {
        enabled = false;
        showAnnotation();
    }else {
        enabled = b;
    }
    if ((annotation) != null) {
        annotation.setEnabled(b);
    }
}