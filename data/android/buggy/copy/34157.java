public java.lang.Boolean setFileField(javax.swing.JTextField field) {
    boolean test = true;
    if (test || (m_Trace)) {
        java.lang.System.out.println("DrawingView::setFileField() BEGIN");
    }
    m_filename = field;
    return true;
}