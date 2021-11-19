@java.lang.Override
public void mouseDragged(java.awt.event.MouseEvent e) {
    if (((vertex) == null) || (!((canvas) instanceof de.bund.bfr.knime.gis.views.canvas.GisCanvas))) {
        super.mouseDragged(e);
    }
}