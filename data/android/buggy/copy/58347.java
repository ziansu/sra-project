@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    instanceGame.getPlay().moveSnake("Up");
    valueSpeed(instanceGame.getPlay().getScore());
    instanceGame.getScheduler().startBonus();
}