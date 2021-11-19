public void healPlayer(int heal) {
    if ((heal + (this.health)) < (entities.EntityPlayer.baseHealth)) {
        this.health = (this.health) + heal;
    }
}