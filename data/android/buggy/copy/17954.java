public void revert() {
    if ((player) == null) {
        com.projectkorra.ProjectKorra.Flight.instances.remove(player);
        return ;
    }
    player.setAllowFlight(couldFly);
    player.setFlying(wasFlying);
}