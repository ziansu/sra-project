@java.lang.Override
public void mouseDoubleClick(org.eclipse.swt.events.MouseEvent e) {
    org.eclipse.swt.widgets.TreeItem item = tree.getItem(new org.eclipse.swt.graphics.Point(e.x, e.y));
    editValue(item);
}