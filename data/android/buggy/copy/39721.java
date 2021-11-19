@java.lang.Override
public boolean takeControl() {
    if (((Robot.currCell.getCol()) == 7) && ((Robot.currCell.getRow()) == 4)) {
        Robot.returnToStart();
        return false;
    }
    return true;
}