public void toggleVertexSelection(graphgui.Vertex vertex) {
    if (vertex == (graphgui.State.getState().getSelectedVertex())) {
        deselectVertex();
    }else {
        selectVertex(vertex);
    }
}