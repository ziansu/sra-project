@java.lang.Override
public void run() {
    java.lang.Object element = mDocument.getObjectIdMapper().getObjectForId(request.nodeId);
    if (element != null) {
        mDocument.getDOMProvider().highlightElement(element, contentColor.getColor());
    }
}