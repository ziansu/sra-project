@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    checkEatFood();
    move();
    checkHitWall();
    checkHitSelf();
    panel.refresh();
}