@java.lang.Override
public void paint(final java.awt.Graphics2D g, final org.openstreetmap.josm.gui.MapView mv, final org.openstreetmap.josm.data.Bounds box) {
    final org.openstreetmap.josm.data.osm.visitor.paint.Rendering painter = org.openstreetmap.josm.data.osm.visitor.paint.MapRendererFactory.getInstance().createActiveRenderer(g, mv, false);
    painter.render(this.data, false, box);
}