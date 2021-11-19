private void updatePlan() {
    planElem.recalculateManeuverPositions(renderer);
    planElem.paint(((java.awt.Graphics2D) (renderer.getGraphics().create())), renderer);
    renderer.repaint();
}