@java.lang.Override
public void paint(java.awt.Graphics2D g, org.openstreetmap.josm.gui.MapView mv, org.openstreetmap.josm.data.Bounds box) {
    org.openstreetmap.josm.data.osm.visitor.paint.Rendering painter = org.openstreetmap.josm.data.osm.visitor.paint.MapRendererFactory.getInstance().createActiveRenderer(g, mv, false);
    painter.render(data, false, box);
}