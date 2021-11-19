public void setFlow(edmondskarp.Gui.Arrow arrow, int flow) {
    saveState();
    arrow.getEdge().setFlow(flow);
    arrow.getEdge().getInverse().setFlow((-flow));
}