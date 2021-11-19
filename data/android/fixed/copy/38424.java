@java.lang.Override
public void move(java.awt.Graphics2D g2d) {
    moveCheckBorders();
    moveCheckInnerWalls();
    g2d.drawImage(enemypic, enemyx, enemyy, blockSize, blockSize, null);
}