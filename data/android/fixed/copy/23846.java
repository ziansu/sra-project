@java.lang.Override
public void run() {
    java.lang.Object element = mDocument.getObjectForId(request.nodeId);
    if (element != null) {
        mDocument.highlightElement(element, contentColor.getColor());
    }
}