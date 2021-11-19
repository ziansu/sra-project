@java.lang.Override
public java.awt.Dimension getPreferredSize(final javax.swing.JComponent c) {
    return com.alee.painter.PainterSupport.getPreferredSize(c, super.getPreferredSize(c), painter);
}