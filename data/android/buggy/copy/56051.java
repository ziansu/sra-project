@java.lang.SuppressWarnings(value = "unchecked")
public void reset(S newBoard) {
    java.awt.Graphics2D g = panel.getGraphics();
    state = ((S) (newBoard.copy()));
    renderBoard(g, newBoard);
}