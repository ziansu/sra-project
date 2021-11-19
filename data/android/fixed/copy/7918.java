@java.lang.Override
protected void doPaint(java.awt.Graphics g) {
    drawMapElements(g);
    drawBuildings(g);
    drawOtherTrainers(g);
    drawTrainer(g);
}