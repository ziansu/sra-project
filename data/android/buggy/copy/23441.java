private void setTimeStart(com.mygdx.game.screens.Player player) {
    if (((timeLimitStart) == 0) && ((getExistingDoors().size) >= 10)) {
        timeLimitStart = com.badlogic.gdx.utils.TimeUtils.millis();
    }
}