@java.lang.Override
public void mouseReleased(java.awt.event.MouseEvent arg0) {
    if ((this.board) == null) {
        throw new java.lang.Error("null board");
    }
    this.setBackground(onClickColor);
    this.board.pressed(this);
}