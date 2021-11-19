public boolean toggleVertexSelection(graphgui.Vertex vertex) {
    if (vertex == (graphgui.State.getState().getSelectedVertex())) {
        deselectVertex();
        return false;
    }else {
        selectVertex(vertex);
        return true;
    }
}