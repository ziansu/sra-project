@java.lang.Override
public int getNoCollisionPercentage() {
    if ((size) == 0) {
        return 100;
    }
    return ((int) ((((size) - (collisionInfo.collisionCnt)) * 100) / (size)));
}