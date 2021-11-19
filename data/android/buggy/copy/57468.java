@java.lang.Override
public java.awt.Rectangle getBounds(java.awt.Rectangle rv) {
    rv.setBounds(jmri.util.MathUtil.rectangle2DToRectangle(layoutEditor.getBounds()));
    return rv;
}