@java.lang.Override
public java.awt.Dimension getPreferredSize() {
    java.awt.Dimension d = super.getPreferredSize();
    if (thumbDim != null)
        d.width = thumbDim.width;
    
    return d;
}