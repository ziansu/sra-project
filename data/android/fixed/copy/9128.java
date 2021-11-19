@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    if ((de.tucottbus.kt.drakon.DRAKON.drakonChart.getScale()) > 0.2F) {
        de.tucottbus.kt.drakon.DRAKON.drakonChart.setScale(((de.tucottbus.kt.drakon.DRAKON.drakonChart.getScale()) - 0.1F));
        de.tucottbus.kt.drakon.DRAKON.drakonChart.pack();
    }
}