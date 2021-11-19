public org.jebtk.math.matrix.AnnotationMatrix addToHistory(java.lang.String name, java.lang.String description, org.jebtk.math.matrix.AnnotationMatrix matrix, int selectedIndex) {
    if (matrix == null) {
        return null;
    }
    return addToHistory(new org.jebtk.math.ui.matrix.transform.MatrixTransform(this, name, description, matrix), selectedIndex);
}