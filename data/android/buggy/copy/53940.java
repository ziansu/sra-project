@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent e) {
    java.lang.System.out.println(("Teste aquii size" + (polygon.size())));
    polygon.add(new uwo.hci.core.Point(e.getX(), e.getY()));
}