@java.lang.Override
public void removeNode(N node) {
    super.removeNode(node);
    if ((listenerList) != null) {
        org.corpus_tools.salt.extensions.notification.graph.impl.NotifierHelper.notify(listenerList, Listener.NOTIFICATION_TYPE.REMOVE, GRAPH_ATTRIBUTES.LAYER_NODES, node, null, this);
    }
}