public void upgradePlayerDamage() {
    Main.app.getWorld().getPlayer().increaseDamage();
    reloadEndWavePopup();
}