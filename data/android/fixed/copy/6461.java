@java.lang.Override
public void visitWater(com.wecanteven.Visitors.Water water) {
    this.setCanMove(false);
    visitedCurrent = false;
}