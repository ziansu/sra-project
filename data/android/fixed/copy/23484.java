@java.lang.Override
public boolean hasCompleted() {
    if (((this.currentDTDistanceLeft) <= (this.desiredDTDistanceLeft)) && ((this.currentDTDistanceRight) <= (this.desiredDTDistanceRight))) {
        return true;
    }else {
        return false;
    }
}