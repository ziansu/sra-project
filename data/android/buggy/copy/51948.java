public java.lang.Boolean setChooseDrawings(javax.swing.JComboBox<java.lang.String> combo) {
    boolean test = true;
    if (test || (m_Trace)) {
        java.lang.System.out.println("DrawingView::setChooseDrawings() BEGIN");
    }
    m_chooseDrawings = combo;
    return true;
}