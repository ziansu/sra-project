public com.goblet.gameEngine.Box getAttackHitbox() {
    switch (currentAttackDirection) {
        default :
        case DOWN :
        case UP :
            return VerticalAttack;
        case RIGHT :
        case LEFT :
            return HorizontalAttack;
    }
}