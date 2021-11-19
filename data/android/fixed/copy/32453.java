public void setOwnPlayer(com.github.fishio.PlayerFish player) {
    this.playerFishProperty.set(player);
    if (getEntities().contains(player)) {
        remove(player);
    }
    add(player);
}