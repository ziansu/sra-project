@java.lang.Override
public boolean undo() {
    level.getBoard().addHexomino(new java.awt.Point(srcAnchorRow, srcAnchorColumn), hex);
    return true;
}