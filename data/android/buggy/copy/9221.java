public void removeEffects() {
    player.removePotionEffect(region.getType());
    player.sendMessage(("Removed EFFECTS inside of " + (region.getName())));
}