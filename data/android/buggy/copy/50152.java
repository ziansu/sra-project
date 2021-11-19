@java.lang.Override
public void setLayout(java.awt.LayoutManager l) {
    if (l instanceof java.awt.FlowLayout) {
        layout = ((java.awt.FlowLayout) (l));
        super.setLayout(l);
    }else {
        throw new java.awt.AWTError(("FlowScrollPane can have only FlowLayout, not " + l));
    }
}