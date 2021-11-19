@java.lang.Override
public void set(java.lang.Object obj, java.lang.String fieldName, java.lang.Integer value) {
    displayedValue = value;
    if ((progressBar) != null) {
        progressBar.repaint();
    }
}