@java.lang.Override
public void onNodeDragEnd(final com.ait.lienzo.client.core.shape.wires.NodeDragEndEvent event) {
    doResize(AbstractWiresEvent.Type.END, index, event.getDragContext());
    getMagnets().shapeMoved();
}