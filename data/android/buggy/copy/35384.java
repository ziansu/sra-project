@java.lang.Override
public void resetTask() {
    java.lang.System.out.println("EntityAIHoldAndShoot: resetting");
    this.attackTarget = null;
    this.attackIntervalCounter = 0;
    this.outOfRangeCounter = 0;
}