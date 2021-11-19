public void undrawPiece(int x, int y) {
    javafx.scene.Node rm = getNodeFromGridPane(virtual_board, x, y);
    virtual_board.getChildren().removeAll(rm);
    virtual_board.setVisible(false);
    virtual_board.setVisible(true);
}