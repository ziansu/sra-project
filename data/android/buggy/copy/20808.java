@java.lang.Override
public void onNodeMouseClick(org.roger600.lienzo.client.NodeMouseClickEvent event) {
    com.google.gwt.core.client.GWT.log("Moving path...");
    m_multi.setX(500).setY(500);
    layer.batch();
}