public boolean canJump() {
    if (((state) == (com.retroMachines.game.gameelements.RetroMan.State.JUMPING)) || ((state) == (com.retroMachines.game.gameelements.RetroMan.State.JUMPINGE))) {
        return false;
    }
    return true;
}